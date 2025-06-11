public class StringPractice {
    public static void main(String[] args) {

        // 1. Creating strings (two ways)
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        // Both print the same content: Hello

        // 2. Trimming a string
        String rawName = "   Tony   ";
        String trimmedName = rawName.trim();
        System.out.println("Trimmed name: '" + trimmedName + "'");
        // Removes spaces from the beginning and end.

        // 3. Checking if a string is empty
        String emptyString = "";
        System.out.println("Is empty: " + emptyString.isEmpty());
        // true

        // 4. Changing case
        String email = "Tony@Gmail.com";
        String lowerCaseEmail = email.toLowerCase();
        String upperCaseEmail = email.toUpperCase();
        System.out.println("Lowercase: " + lowerCaseEmail);
        System.out.println("Uppercase: " + upperCaseEmail);

        // 5. Checking if a string contains another string
        String description = "Free ship for orders over $50";
        System.out.println("Contains 'free ship'? " + description.contains("free ship"));
        System.out.println("Contains 'Free ship'? " + description.contains("Free ship"));

        // 6. Splitting a string
        String languages = "Java,Python,C++";
        String[] parts = languages.split(",");
        System.out.println("Language 1: " + parts[0]);
        System.out.println("Language 2: " + parts[1]);
        System.out.println("Language 3: " + parts[2]);

        // 7. Comparing strings
        String a = "hello";
        String b = new String("hello");
        System.out.println("a == b: " + (a == b));           // false
        System.out.println("a.equals(b): " + a.equals(b));   // true

        // 8. Case-insensitive comparison
        String userInput = "ADMIN";
        System.out.println("Equals ignore case: " + "admin".equalsIgnoreCase(userInput));

        // 9. Formatting strings using String.format
        String name = "Tony";
        int age = 20;
        String info = String.format("Name: %s, Age: %d", name, age);
        System.out.println(info);

    }
}
