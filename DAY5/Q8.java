import java.util.Scanner;
class Q8
{
 public static void main(String args[])
 { 
  Scanner sc = new Scanner(System.in);

   System.out.print("Enter a Number: ");

   int a = sc.nextInt();
   
   System.out.println(a%2==0?a+"is Even Number: ": a+" is Odd Number: ");

}
}