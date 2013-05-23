package com.bm.jeu.guitest;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.FocusListener;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
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

public class PlayScreen extends GameScreen<Tester> {

	private FPSLogger fps;
	private Machine relay;
	private OrthographicCamera camera;
	private OrthographicCamera gui;
	private InputMultiplexer multiplexer;

	Skin skin;
	Stage stage;
	Texture testbg;

	public PlayScreen(Tester game) {
		super(game);
		fps = new FPSLogger();
		multiplexer = new InputMultiplexer();
		InputMachine input = new InputMachine();
		relay = new RelayMachine();
		MachineManager.getinstance().add(input);
		camera = new OrthographicCamera(800, 480);
		MachineManager.getinstance().add(new PlayerCameraMachine(camera));
		gui = new OrthographicCamera(800, 480);
		gui.position.set(800 / 2, 480 / 2, 0);
		ResourceManager.getinstance().initialize(new ClientLoader());
		multiplexer.addProcessor(input);

		testbg = new Texture(new FileHandle("res/terrain/grass.png"));
		test();
		multiplexer.addProcessor(stage);
		Gdx.input.setInputProcessor(multiplexer);

	}

	public void test() {
		stage = new Stage(gui.viewportWidth, gui.viewportWidth, true, spritebatch);

		// A skin can be loaded via JSON or defined programmatically, either is
		// fine. Using a skin is optional but strongly
		// recommended solely for the convenience of getting a texture, region,
		// etc as a drawable, tinted drawable, etc.
		skin = new Skin();

		// Generate a 1x1 white texture and store it in the skin named "white".
		Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
		pixmap.setColor(Color.WHITE);
		pixmap.fill();
		skin.add("white", new Texture(pixmap));

		// Store the default libgdx font under the name "default".
		skin.add("default", new BitmapFont());

		// Configure a TextButtonStyle and name it "default". Skin resources are
		// stored by type, so this doesn't overwrite the font.
		TextButtonStyle textButtonStyle = new TextButtonStyle();
		textButtonStyle.up = skin.newDrawable("white", Color.DARK_GRAY);
		textButtonStyle.down = skin.newDrawable("white", Color.DARK_GRAY);
		textButtonStyle.checked = skin.newDrawable("white", Color.BLUE);
		textButtonStyle.over = skin.newDrawable("white", Color.LIGHT_GRAY);
		textButtonStyle.font = skin.getFont("default");
		skin.add("default", textButtonStyle);

		// Create a table that fills the screen. Everything else will go inside
		// this table.
		Table table = new Table();
		table.setColor(Color.GREEN);
		table.setFillParent(true);
		stage.addActor(table);

		// Create a button with the "default" TextButtonStyle. A 3rd parameter
		// can be used to specify a name other than "default".
		final TextButton button = new TextButton("Click me!", skin);
		table.add(button);
		table.bottom().left();

		// Add a listener to the button. ChangeListener is fired when the
		// button's checked state changes, eg when clicked,
		// Button#setChecked() is called, via a key press, etc. If the
		// event.cancel() is called, the checked state will be reverted.
		// ClickListener could have been used, but would only fire when clicked.
		// Also, canceling a ClickListener event won't
		// revert the checked state.
		button.addListener(new ChangeListener() {
			@Override
			public void changed(ChangeEvent event, Actor actor) {
				button.setText("Good job!");
				stage.setKeyboardFocus(null);
			}
		});

		// Add an image actor. Have to set the size, else it would be the size
		// of the drawable (which is the 1x1 texture).
		TextFieldStyle tfs = new TextFieldStyle();
		tfs.font = new BitmapFont();
		tfs.fontColor = Color.WHITE;
		

		skin.add("default", tfs);
		final TextField textin = new TextField("user", tfs);
		final TextField textin2 = new TextField("pw", tfs);
		textin2.setPasswordMode(true);
		textin2.setPasswordCharacter('*');
		table.add(textin);
		table.add(textin2);
		table.debug();
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
		// camera.update();
		// camera.apply(Gdx.graphics.getGL10());
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

		stage.setCamera(gui);
		MachineManager.getinstance().update(arg0);
		stage.act();
		stage.draw();

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
