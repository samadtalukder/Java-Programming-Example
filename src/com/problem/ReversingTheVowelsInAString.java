package com.problem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* Input:First line of the input file contains an integer T denoting the number of test cases. Then T test cases follow. Each test case has a single line containing a string.
 * Output:Corresponding to each test case, output the string with vowels reversed.
 * Example:
 * 
 * Input: 4
 * geeksforgeeks
 * practice
 * wannacry
 * ransomware
 * 
 * Output:
 * 
 * geeksforgeeks
 * prectica
 * wannacry
 * rensamwora
 *
 */
public class ReversingTheVowelsInAString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i=0;i<num;i++) {
			String str = in.next();
			System.out.println(reverseVowel(str));
		}
		
	}

	private static String reverseVowel(String str) {
		List<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		List<Character> values = new ArrayList<>();
		List<Integer> keys = new ArrayList<>();
		for(int i = 0; i<str.length();i++) {
			if (vowels.contains(str.charAt(i))) {
				keys.add(i);
				values.add(str.charAt(i));
			}
		}
		StringBuffer strBuff = new StringBuffer(str);
		Collections.reverse(values);
		int count = 0;
		for (Integer integer : keys) {
			strBuff.replace(integer.intValue(),integer.intValue()+1, String.valueOf(values.get(count)));
			count++;
		}
		return strBuff.toString();
	}

}
