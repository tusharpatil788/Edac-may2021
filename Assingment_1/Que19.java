import java.util.Scanner;
public class Que19
{
public static void main(String args[])
{
 int dec_num,quot,i=1,j;
 int bin[]=new int[100];
 Scanner sc=new Scanner(System.in);

 System.out.println("Decimal No:");
 dec_num = sc.nextInt();

 quot = dec_num;
 
  while(quot !=0)
{
 bin[i++]=quot%2;
 quot=quot/2;
}

System.out.println("Binary No:");
for(j=i-1;j>0;j--)
{
  System.out.print(bin[j]);
}
}

}