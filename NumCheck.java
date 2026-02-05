import java.util.Scanner;

class numberCheck{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num=sc.nextInt();

    if(num>0){
      System.out.println("Postive"+num);
    }else if(num<0){
      System.out.println("Negative"+num);
    }else{
      System.out.println("Zero"+num);
    }
  }
}