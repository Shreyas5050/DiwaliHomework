
public class Q7{
public static void main(String args[]){

System.out.println("");
for (int i=9; i>=1; i--){
  for (int j=0; j<=9-i; j++){
  System.out.print(" ");
  }//print space
 int count=0;
while(count != (2*i-1)){
  System.out.print(i+"");  
count++;  
}                                               
System.out.println();
}
                                                   
}
}