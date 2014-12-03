package net.hb.model;

import java.text.DecimalFormat;

public class Grade {
	private int sum;
	private double avg;
	private char grade;
	public int getSum() {
		return sum;
	}
	public void setSum(int a, int b) {
		this.sum = a + b;
	}
	public double getAvg() {
		
		return avg;
	}
	public void setAvg(int sum) {
		DecimalFormat df = new DecimalFormat();
		double avg = sum/2;
		avg  = Double.parseDouble(df.format("0.0"));
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(double avg) {
		int intAvg = (int)getAvg();
		char grade;
		switch (intAvg){
		case 9 : grade = 'A';
		case 8 : grade = 'B';
		case 7 : grade = 'C';
		case 6 : grade = 'D';
		case 5 : grade = 'E';
		default : grade = 'F';
		}
		System.out.println("학점은 "+ grade + "입니다.");
		
		
	}
	
	
}
