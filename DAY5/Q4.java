import java.util.Scanner;


public class Q4
 {
  public static void main(String arg[])
  {

    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a character: ");

    char ch=sc.next().charAt(0);

    String result=ch>='a'&&ch<='z' ? "lower case" :"upper case";

    System.out.print(ch+" is in "+result);
    
  }
}