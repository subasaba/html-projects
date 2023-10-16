class ComparisonOperators{
	public static void main(String args[]){
		int x=6;
		int y=10;
		
		// (==) Equal
		
		if(x==y){
			System.out.println("Both x and y are equal");
		}
		else{
			System.out.println("Both x and y are different");
		}
		
		// (!=) NotEqual
		
		if(x!=y){
			System.out.println("Both x and y are notequal");
		}
		else{
			System.out.println("Both x and y are equal");
		}
		
		// (>) Greaterthan
		
		if(x>y){
			System.out.println("x is bigger");
		}
		else{
			System.out.println("y is bigger");
		}
		
		// (<) Lessthan
		
		if(x<y){
			System.out.println("x is smaller");
		}
		else{
			System.out.println("y is smaller");
		}
		
		// (>=) GreaterthanEqualto
		
		if(x>=y){
			System.out.println("x is biggerthan or equal to y");
		}
		else{
			System.out.println("y is bigger");

		}
		
		// (<=) LessthanEqualto
		
		if(x<=y){
			System.out.println("x is smallerthan or equal to y");
		}
		else{
			System.out.println("y is smaller");

		}
	}
}