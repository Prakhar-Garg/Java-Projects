//A prorgram on conversion
class Converssion{
	public static void main(String args[]){
		//DECIMAL TO BINARY
		System.out.println(Integer.toBinaryString(25));
		//DECIMAL TO OCTAL
		System.out.println(Integer.toOctalString(25));
		//DECIMAL TO HEXADECIMAL
		System.out.println(Integer.toHexString(25));
		//BINARY TO DECIMAL
		System.out.println(0b11001);
		//OCTAL TO DECIMAL
		System.out.println(031);
		//HEXADECIMAL TO DECIMAL
		System.out.println(0x19);
		//BINARY TO OCTAL
	    System.out.println(Integer.toOctalString(0b11001));
	    //BINARY TO HEXADECIMAL
	    System.out.println(Integer.toHexString(0b11001));
	    //OCTAL TO HEXADECIMAL
	    System.out.println(Integer.toHexString(031));
	}
}