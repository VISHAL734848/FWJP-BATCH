import java.util.Scanner;
class Q1
{
 public static void main(String args[])
 { 
  Scanner sc = new Scanner(System.in);

   System.out.print("Enter the year: ");

   int year = sc.nextInt();
   
   System.out.println((year%4==0&year%100!=0)||(year%400==0)?year+" is Leap Year ": year+" is not a Leap Year ");

}
}