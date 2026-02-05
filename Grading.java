import java.util.Scanner;

public class Grading{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter number of units taken: ");
    int units=sc.nextInt();

    int[] scores=new int[units];
    int total=0;
  
 for(int i=0;i<scores.length;i++){
      System.out.print("Enter score for unit "+(i+1)+": ");
      scores[i]=sc.nextInt();
      total+=scores[i];
    }
    float average=total/scores.length;
    char grade='A';

    if(average<0||average>100){
      System.out.println("Error!! wrong score input.");
    }else if(average>=70){

      grade='A';
      System.out.println("Excellent!🍕");
    }else if(average>=60){
      grade='B';
      System.out.println("Good... can do better!");
  }else if(average>=50){
    grade='C';
    System.out.println("Room for imrovement.");
  }else if(average>=50){
    grade='D';
    System.out.println("Pull up your socks and work hard!!😡");
  }else{
    grade='F';
    System.out.println("FAIL? You will retake the unit");
  }
  System.out.println("Your average score is "+average+" Grade: "+grade);
  }
} 

    