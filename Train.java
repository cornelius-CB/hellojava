import java.util.Scanner;

public class Train{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name=sc.nextLine();

    System.out.print("Enter your age, "+name +"!");
    int age=sc.nextInt();

    System.out.println(name+" your age is "+age);

    if(age<13){
      System.out.println(name+" you are a kid");
    }else if (age<20){
      System.out.println(name+" you are a teeneger");
    }else{
      System.out.println(name+" you are an adult");
    }
  }
}