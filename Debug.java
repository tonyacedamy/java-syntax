public class Debug {
    /*
     * Shortcut keys list: File > Preferences > Keyboard Shortcuts
     * F5 Start Debugging: Start or continue debugging the program.
     * Shift + F5 Stop Debugging: Stop the current debugging session.
     * F10 Step Over: Move over the current line of code, without entering the
     * method.
     * F11 Step Into: Go into the details of the called method.
     * Shift + F11 Step Out: Exit the current method and return to the caller.
     */

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        // Call the sum function
        int result = sum(a, b);

        // Print the result
        System.out.println("Sum is: " + result);
    }

    // Function to calculate the sum of two numbers
    public static int sum(int x, int y) {
        int result = x + y;
        return result;
    }
}
