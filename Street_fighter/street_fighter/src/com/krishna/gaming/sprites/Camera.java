package com.krishna.gaming.sprites;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.krishna.gaming.Board;

public class Camera extends Player {
	
	private int moveBlock =0;

	public Camera() {
		x=11;
		y=180;
		w=1400;
		h=900;
		try {
			image = ImageIO.read(Board.class.getResource("bg4.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void move() {
		outofScreen();
		if(moveBlock ==1)
		{
			speed=10;
		}
		else if(moveBlock==2)
		{speed = -10;	}
		
			x = x + speed;
		}
	
	public void outofScreen() {
		if(x<=10)
		{
			moveBlock =1;
		}
		else if(x>=2500-1400)
		{
			moveBlock = 2;
		}
		else {
			moveBlock=0;
		}
	}
	
	
	@Override
	public BufferedImage defaultImage() {
		// TODO Auto-generated method stub
		BufferedImage subImage = image.getSubimage(x, y,w,h );
		return subImage; 
	}
	

}
