//3) Java Program to print the largest element in an array
public class Main {
    static int arr[] = {10,20,30,40,50};
    static int largest()
    {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Largest in given array is " + largest());
    }
}