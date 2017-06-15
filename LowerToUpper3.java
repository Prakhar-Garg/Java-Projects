// Conversion of lower case to upper case using Scanner class
											

import java.util.Scanner;				
class LowerToUpper3{
	public static void main(String args[]){
		System.out.println("enter a Character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>=97&&ch<=122){
			ch=(char)(ch-32);
			System.out.println("Lower case is converted to upper case:-"+ch);
		}
		else if(ch>=65&&ch<=90){
			ch=ch;
			System.out.println("The character is already in Upper Case:-"+ch);
		}
		else{
		System.out.println("invalid character");
		}
		System.out.println("this is the result");
	}
}