//Program to convert lower case chracter to upper case

class LowerToUpper{
	public static void main(String args[]){
		char ch='e';
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