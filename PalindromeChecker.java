package quizzes;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);	//scanner object
		String str = "START";
		
		while(str.equals("EXIT") == false) {
			System.out.println("Enter a string to see if it is " +	
					"a palindrome or type 'EXIT' to stop: ");
			str = input.nextLine();					//input
			str = str.toUpperCase();				//to ignore uppercase/lowercase
			
			if(str.equals("EXIT") == true) {
				input.close();						//close scanner
			}
			
			else {
				PalindromeChecker test = new PalindromeChecker();	//declare test so it can take string input
				
				String result = test.removeStuff(str); // remove spaces and punctuation from string
				String reverse = test.reverseString(result); //reverses the new string
				
				if(result.equals(reverse)) System.out.println("YES! This is a palindrome!");//compare the two strings
				else System.out.println("NO! This is not a palindrome!");
				}
			}
		
		
		input.close();	//close scanner
			}
	
	
	
	
	public String reverseString(String str) {	//method to reverse string
		StringBuilder sb = new StringBuilder(str);  
		sb.reverse();
		
		 return sb.toString();
		
	}
	
	
	public String removeStuff(String str) {	//method that returns new string without spaces or punctuation
		int len = str.length(), i;
		String test = "!.?,' ";
		String new_str = "";
		
		for(i=0; i<len; i++) {
			char stringAt = str.charAt(i);
			
			if(	//check for punctuation marks and spaces
					stringAt != test.charAt(0) &&
					stringAt != test.charAt(1) &&
					stringAt != test.charAt(2) &&
					stringAt != test.charAt(3) &&
					stringAt != test.charAt(4) &&
					stringAt != test.charAt(5)	
					){
				new_str = new_str + stringAt;
			
			}
		
		}
		
		return new_str;
		
	}
	}
