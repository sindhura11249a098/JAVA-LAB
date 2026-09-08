import java.io.*;

public class AllExceptionsDemo {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }
        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }

        // 3. NullPointerException
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Object is null.");
        }

        // 4. NumberFormatException
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format.");
        }

        // 5. StringIndexOutOfBoundsException
        try {
            String text = "Java";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Invalid string index.");
        }

        // 6. ClassCastException
        try {
            Object obj = Integer.valueOf(100);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: Invalid type casting.");
        }

        // 7. NegativeArraySizeException
        try {
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException: Array size cannot be negative.");
        }

        // 8. IllegalArgumentException
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Invalid argument.");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Thread was interrupted.");
        }

        // 9. Custom exception using 'throw' and 'throws'
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        // 10. Finally block
        try {
            System.out.println("Inside try block.");
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program continues normally.");
    }
}
