public class Main {
    static int arr[] = {100, 20,30,40};
    static int smallest() {
        int i;
        int min = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min= arr[i];
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Smallest in given array is " + smallest());
   }
}