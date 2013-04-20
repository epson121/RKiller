package com.agame.rkiller;

import android.util.Log;

import com.agame.framework.Game;
import com.agame.framework.Graphics;
import com.agame.framework.Graphics.ImageFormat;
import com.agame.framework.Screen;

public class LoadingScreen extends Screen {

	public LoadingScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		Log.d("APP", "LoadingScreen1");
		Graphics g = game.getGraphics();
		Assets.menu = g.newImage("menu.jpg", ImageFormat.RGB565);
		Assets.background = g.newImage("background.jpg", ImageFormat.RGB565);
		Assets.character_alive = g.newImage("roach.png", ImageFormat.RGB565);
		//Assets.character_dead = g.newImage("roach", ImageFormat.RGB565);
		Assets.kill = game.getAudio().createSound("stomp.mp3");
		Log.d("APP", "LoadingScreen2");
		game.setScreen(new MainMenuScreen(game));
	}

	@Override
	public void paint(float deltaTime) {
		Graphics g = game.getGraphics();
        g.drawImage(Assets.splash, 0, 0);
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void backButton() {

	}

}
