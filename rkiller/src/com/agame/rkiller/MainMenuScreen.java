package com.agame.rkiller;

import java.util.List;

import android.util.Log;

import com.agame.framework.Game;
import com.agame.framework.Graphics;
import com.agame.framework.Input.TouchEvent;
import com.agame.framework.Screen;

public class MainMenuScreen extends Screen {

	public MainMenuScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		Log.d("APP", "MainMenuScreen1");
		Graphics g = game.getGraphics();
        List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
        
        int len = touchEvents.size();
        for (int i = 0; i < len; i++) {
            TouchEvent event = touchEvents.get(i);
            if (event.type == TouchEvent.TOUCH_UP) {
            	Log.d("APP", "MainMenuScreen2");
            	game.setScreen(new GameScreen(game));
            }
        }
	}
	
	@Override
	public void paint(float deltaTime) {
		Graphics g = game.getGraphics();
        g.drawImage(Assets.menu, 0, 0);
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
		android.os.Process.killProcess(android.os.Process.myPid());
	}

}
