import java.util.Scanner;
public class Que25
{
public static void main(String args[])
{
long oct_num,dec_num=0;
int i = 0;
Scanner sc= new Scanner(System.in);
System.out.print("Octal No:");
oct_num = sc.nextLong();
while(oct_num != 0)
{
dec_num = (long)(dec_num + (oct_num % 10)* Math.pow(8, i++));
oct_num =oct_num/ 10;
}

System.out.print("Total decimal num :"+ dec_num );

}
}
