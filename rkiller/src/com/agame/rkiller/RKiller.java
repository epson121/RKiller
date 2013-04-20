package com.agame.rkiller;

import com.agame.framework.Screen;
import com.agame.framework.impl.AndroidGame;

public class RKiller extends AndroidGame {
	
	private boolean firstTimeCreated = true;
	
	@Override
	public Screen getInitScreen() {
		if (firstTimeCreated){
			Assets.load(this);
			firstTimeCreated = false;
		}
		
		return new SplashLoadingScreen(this);
	}
	
	@Override
	public void onBackPressed() {
		getCurrentScreen().backButton();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Assets.theme.play();
	}
	
	
	@Override
	protected void onPause() {
		super.onPause();
		Assets.theme.pause();
	}
}
