import java.util.Scanner;



class Q2
{


  public static void main(String args[])
   {
   
      Scanner sc=new Scanner(System.in);

      System.out.print("\nEnter your Experience : " );
      double exp=sc.nextDouble();

      System.out.print("\nEnter your Salary : " );
      double sal=sc.nextDouble();
     
      double bonus = exp>20 ? (sal*20)/100:(sal*10)/100;
      System.out.print("Bonus is  : "+ bonus );

        
    
      
    }

  
}