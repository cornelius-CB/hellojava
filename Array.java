
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[] ages = new int[students];
        int AgesTotal = 0;
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            AgesTotal += ages[i];
        }
        System.out.println("Total is: " + AgesTotal);
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        int oldest = ages[0];
        int youngest = ages[0];

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > oldest) {
                oldest = ages[i];
            }
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
        }
        System.out.println("The oldest student is " + oldest + " years old");
        System.out.println("The youngest student is " + youngest + " years old");

        float average = AgesTotal / ages.length;
        System.out.println("Avarage age is " + average);

    }
}
