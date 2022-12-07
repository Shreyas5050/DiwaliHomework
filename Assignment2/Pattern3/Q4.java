
 
public class Q4
{
    public static void main(String[] args)
    {
        
 
        int rowCount = 1;
 
        
 
        for (int i = 9; i > 0; i--)
        {
            
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            //Printing j value where j value will be from 1 to rowCount
 
            for (int j = 1; j <= rowCount; j++)          
            {
                System.out.print(j+" ");
            }
 
            //Printing j value where j value will be from rowCount-1 to 1
             
            for (int j = rowCount-1; j >= 1; j--)
            {               
                System.out.print(j+" ");            
            }                       
             
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
    }
}