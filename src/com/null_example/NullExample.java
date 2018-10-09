package com.null_example;

public class NullExample {
	private static Object obj;
	public static void main(String[] args) {
		/* null is Case sensitive */

		// compile-time error : can't find symbol 'NULL'
		// Object obj = NULL;

		// it runs successfully
		Object ob;
		Object obj = null;
		System.out.println(obj);
		/* Reference Variable value */
		System.out.println("Reference Variable value: "+NullExample.obj);
		/* Type of null */
		// null can be assigned to String
		String str = null;
		// you can assign null to Integer also
		Integer in = null;
		// null can also be assigned to Double
		Double dbl = null;
		// it can also be type casted to Double
		Double cDbl = (Double) null;
		System.out.println("String: "+str);
		System.out.println("Integer: "+in);
		System.out.println("Double: "+dbl);
		System.out.println("Casted to Double: "+cDbl);
		
		

	}

}
