public class StringBuilderBenchmark {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            builder.append("a");
        }

        String result = builder.toString();
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start) + " ms");

    }
}
