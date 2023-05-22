//6.	Write a java program to find the sum of elements in an array.

public class Question6 {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 5, 3, 6, 5};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
