package gr.aueb.cf.cf9.ch6;

/**
 * Unsized Array Initialization 2.
 */
public class ArrayInit2 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };  // unsized array initialization


        System.out.println(arr[0]);                     // first element
        System.out.println(arr.length);                 // array length
        System.out.println(arr[arr.length - 1]);        // last element
    }
}
