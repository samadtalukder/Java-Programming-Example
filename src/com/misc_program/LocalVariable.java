package com.misc_program;
/*Code By: 
 * Samad Talukder 
 */
public class LocalVariable {
	void sayHello()
	{
		String hello=new String("Hey");
		System.out.println(hello);
	}
	
	public static void main(String[] args) {
		// 
		LocalVariable obj=new LocalVariable();
		obj.sayHello();
		
	}
	
}
