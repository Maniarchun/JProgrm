package com.java.interview;

public class CountVowelConsonantInString {

	private static void subMethod() {
		
		String s = "java progrAm";
		int consonant = 0;
		int vowel = 0;
		int space = 0;
		String l = s.toLowerCase();
		for (int i = 0; i < l.length(); i++) {
			if (l.charAt(i)=='a'||l.charAt(i)=='e'||l.charAt(i)=='i'||l.charAt(i)=='o'||l.charAt(i)=='u') {
				vowel++;
			} else if(l.charAt(i)==' ') {
				space++;
			}else {
				consonant++;
			}
		}
		System.out.println("The number of vowel present in string :"+vowel);
		System.out.println("The number of consonant present in string :"+consonant);
		System.out.println("The number of space present in string :"+space);
	}
	public static void main(String[] args) {
		subMethod();
	}
}
