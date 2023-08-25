package aaa.model;

import lombok.Data;

@Data
public class Std {
	
	String name;
	int [] score;
	
	
	public Std(String name, int[] score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
	
	
}
