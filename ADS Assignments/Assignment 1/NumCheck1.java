/*Q2. array of length N
 input a random number x
 and check if it is in the array or not recursively
 
 */ 
 class NumCheck1
 {
	 static boolean check(int arr[],int i,int j,int x)
	 {
		 //int i=0;
		 
		 if(j<i)
			 return false;
	
		if(arr[i]==x && i<arr.length)
			return true;
		return check(arr,i+1,j,x);
		
			 
	 }
	 
	 
	 
	 
	 public static void main(String args[])
	 {
		 int[] arr=new int[3];
		 arr[0]=1;
		 arr[1]=2;
		 arr[2]=3;
		 boolean b=check(arr,0,2,8);
		 if(b)
			 
		 System.out.println(b);
	 
	 else
		 System.out.println("Not found");
	 }
 
 }