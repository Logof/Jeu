package com.bm.jeu.net;

import java.util.concurrent.atomic.AtomicInteger;

import com.bm.jeu.net.helpers.Component;
import com.bm.jeu.net.helpers.ComponentRecievedListener;
import com.bm.jeu.net.helpers.TestComponent;

public class NetworkTester implements ComponentRecievedListener, Runnable {

	private int clnr;
	private int msgnr;
	private Component test;
	private NettyClient[] clients;
	private boolean finished = false;
	private AtomicInteger messagesRecieved = new AtomicInteger(0);

	public NetworkTester(int clientsnr, int messages, String host, int port) {
		ComponentRecievedHandler.registerDataChangeListener(this);
		this.clnr = clientsnr;
		this.msgnr = messages;

		//this component will, when encoded, use 256 byte on the stream. a good value to calculate traffic
		setComponent(new TestComponent("Level1", (float)1.2, (float)2.3));

		this.clients = new NettyClient[clientsnr];
		for (int i = 0; i < clnr; i++) {
			clients[i] = new NettyClient(host, port);
		}
	}

	public void connectAll() {
		for (NettyClient cl : clients) {
			cl.connect();
		}
		boolean allConnected = false;
		while (!allConnected) {
			allConnected = true;
			for (NettyClient cl : clients) {
				if (!cl.isConnected()) {
					allConnected = false;
				}
			}
		}
	}

	public void disconnectAll() {
		for (NettyClient cl : clients) {
			cl.disconnect();
		}
		boolean alldisonnected = false;
		while (!alldisonnected) {
			alldisonnected = true;
			for (NettyClient cl : clients) {
				if (cl.isConnected()) {
					alldisonnected = false;
				}
			}
		}
	}

	@Override
	public void componentRecievedEvent(Component event) {
		messagesRecieved.incrementAndGet();
		// TODO Auto-generated method stub
		// System.out.println("erhalten: " + messagesRecieved);
	}

	public Component getComponent() {
		return test;
	}

	public void setComponent(Component test) {
		this.test = test;
	}

	public boolean finished() {
		return finished;
	}

	@Override
	public void run() {
		connectAll();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < msgnr; i++) {

			for (NettyClient cl : clients) {
				cl.send(test);
			}
		}
		boolean checkbuffer = true;
		while (checkbuffer) {
			if (this.messagesRecieved.get() >= (this.clnr * this.msgnr)) {
				checkbuffer = false;
				// System.out.println("CHECK"); //I have absolutely NO idea but
				// a syso is needed to exit this loop
			}

		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);
		disconnectAll();
		finished = true;
	}

	public static void main(String args[]) {
		NetworkTester buff = new NetworkTester(1, 10, "localhost", 8080);

		buff.run();

		while (!buff.finished()) {

		}
		System.out.println("DONE");

	}

}
