import java.util.Scanner;
public class Que22
{
public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  long binarynumber,decimalnumber=0,j=1,remainder;
  System.out.print("Binarynumber :");
  binarynumber = sc.nextLong();
  

while(binarynumber != 0)
{
  remainder = binarynumber % 10;
  decimalnumber = decimalnumber + remainder * j;
  j = j*2;
  binarynumber = binarynumber/10;
}
 System.out.println("Decimal No :"+ decimalnumber);
 
}
  
}


