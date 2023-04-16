package com.krishna.gaming.sprites;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Power extends Player {
	
	private String playerNmae;
	
	
	public Power(int x, String playerName) {
		this.x=x;
		y=50;
		h=50;
		w=Max_HEALTH;
		health = Max_HEALTH;
		this.playerNmae = playerName;
	}

	public void setHealth() {
		health = health - (int)(Max_HEALTH*0.10);
	}
	
	@Override
	public BufferedImage defaultImage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void printBox(Graphics pen)
	{
		pen.setColor(Color.RED);
		pen.fillRect(x,y,w,h);
		pen.setColor(Color.GREEN);
		pen.fillRect(x,y,health,h);
		pen.setColor(Color.DARK_GRAY);
		pen.setFont(new Font("times", Font.BOLD,30));
		pen.drawString(playerNmae, x, y+h+30);
		
	}	
	
}
