package com.bm.jeu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class AudioHandler {
	private Music music;
	
	public AudioHandler() {
		music = Gdx.audio.newMusic(Gdx.files.internal("sound/pirate.mp3"));
		music.setLooping(true);
	}
	
	public void playBGMusic() {
		music.play();
	}
}
