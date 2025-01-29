import java.util.Scanner;


public class Q9{
  public static void main(String arg[])
  {

    Scanner sc =new Scanner(System.in);

    System.out.print("enter a character : ");

    char ch=sc.next().charAt(0);

    String result= ((ch>='a'&&ch<'z') || (ch>='A'&&ch<='Z') ) ? ((ch>='A'&&ch<='Z')? "upper case"   :"Lower case") :"Not a character";

      ch = (result=="upper case")?(char)(ch+32):ch ;
   
  String vowel= ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'? "vowel": "not vowel";

  
      

    System.out.println("Enteredd character is  "+result );
    System.out.println(ch+" is  "+vowel);
  }
}