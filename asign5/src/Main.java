//5) Java Program to print the elements of an array present on an even position
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

             for (int i = 1; i < arr.length; i = i + 2) {

                 System.out.println(arr[i]);
             }
    }
}