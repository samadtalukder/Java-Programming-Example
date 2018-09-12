package com.enumtype;

public class EnumConstructorExample {

	public static void main(String[] args) {
		//let's print name of each enum and there action
	      // - Enum values() examples
		EnumConstructor[] enumConst = EnumConstructor.values();
		for(EnumConstructor enCon : enumConst) {
			System.out.println("Name: "+enCon.name()+" action: "+enCon.getAction());
		}

	}

}
