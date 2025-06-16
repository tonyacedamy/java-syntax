public class IfElsePractice {

    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        int score = 8;
        if (score >= 9) {
            System.out.println("Excellent");

        } else if (score >= 7) {
            System.out.println("Good");

        } else if (score >= 5) {
            System.out.println("Average");

        } else {
            System.out.println("Poor");
        }
    }
}