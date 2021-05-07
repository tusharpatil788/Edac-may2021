import java.util.Scanner;
public class Que18
{
public static void main(String[] args)
{ 
  long binary1, binary2,multiply=0;
  int digit, factor=1;
  Scanner in =new Scanner (System.in);
  System.out.print("IFBN:");
  binary1 = in.nextLong();

  System.out.print("ISBN:");
  binary2 = in.nextLong();

  while (binary2 !=0)
{
  digit = (int)(binary2 % 10);
  if (digit == 1)
  {
  binary1  = binary1 * factor;
  multiply = binarymultiplication((int)binary1,(int)multiply);
  }
  else
{ 
  binary1=binary1 * factor;
  }
  binary2 = binary2 /10;
  factor =10;
}
System.out.print("Multiplication of two no:" + multiply);
}
static int binarymultiplication(int binary1,int binary2)
{
 int i =0, remainder=0;
 int[]sum= new int[20];
 int binary_multi_result =0;

 while (binary1 !=0 || binary2 !=0)
{
  sum[i++]= (binary1 % 10 + binary2 % 10 + remainder) % 2; 
  remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2; 
  binary1 = binary1/10;
  binary2 = binary2/10;
}
 if(remainder != 0)
{
  sum[i++] = remainder;
}
--i;
while (i>=0)
{
  binary_multi_result = binary_multi_result * 10 + sum[i--];
}


return binary_multi_result;
  
}

}	