import java.util.Scanner;
public class Que24
{
public static void main(String args[])
{
int oct[]= new int[100];
int i=1, j=0, rem, dec=0, bin;
Scanner sc= new Scanner(System.in);
System.out.print("Binary No:");
bin = sc.nextInt();
while(bin>0)
{
rem = bin % 2;
dec = dec + rem * i;
i = i*2;
bin = bin / 8;
 }
i = 0;
while(dec != 0)
{
oct[i] = dec % 8;
dec = dec / 8;
i++;
}
System.out.print("Ocatal Value :");
for(j = i-1; j >= 0; j--)
{
if(oct[j] > 9)
{
System.out.print((char)(oct[j] + 55)+"\n");
}
else
{
System.out.print(oct[j]+"\n");
}
}
}
}
