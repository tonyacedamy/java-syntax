public class StringBenchmark {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 100_000; i++) {
            result += "a";
        }

        long end = System.currentTimeMillis();
        System.out.println("String (+) time: " + (end - start) + " ms");
    }
}
