package Assignments10_5_2026;

import java.util.Scanner;

public class CountVowelsConsonants {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Text");
		String text=sc.nextLine().toLowerCase();
		int VowelCount=0;
		int ConsonatCount=0;
		
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
			if(Character.isLetter(ch)) {
			if("aeiou".indexOf(ch)!=-1) {
				VowelCount++;
			}else {
				ConsonatCount++;
			}
			}
			
		}
		System.out.println("Vowels="+VowelCount);
		System.out.println("consonant="+ConsonatCount);
		}
}
