package com.object;

public class ObjectExample {
	public int a;
	public double b;
	
	public ObjectExample(int first,double second) {
		this.a = first;
		this.b = second;
	}
	public boolean same(ObjectExample object) {
		return object.a == this.a && object.b == this.b;
	}

	public static void main(String[] args) {
		ObjectExample obj1 = new ObjectExample(10, 20.3);
		ObjectExample obj2 = new ObjectExample(10, 30.3);
		ObjectExample obj3 = new ObjectExample(obj1.a, obj2.b);
		System.out.println(obj1.same(obj3));

	}

}
