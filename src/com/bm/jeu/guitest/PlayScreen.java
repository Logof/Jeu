package com.bm.jeu.guitest;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.bm.jeu.common.ef.AnimationComponent;
import com.bm.jeu.common.ef.AnimationMachine;
import com.bm.jeu.common.ef.Entity;
import com.bm.jeu.common.ef.Machine;
import com.bm.jeu.common.ef.MachineManager;
import com.bm.jeu.common.ef.MovementMachine;
import com.bm.jeu.common.ef.PlayerCameraMachine;
import com.bm.jeu.common.ef.PositionComponent;
import com.bm.jeu.common.ef.ResourceManager;
import com.bm.jeu.common.ef.ClientLoader;

public class PlayScreen extends GameScreen<Encore> {

	private FPSLogger fps;
	private Machine relay;
	private OrthographicCamera camera;
	private InputMultiplexer multiplexer;

	Skin skin;
	Texture testbg;

	public PlayScreen(Encore game) {
		super(game);
		fps = new FPSLogger();
		multiplexer = new InputMultiplexer();
		InputMachine input = new InputMachine();
		relay = new RelayMachine();
		MachineManager.getinstance().add(input);
		camera = new OrthographicCamera(800, 480);
		MachineManager.getinstance().add(new PlayerCameraMachine(camera));
		ResourceManager.getinstance().initialize(new ClientLoader());
		multiplexer.addProcessor(input);

		testbg = new Texture(new FileHandle("res/terrain/grass.png"));
		Gdx.input.setInputProcessor(multiplexer);

	}


	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		System.out.println("hiding");
		// spritebatch.dispose();
		clear();

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float arg0) {

		clear();
		camera.update();
		spritebatch.setProjectionMatrix(camera.combined);

		spritebatch.begin();
		spritebatch.draw(testbg, 0, 0);
		for (Entity buff : relay.getEntities()) {
			PositionComponent pos = (PositionComponent) buff.getComponent(PositionComponent.class);
			AnimationComponent anic = (AnimationComponent) buff.getComponent(AnimationComponent.class);
			anic.draw(spritebatch, pos.getPosX(), pos.getPosY(), arg0);
		}
		spritebatch.end();
		MachineManager.getinstance().update(arg0);


		fps.log();
	}

	@Override
	public void resize(int arg0, int arg1) {

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		MachineManager.getinstance().add(new MovementMachine());
		MachineManager.getinstance().add(relay);
		MachineManager.getinstance().add(new AnimationMachine());

		// for(int i=0; i<1;i++){
		// addOne();
		// }
	}

	public void addOne() {

		Entity creator = new Entity();
		ResourceManager.getinstance().load(creator);

	}

}
