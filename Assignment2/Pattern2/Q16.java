class Q16{
	public static void main(String args[]){
		
		for(int i=1; i<=5; i++){
			
			for(int k=5-1; k>=i; k--){
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
				
				if(j==1 || j==i)
					System.out.print("*");
				else if(i==5)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}