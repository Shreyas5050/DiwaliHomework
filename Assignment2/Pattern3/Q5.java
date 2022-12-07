
 
public class Q5
{
    public static void main(String[] args)
    {
        
 
        int rowCount = 1;
 
        
 
        for (int i = 9; i >= 1; i--)
        {
            //Printing i*2 spaces at the beginning of each row
 
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            //Printing j where j value will be from i to noOfRows
 
            for (int j = i; j <= 9; j++)          
            {
                System.out.print(j+" ");
            }
 
            //Printing j where j value will be from noOfRows-1 to i
             
            for (int j = 9-1; j >= i; j--)
            {               
                System.out.print(j+" ");            
            }
             
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
    }
}