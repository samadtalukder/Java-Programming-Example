package com.string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringToList {

	public static void main(String[] args) {
		// The list is partly Unmodifiable
		List<String> listStr = Arrays.asList(new String[] {"C++","Java"});
		System.out.println(listStr);
		// The list is partly Modifiable
		List<String> listStr2 = new ArrayList<String>(Arrays.asList(new String[] {"Php","MySql"}));
		System.out.println(listStr2);
		// 
		

	}

}
