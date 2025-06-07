public class IntegerWrapper {
    public static void main(String[] args) {

        // 1. Primitive int
        int primitiveInt = 42;
        System.out.println("Primitive int: " + primitiveInt);

        // 2. Wrapper class Integer
        Integer integerObj = Integer.valueOf(42);
        System.out.println("Integer object: " + integerObj);

        // 3. Nullability
        // Integer can be null
        Integer nullableInteger = null;
        System.out.println("Nullable Integer (null): " + nullableInteger);

        // int cannot be assigned null — this will cause a compile error
        // int invalidNull = null;

        // 4. Autoboxing: Java automatically converts int to Integer
        Integer autoBoxed = 100;
        System.out.println("Autoboxed Integer: " + autoBoxed);

        // 5. Unboxing: Java automatically converts Integer to int
        int unboxed = autoBoxed;
        System.out.println("Unboxed int: " + unboxed);

        // 6. Comparing Integer objects — be careful with ==
        Integer c = 128;
        Integer d = 128;
        System.out.println("c == d (outside cache range): " + (c == d)); // false — different objects
        System.out.println("c.equals(d): " + c.equals(d)); // true — same value

        // 7. Useful methods from the Integer class

        // parseInt — converts a string to a primitive int
        int parsed = Integer.parseInt("123");
        System.out.println("Parsed int: " + parsed);

        // valueOf — returns an Integer object from a string
        Integer valueOfResult = Integer.valueOf("456");
        System.out.println("ValueOf result: " + valueOfResult);

        // compare — compares two int values
        int comparison = Integer.compare(10, 20);
        System.out.println("Compare 10 vs 20: " + comparison); // -1

        // intValue — extracts the primitive int from an Integer object
        int extracted = valueOfResult.intValue();
        System.out.println("intValue from Integer: " + extracted);

        // equals — checks if two Integer objects have the same value
        System.out.println("Equals check: " + valueOfResult.equals(456));

        // decode — parses hexadecimal, octal, or decimal strings
        Integer hexValue = Integer.decode("0xFF");
        System.out.println("Decoded hex (0xFF): " + hexValue);
        
        // max, min, sum — utility methods for comparing or combining ints
        int max = Integer.max(8, 12);
        int min = Integer.min(8, 12);
        int sum = Integer.sum(8, 12);
        System.out.println("Max of 8 and 12: " + max);
        System.out.println("Min of 8 and 12: " + min);
        System.out.println("Sum of 8 and 12: " + sum);
    }
}
