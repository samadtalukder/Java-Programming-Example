package com.abstraction.static_abstract;

public class StaticAbstractMain extends StaticAbstract{

	public static void main(String[] args) {
		StaticAbstractMain sta = new StaticAbstractMain();
		sta.StaticMethod();
		StaticAbstractMain.StaticMethod();
		StaticAbstract.StaticMethod();

	}

}
