package com.agame.rkiller;

import com.agame.framework.Image;
import com.agame.framework.Music;
import com.agame.framework.Sound;

public class Assets {

	public static Image splash, menu, background, character_alive, character_dead;
	public static Sound kill;
	public static Music theme;
	
	public static void load(RKiller game){
		theme = game.getAudio().createMusic("menutheme.mp3");
		theme.setLooping(true);
		theme.setVolume(0.85f);
		theme.play();
	}
	
}
