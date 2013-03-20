package com.bm.jeu.net.helpers;

import com.bm.jeu.net.NettyClient;

public class NetworkTester{

	/**
	 * @param args
	 */
	
	//TODO: write some ACTUALLY useful testing stuff, maybe after a redesigning phase
	public static void main(String[] args) {
		int size = 10000;
		
		NettyClient[] tester = {new NettyClient("localhost", 4313),new NettyClient("localhost", 4313),new NettyClient("localhost", 4313)};
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Component comp = new Component(1, "Test Compontent1");
		System.out.println("component");
		System.out.println("tester");
		for(NettyClient con : tester){
			con.connect();
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("connect");
		
		for(int i=0;i<size;i++){
			for(NettyClient out : tester){
				out.write(comp);
			}
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(NettyClient dis : tester){
			dis.disconnect();
		}

	}

}
