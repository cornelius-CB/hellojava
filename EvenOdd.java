
public class EvenOdd {

    public enum Season {
        WINTER, SPRING, SUMMER, FAIL
    }

    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
