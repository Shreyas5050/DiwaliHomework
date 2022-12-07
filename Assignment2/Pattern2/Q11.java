class Q11
{
    public static void main(String[] args)
    {
        // number of rows
        final int n = 5;
 
        for (int i = 1; i <= n; i++)
        {
            // print space
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }
 
            // Print star(*) `n` times
            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }
 
            // move to the next row
            System.out.println();
        }
    }
}