import java.util.Scanner;
class OrDemo
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);

 System.out.print("Enter a character : ");
 char ch = sc.next().charAt(0);

  //check whether this char is in lower case or upper case
//ascii range for lower :97-122
 boolean lower = ch>97&&ch<122;
 System.out.println(ch+" is in lowercase:  "+lower);

boolean upper = ch>65 && ch<90;
System.out.println(ch+" is  in upper case: "+upper);

//check if it is an alphabet or not 
 boolean result = lower||upper;
 System.out.println(ch+" is an Alphabet or not :"+result); 
 System.out.println(ch+" is not an Alphabet :"+result); 


  
  
}

}