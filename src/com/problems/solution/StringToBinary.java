package com.problems.solution;

public class StringToBinary {
	/**
	 * This function takes a string as a parameter and converts it to binary code
	 * 
	 * @param string The string to be converted to binary code
	 * @return The binary code of the input string
	 */
	public String getBinary(String str) {
		char[] charecters = str.toCharArray();
		StringBuilder result = new StringBuilder();
		int num = 0;
		if (str.length() != 0) {
			//System.out.println("Not Have String Data");
			
			/*for (int i = 0; i < charecters.length; i++) {
				num = getDecimal(charecters[i]);
				for (int j = 0; j < 8; j++) {
					if (num % 2 == 0) {
						result.insert(i, 0);
					} else {
						result.insert(i, 1);
					}
					num = (num / 2);
				}
				result.append(" ");
			}

			return result.toString();*/
			for (int i = 0; i < charecters.length; i++) {
				num = getDecimal(charecters[i]);
				for (int j = 0; j < 8; j++) {
					System.out.println("j:" + j + " Current number? " + num + " remainder is " + num % 2);
					result.insert(i * 9, (num %2 == 0) ? 0 : 1);
					num = (int) (num >> 1);
				}
				if (i<charecters.length-1) {
					result.insert(8 * (i+1)+i, " ");
				}
			}
		}
		
		return result.toString();
	}

	/**
	 * This function gets the decimal number of a character
	 * 
	 * @param character The character that we want the decimal value of
	 * @return The decimal of the character from the ascii table
	 */
	private int getDecimal(char ch) {
		/*for (int i = 0; i <= 255; i++) {
			if (ch == (char) i) {
				return i;
			}
		}
		return -1;*/
		return ch;
	}

	public static void main(String[] args) {
		StringToBinary strToBinary = new StringToBinary();
		String str = "X";
		if (str.length() !=0) {
			System.out.println("Binary code for "+str+": "+strToBinary.getBinary(str));
		}else {
			System.out.println("empty data");
		}
		
		// System.out.println(Integer.toBinaryString(12));
		
	}

}
