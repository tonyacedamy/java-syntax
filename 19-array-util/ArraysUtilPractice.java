import java.util.Arrays;

public class ArraysUtilPractice {
    public static void main(String[] args) {
        // 1. toString()
        int[] numbers = {3, 5, 7};
        System.out.println("Array content: " + Arrays.toString(numbers)); // [3, 5, 7]

        // 2. sort()
        int[] scores = {80, 95, 60, 70};
        Arrays.sort(scores);
        System.out.println("Sorted scores: " + Arrays.toString(scores)); // [60, 70, 80, 95]

        // 3. binarySearch()
        int[] data = {10, 5, 30, 25};
        Arrays.sort(data);// Always sort first! [5, 10, 25, 30]
        int index = Arrays.binarySearch(data, 25);
        System.out.println("Found 25 at index: " + index); // 2

        // 4. fill()
        int[] marks = new int[5];
        Arrays.fill(marks, 100);
        System.out.println("Filled marks: " + Arrays.toString(marks)); // [100, 100, 100, 100, 100]

        // 5. copyOf()
        int[] oldScores = {90, 80, 70};
        int[] topTwo = Arrays.copyOf(oldScores, 2);
        System.out.println("Top two scores: " + Arrays.toString(topTwo)); // [90, 80]

        int[] extended = Arrays.copyOf(oldScores, 5);
        System.out.println("Extended scores: " + Arrays.toString(extended)); // [90, 80, 70, 0, 0]

        // 6. equals()
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("a equals b: " + Arrays.equals(a, b)); // true
        System.out.println("a == b: " + (a == b)); // false
    }
}