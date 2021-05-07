import java.util.Scanner;
public class Que23
{
public static void main(String args[])
{
int hex[]= new int[100];
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
hex[i] = dec % 8;
dec = dec / 8;
i++;
}
System.out.print("Hexadecimnal Value :");
for(j = i-1; j >= 0; j--)
{
if(hex[j] > 9)
{
System.out.print((char)(hex[j] + 55)+"\n");
}
else
{
System.out.print(hex[j]+"\n");
}
}
}
}
