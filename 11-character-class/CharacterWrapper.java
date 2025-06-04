public class CharacterWrapper {

    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c); // Output: A

        Character character = 'A';
        System.out.println(character); // Output: A

        Character chZ = 'z'; // autoboxing: char -> Character
        char cZ = ch; // unboxing: Character -> char
        System.out.println(cZ); // Output: z

        // Checks if the character is a letter (A–Z or a–z).
        System.out.println(Character.isLetter('A')); // true
        System.out.println(Character.isLetter('1')); // false

        // Checks if the character is a digit (0–9).
        System.out.println(Character.isDigit('5')); // true
        System.out.println(Character.isDigit('x')); // false

        // Checks if the character is in uppercase or lowercase.
        System.out.println(Character.isUpperCase('G')); // true
        System.out.println(Character.isLowerCase('g')); // true

        // Converts a character to uppercase or lowercase.
        System.out.println(Character.toUpperCase('b')); // B
        System.out.println(Character.toLowerCase('H')); // h

        // Checks if a character is a whitespace (like space ' ', tab '\t', or newline '\n').
        System.out.println(Character.isWhitespace(' ')); // true
        System.out.println(Character.isWhitespace('\n')); // true
        System.out.println(Character.isWhitespace('x')); // false
    }
}