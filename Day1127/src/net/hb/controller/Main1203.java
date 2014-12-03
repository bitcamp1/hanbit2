package net.hb.controller;

import net.hb.model.Grade;

public class Main1203 {
	public static void main(String[] args) {
		Grade gr = new Grade();
		int kor = 78;
		int eng = 92;
		gr.setSum(kor,eng);
		gr.setAvg(gr.getSum());
		//gr.setAvg(avg);
	}
}
