package algo;

import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {

        int[] array = {1,2,4,3,2,5,6,7,4,3,5,6,8,9};

        Arrays.sort(array);

        for (int i=1; i<array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    System.out.println("Duplicate number is: " + array[i]);
                }
            }
        }
    }
}
