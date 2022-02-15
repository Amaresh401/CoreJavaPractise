package com.programming;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Workers implements Man, Women{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Workers w=new Workers();
		w.Name();
		w.Age();
		w.ExtraBenifits();
		name1();
		System.out.println(x);
		
		

	}
	
	static void name1(){
		
	}

	@Override
	public void Name() {
		// TODO Auto-generated method stub
		System.out.println("Amaresh");
	}

	@Override
	public void Age() {
		// TODO Auto-generated method stub
		System.out.println(18);
	}

	@Override
	public void Height() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Weight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Qualities() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ExtraBenifits() {
		// TODO Auto-generated method stub
		
	}

}
