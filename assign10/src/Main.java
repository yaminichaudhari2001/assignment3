//10) Find 2nd Largest Number in an Array
public class Main {
    public static void main(String[] args) {
        int [] arr ={5, 80, 8, 7, 11};
        int temp = 0;
        System.out.println("Elements of your array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Second largest number is " +arr[arr.length-2]);

    }
}
