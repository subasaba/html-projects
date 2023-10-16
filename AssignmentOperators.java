class AssignmentOperators{
	public static void main(String args[]){
		int x=10;
		x+=5;
		System.out.println("Addition:::"+x);
		
		x-=3;
		System.out.println("Subtraction:::"+x);
		
  		x*=2;
		System.out.println("Multiplication:::"+x);
		
		x/=3;
		System.out.println("Division:::"+x);
		
		x%=7;
		System.out.println("Modulus:::"+x);
		
		// Bitwise Operators
		
		int y=6;
		y|=5;
		System.out.println("Bitwise OR:::"+y);
		
		y&=4;
		System.out.println("Bitwise AND:::"+y);
		
		y^=7;
		System.out.println("Bitwise OR:::"+y);	

        y=5;
        System.out.println("complement::"+~y);		
}
}