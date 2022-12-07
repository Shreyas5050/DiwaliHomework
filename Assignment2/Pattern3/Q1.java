
 
public class Q1
{
    public static void main(String[] args)
    {
        
 
        int rowCount = 1;
 
        
 
        for (int i = 9; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
 
            //Printing 'rowCount' value 'rowCount' times at the end of each row
 
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }
 
            System.out.println();
 
            //Incrementing the rowCount
 
            rowCount++;
        }
    }
}