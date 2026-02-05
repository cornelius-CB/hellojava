
public class MethodTrain {

    // Method to greet the user
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to the Method Train program.");
    }

    // Method to calculate the square of a number
    public static int square(int number) {
        return number * number;
    }

    // Method to calculate the factorial of a number
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        greetUser(name);

        System.out.print("Enter a number to square: ");
        int numToSquare = scanner.nextInt();
        System.out.println("The square of " + numToSquare + " is " + square(numToSquare));

        System.out.print("Enter a number to find its factorial: ");
        int numForFactorial = scanner.nextInt();
        System.out.println("The factorial of " + numForFactorial + " is " + factorial(numForFactorial));

        System.out.print("Enter a number to check if it's even: ");
        int numToCheck = scanner.nextInt();
        if (isEven(numToCheck)) {
            System.out.println(numToCheck + " is even.");
        } else {
            System.out.println(numToCheck + " is odd.");
        }

        scanner.close();
    }
}    
  