import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nUsing for-each loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nThird element: " + arr[2]);
        arr[1] = 100;
        System.out.println("After modifying second element:");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array Length: " + arr.length);
        sc.close();
    }
}