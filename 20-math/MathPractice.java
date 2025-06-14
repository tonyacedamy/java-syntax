public class MathPractice {
    public static void main(String[] args) {
        // ROUNDING METHODS
        // Math.ceil - always rounds up to the nearest whole number
        double ceilValue = Math.ceil(4.3);
        System.out.println("Math.ceil(4.3) = " + ceilValue); // 5.0

        // Math.floor - always rounds down to the nearest whole number
        double floorValue = Math.floor(4.8);
        System.out.println("Math.floor(4.8) = " + floorValue); // 4.0

        // Math.round - rounds to the nearest integer (returns long)
        long roundUp = Math.round(4.5);
        long roundDown = Math.round(4.4);
        System.out.println("Math.round(4.5) = " + roundUp);   // 5
        System.out.println("Math.round(4.4) = " + roundDown); // 4

        // Math.rint - returns the closest integer as a double
        // If exactly halfway, it rounds to the even number
        double rintEvenDown = Math.rint(4.5);
        double rintEvenUp = Math.rint(5.5);
        System.out.println("Math.rint(4.5) = " + rintEvenDown); // 4.0
        System.out.println("Math.rint(5.5) = " + rintEvenUp);   // 6.0

        // ARITHMETIC METHODS
        // Find the maximum of two numbers
        int a = 15;
        int b = 42;
        int max = Math.max(a, b);
        System.out.println("Max of " + a + " and " + b + ": " + max); // 42

        // Find the minimum of two numbers
        int min = Math.min(a, b);
        System.out.println("Min of " + a + " and " + b + ": " + min); // 15

        // Get the absolute value of a number
        int negative = -20;
        int absolute = Math.abs(negative);
        System.out.println("Absolute value of " + negative + ": " + absolute); // 20

        // Calculate the square root of a number
        double squareRoot = Math.sqrt(64);
        System.out.println("Square root of 64: " + squareRoot); // 8.0

        // Calculate the power of a number (x raised to the power of y)
        double power = Math.pow(2, 5); // 2^5 = 32
        System.out.println("2 to the power of 5: " + power); // 32.0

        // GENERATING RANDOM NUMBERS
        // More control or randomness in games or simulations, Java also has a Random class in java.util.
        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomValue = Math.random();
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);

        // Generate a random integer between 0 and 99
        int random0to99 = (int)(Math.random() * 100);
        System.out.println("Random integer between 0 and 99: " + random0to99);

        // TRIGONOMETRIC METHODS
        // Convert degrees to radians
        double degrees = 30;
        double radians = Math.toRadians(degrees);

        // Calculate sine, cosine, and tangent using radians
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        System.out.println("Angle in degrees: " + degrees);
        System.out.println("Angle in radians: " + radians);
        System.out.println("sin(30°) = " + sinValue); // 0.5
        System.out.println("cos(30°) = " + cosValue); // ~0.866
        System.out.println("tan(30°) = " + tanValue); // ~0.577

        // Convert radians back to degrees
        double backToDegrees = Math.toDegrees(radians);
        System.out.println("Converted back to degrees: " + backToDegrees); // 30.0

    }
}
