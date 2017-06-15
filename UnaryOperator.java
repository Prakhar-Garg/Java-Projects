//A program on unary operator

class UnaryOperator{
	public static void main(String args[]){
		int a=5,b=6,c;
		c=++a*b--+a--*++b/--a;
		System.out.println("a="+a+","+"b="+b+","+"c="+c);
		
		a=5;
		b=6;
		c=++a*b+++a--*++b;
		System.out.println("a="+a+","+"b="+b+","+"c="+c);
	}
}