package net.hb.controller;

import net.hb.model.IndexOfEx;
import net.hb.model.Juso;
import net.hb.model.ModifyChars;

public class Main1202 {
	public static void main(String[] args) {
		Main1202 m = new Main1202();
	//	m.arrayTest();
	//	m.indexOfEx();
		m.modifyChars();
	}
	public void modifyChars(){
		ModifyChars mc = new ModifyChars();
		mc.modifyChars();
	}
	
	public void indexOfEx(){
		IndexOfEx iox = new IndexOfEx();
		iox.getIdx();
	}
	
	public void arrayTest() {
		Juso js = new Juso();
		js.arrayTest();
	}
}
