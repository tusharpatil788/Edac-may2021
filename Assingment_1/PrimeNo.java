import java.util.Scanner;
public class PrimeNo
{
public static void main(String args[])
{
 int n=0;
 int flag =0;
 

 if(n==0||n==1)
 System.out.println(n+" Not prime no :");
else
{
 for(int i=10;i<=n/2;i++)
{
  if(n%i == 0)
{
System.out.println(n+" Not prime no :");
 flag=1;
 
}
if (flag==0)
System.out.println(n+"Prime No:");

}
}
}
}