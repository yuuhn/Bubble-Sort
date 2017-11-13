package basepackage;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len - i + 1; j++) {
                if (arr[j] < arr[j-1]) {
                    int tStore = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tStore;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        String arrLine = sc.nextLine();

        //int[] arr = new int[] {5, 8, 7, 5, 12, 2, 6, 1, 4};
        String[] numbers = arrLine.split(" ");
        int[] arr = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        int[] sortedArr = bubbleSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
