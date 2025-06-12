public class StringBufferBenchmark {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 100_000; i++) {
            buffer.append("a");
        }

        String result = buffer.toString();
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end - start) + " ms");

    }
}
