package com.inner.class_;
/*
 * Created by Samad Talukder 
 */
public class OuterClass {
	class InnerClass {
		public int x;
		private int y;
		protected int z;
		int w;

		public int getY() {
			return this.y;
		}

		@Override
		public String toString() {
			return "W: "+w+" X: "+x+" Y: "+y+" Z: "+z;
		}

		public void display() {
			System.out.println("Nested Class Method");
		}
	}

	public static void main(String[] args) {
		OuterClass.InnerClass ns = new OuterClass().new InnerClass();
		ns.w = 10;
		ns.x = 20;
		ns.y = 30;
		ns.z = 40;
		ns.display();
		System.out.println(ns);

	}

}
