package algo;

public class TwoArraysIntersect {

    public static void main(String[] args) {
        System.out.println("test");

        // how to intersect two arrays in java

        int[] array = new int[] {1,5,3,4,5};
        int[] array2 = new int[] {1,2,7,8,9};

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array2.length; j++) {
                if (array[i] == array2[j]) {
                    System.out.println(array[i]);
                }
            }
        }

    }
}
