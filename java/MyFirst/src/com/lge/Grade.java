package com.lge;

public class Grade {
	public String evaluate(int score) {
		if(score >= 65 && score <= 70) return "A";
		if(score >= 50 && score < 65) return "B";
		if(score >= 30 && score < 50) return "C";
		if(score >= 00 && score < 30) return "D";
		
		return "error";
	}
}
