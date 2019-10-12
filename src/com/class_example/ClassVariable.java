package com.class_example;
/*Code By: 
 * Samad Talukder 
 */
public class ClassVariable {
	
	String hello=new String("Hello");
	
	void sayHello()
	{
		System.out.println(hello);
	}
	
	public static void main(String[] args) {
		// 
		ClassVariable obj=new ClassVariable();
		obj.sayHello();
	}

}
