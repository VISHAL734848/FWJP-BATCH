import java.util.Scanner;
class TernaryDemo
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);

 System.out.print("Enter two numbers: ");
 int a = sc.nextInt();
 int b = sc.nextInt();

 System.out.println(a>b?"A is Greater":"B is Greater");
 

}

}