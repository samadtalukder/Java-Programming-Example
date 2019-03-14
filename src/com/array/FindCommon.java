package com.array;

public class FindCommon {
    public static void main(String[] args) {
        String[] str1 = {"H", "U", "B", "K"};
        String[] str2 = {"N", "A", "L"};
        System.out.println(containsCommonItem(str1, str2));
        //containsCommonItem(str1, str2);
    }

    public static boolean containsCommonItem(String[] str1, String[] str2) {
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
