import java.util.Scanner;
public class Que22
{
public static void main(String args[])
{
 ;
Scanner sc = new Scanner(System.in);

System.out.print("Decimal No :");
dec_num = sc.nextInt();
quot = dec_num;

while(quot != 0)
{
   oct_num[i++] = quot % 8;
   quot = quot/8;
}
 System.out.println("Octal No :");
 for(j=i-1; j>0; j--)
{ 
  System.out.print(oct_num[j]);
}
  
}


}