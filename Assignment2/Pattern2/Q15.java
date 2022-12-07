
public class Q15
{
public static void main(String[] args)
{


for (int m = 1; m <= 5; m++)
{
for (int n=1; n<=m; n++)
{
if( n == 1 || n == m || m == 5)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}