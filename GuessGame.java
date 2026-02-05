import java.util.*;

public class GuessGame{
  public static void main(String[] args){
    Random rand =new Random();
    Scanner sc =new Scanner(System.in);

    int secret =rand.nextInt(5)+1;
    int guess;

    do{
      System.out.print("Guess number btn 1 and 5: ");
      guess=sc.nextInt();
    }while (guess!=secret);

System.out.println("Correct guess");
  }
}