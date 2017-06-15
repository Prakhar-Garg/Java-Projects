//A program on assignment operator

class AssignmentOpr{
	public static void main(String args[]){
		int a,b,c,d,e;
		a=5;
		b=6;
		c=10;
		d=40;
		e=25;
		System.out.println(a+=3);	//8  In this we perform two operation; first we add then we assign
		System.out.println(a);		//8		hence both value are same.
		System.out.println(b-=2);	//4		SIMILARLY IN THE FOLLOWING CASES WE FIRST PERFORM ARITHMETIC OPERATION AND THEN ASSIGN THE VALUE TO VARIABLE 
		System.out.println(b);		//4
		System.out.println(c*=3);	//30
		System.out.println(c);		//30
		System.out.println(d/=4);	//10
		System.out.println(d);		//10
		System.out.println(e%=2);	//1
		System.out.println(e);		//1
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
	}
}