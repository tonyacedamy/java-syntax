public class ShortWrapper {

    public static void main(String[] args) {
	
        short s = 1000;
        System.out.println(s); // Output: 1000

        Short sh = 1000;
        System.out.println(sh); // Output: 1000

        // Autoboxing & Unboxing
        Short a = 100; // autoboxing: short → Short
        short b = a; // unboxing: Short → short

        // Useful methods
		System.out.println(Short.parseShort("123")); // 123
		
        System.out.println(Short.valueOf("45")); // 45
        
		System.out.println(Short.compare((short) 5, (short) 7)); // -1

    }

}