import java.util.Scanner;
class Q3
{
 public static void main(String args[])
 { 
  Scanner sc = new Scanner(System.in);

   System.out.print("Enter the Age: ");

   int age = sc.nextInt();
   
   System.out.println((age>18)?"Eligibal for vote ":"Not eligibal for vote ");

}
}