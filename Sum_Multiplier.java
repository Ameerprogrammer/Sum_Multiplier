//Ameer Ahmed

import java.util.Scanner;

public class Sum_Multiplier {
    public static boolean SumMultiplier(int[] arr) {

        //edge case in an empty array
        if (arr.length == 0) {
            System.out.println("The array is empty!");
        }
        else if(arr.length == 1) {
            System.out.println("The array only has one element!");
        }

        int sum = 0;
        //first iterate through the array
        for(int i = 0; i < arr.length; i++) {
            //add all the elements together now
            sum += arr[i];
        }
        int Doubled_Sum = 2 * sum;

        //iterate again to look for 2 numbers whose product is greater than the doubled sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (product > Doubled_Sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean result = SumMultiplier(arr);
        System.out.println("Output: " + result);

        scanner.close();

        /* Test Cases
        System.out.println("Output: " + SumMultiplier(new int[] {1,1,2,10,3,1,12}));
        System.out.println("Output: " + SumMultiplier(new int[] {2,2,2,2,4,1}));
        System.out.println("Output: " + SumMultiplier(new int[] {}));
        System.out.println("Output: " + SumMultiplier(new int[] {1}));
         */
    }
}