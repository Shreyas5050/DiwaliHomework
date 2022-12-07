import java.util.*;



class Sorting{
	static void bsort(int a1[])
	{
	int n =a1.length;
	for(int i=0;i<n-1;i++)//pass
	{
		for(int j=0;j<n-i-1;j++)//internal iterations
		{
			if(a1[j] > a1[j+1])
			{
				//exchange
				int temp = a1[j];
				a1[j]=a1[j+1];
				a1[j+1]=temp;
				
			}
			
				//display(a1);
				//System.out.println();
				
		
		}
		
	}
	}
	
	static void ssort(int a1[])
{
	int n=a1.length;
	for(int i=0;i<n-1;i++)
	{
		int min = i;
		for(int j=i+1;j<n;j++)
		{
			if(a1[j] < a1[min])
				min =j;
		}
		//swapping 
		int temp = a1[min];
		a1[min]=a1[i];
		a1[i]=temp;
	}
		
}

static void isort(int a1[])
{
	int n=a1.length;
	for(int i=1;i<n;++i)
	{
		int key = a1[i];
		int j=i-1;
		
		while(j>=0 && a1[j] > key)
		{
			a1[j+1]=a1[j];
			j=j-1;
		}
		a1[j+1]=key;
			
	}
}


static void mergesort(int a1[],int l, int h)
{
	if(l<h)
	{
		int m=l+(h-l)/2;
		mergesort(a1,l,m);
		mergesort(a1,m+1,h);
		merge(a1,l,m,h);
		
	}

}

static void merge(int a1[],int l, int m, int h)
{
	int n1= m-l+1;
	int n2= h-m;

	int L[]= new int[n1];
	int R[]= new int[n2];

	for(int i=0;i<n1;i++)
		L[i]=a1[l+i];

	for(int j=0;j<n2;j++)
		R[j]=a1[m+1+j];
	

	int i=0,j=0;
	int k=l;
	while(i<n1 && j<n2)
	{
		if(L[i] <= R[j])
		{
			a1[k]=L[i];
			i++;
		}
		else
		{
			a1[k]=R[j];
			j++;
		}
		k++;
	
	}
	while(i<n1)
	{
		a1[k] = L[i];
		i++;
		k++;
	}
	while(j<n2)
	{
		a1[k] = R[j];
		j++;
		k++;
	}
		

}
	
	static void display(int a1[])
	{
		int n =a1.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
	
		
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number of elements you want to store: ");  
		 int n = sc.nextInt();
		 
		 int[] a1 = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{  
			//reading array elements from the user   
			a1[i]=sc.nextInt();  
			}  
			
			System.out.println("Array elements are: ");  
				
			display(a1);
			System.out.println();
		
		
		
		bsort(a1);
		System.out.println("Bubble  sort");
		display(a1);
		System.out.println();
		
		ssort(a1);
		System.out.println("Selection sort");
		display(a1);
		System.out.println();
		
		isort(a1);
		System.out.println("insertion sort");
		display(a1);
		System.out.println();
		
		mergesort(a1,0,n-1);
		System.out.println("Merge sort");
		display(a1);
		System.out.println();
		
		
	}
}
/*
Enter the number of elements you want to store: 7
Enter the elements of the array:
6 4 2 3 5 1 7
Array elements are:
6 4 2 3 5 1 7
Bubble  sort
1 2 3 4 5 6 7
Selection sort
1 2 3 4 5 6 7
insertion sort
1 2 3 4 5 6 7
Merge sort
1 2 3 4 5 6 7
*/