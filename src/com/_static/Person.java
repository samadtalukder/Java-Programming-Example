package com._static;
public class Person{
		public static int InstanceCount;
		public int LocalCount;
		
		public Person() {
			InstanceCount++;
			LocalCount++;
		}
		
}
