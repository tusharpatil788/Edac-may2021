import java.util.Scanner;
public class Que17
{
public static void main(String[] args)
{ 
  System.out.println("add two binary no");
  Scanner scnr = new Scanner(System.in);
  
  System.out.println("b1:");
  String first = scnr.nextLine();

  System.out.println("b2:");
  String second = scnr.nextLine();

  String addition = add(first,second);
  System.out.println("addition of two binary no:"+ addition);

  scnr.close();

} 
 public static String add(String first,String second){
 int b1 = Integer.parseInt(first,2);
 int b2 = Integer.parseInt(second,2);
 int sum = b1+b2;
 return Integer.toBinaryString(sum);
}

public static String sum(String b1,String b2){
 int len1 = b1.length();
 int len2 = b2.length();
 int carry = 0;
 String res = "";

int maxLen= Math.max(len1,len2);
for(int i=0;i<maxLen;i++)
{

int p=i< len1 ? b1.charAt(len1 -1 -i)-'0' :0;
int q=i< len1 ? b1.charAt(len2 -1 -i)-'0' :0;
int tmp = p + q + carry;
carry  = tmp / 2;
res = tmp%2 + res;
}

return(carry ==0)? res:"1"+res;

  
}

}	