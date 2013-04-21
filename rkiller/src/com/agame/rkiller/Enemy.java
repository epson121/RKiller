package com.agame.rkiller;

import android.graphics.Rect;

public class Enemy {
	
	//TODO create setSpeed(speedX, speedY)
	private int speedX, speedY, centerX, centerY, health;
	public Rect rect;
	
	public void update(){
		centerX += speedX;
		centerY += speedY;
		rect.offsetTo(centerX - 25, centerY - 25);
	}
	
	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setCenter(int centerX, int centerY){
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	public void setSpeed(int speedX, int speedY){
		this.speedX = speedX;
		this.speedY = speedY;
	}
	
	public void setRect(int centerX, int centerY){
		rect = new Rect(centerX - 25, centerY - 25, centerX + 25, centerY + 25);
	}
}
