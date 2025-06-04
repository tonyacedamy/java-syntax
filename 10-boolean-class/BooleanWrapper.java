public class BooleanWrapper {

    // Declare primitive and wrapper fields    
    static boolean flag;
    static Boolean status;

    public static void main(String[] args) {

        // 1. Default values    
        System.out.println("Default value of primitive boolean: " + flag); // false
        System.out.println("Default value of Boolean wrapper: " + status); // null

	    boolean a = true;
        boolean b = false;
        //boolean c = null; // Compile error

        Boolean x = true;
        Boolean y = false;
        Boolean z = null; // Allowed
        System.out.println("Boolean wrapper can be null: " + z);
		
		boolean result1 = Boolean.parseBoolean("true"); // result1 = true
        System.out.println("result1 = " + result1);
        
        Boolean result2 = Boolean.valueOf("true"); // result2 = true
        System.out.println("result2 = " + result2);

        Boolean a = Boolean.TRUE;
        Boolean b = Boolean.FALSE;

        Boolean obj = Boolean.TRUE;
        boolean value = obj.booleanValue(); // value = true
        System.out.println("value = " + value);

    }
}
