import java.util.Scanner;



class PercentOfMark
{


  public static void main(String args[])
   {
   
      Scanner sc=new Scanner(System.in);
      System.out.print("\nEnter the mark : " );
      int getMark=sc.nextInt();
      
       System.out.print("\nEnter the total mark : " );

      int totalMark=sc.nextInt();

      double percentMark=(getMark*100/totalMark);

         System.out.print("Percentage of mark : " + percentMark);

    }

  
}