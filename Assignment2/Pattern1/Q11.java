public class Q11
{    
public static void main(String args[])   
{    
 
int i, j;         
for (i=0; i<9; i++)   
{  
    
for (j=9-i; j>1; j--)   
{  

System.out.print(" ");   
}   

for (j=0; j<=i; j++ )   
{   
//prints star      
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
}  