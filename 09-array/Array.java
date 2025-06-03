public class Array {

    public static void main(String[] args) {
        int[] numbers = new int[3]; // Create an array of 3 integers
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(numbers[0]); // Output: 10
        System.out.println(numbers[1]); // Output: 20
        System.out.println(numbers[2]); // Output: 30

        System.out.println(numbers.length); // Output: 3

        //System.out.println(numbers[3]); // This will cause an error!

        //You can also declare and assign values to an array in one line, like this
        int[] nums = {10, 20, 30};
    }
}