public class ByteWrapper {
    public static void main(String[] args) {

        byte b1 = 100; // primitive byte
        Byte b2 = 100; // Byte object
        System.out.println("Primitive byte b1 = " + b1);
        System.out.println("Wrapper Byte b2 = " + b2);

        // Autoboxing: primitive to wrapper
        Byte autoBoxed = 10;
        // Unboxing: wrapper to primitive
        byte unboxed = autoBoxed;
        System.out.println("Autoboxed Byte = " + autoBoxed);
        System.out.println("Unboxed byte = " + unboxed);

        // parseByte: converts String to primitive byte
        byte parsed = Byte.parseByte("127");
        System.out.println("Parsed byte: " + parsed);

        // compare: compares two byte values
        int cmp = Byte.compare((byte) 10, (byte) 20);
        System.out.println("Compare 10 and 20: " + cmp); // negative because 10 - 20 = -10

        // valueOf: returns a Byte object from String or byte
        Byte val1 = Byte.valueOf("100");

        // toString: converts byte to String
        String str = Byte.toString((byte) 50);
        System.out.println("toString of 50: " + str);

        // byteValue: returns primitive byte from Byte object
        byte primitive = val1.byteValue();
        System.out.println("byteValue of val1: " + primitive);

    }
}
