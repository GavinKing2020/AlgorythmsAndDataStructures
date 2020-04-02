package algo;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    // First approach
    // Complexity O(mn)

//    public static void main(String[] args) {
//        int[] arr1 = {1,5,6,7};
//        int[] arr2 = {1,2,3,7};
//
//        intersectionOfTwoArray(arr1,arr2);
//    }
//
//    static void intersectionOfTwoArray (int[] arr1, int[] arr2){
//        for (int i=0; i<arr1.length; i++){
//            for (int j=0; j<arr2.length; j++){
//                if(arr1[i]==arr2[j]){
//                    System.out.println(arr1[i]);
//                }
//            }
//        }
//    }

    // Second approach
    // Complexity O(m+n)

//    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5,10};
//        int[] arr2 = {1,0,0,0,5,10};
//
//        int i = 0;
//        int j = 0;
//
//        while (i< arr1.length && j<arr2.length) {
//            if (arr1[i] == arr2[j]) {
//                System.out.println(arr1[i]);
//            }
//                i++;
//                j++;
//            }
//        }

    // Complexity O(mn)

//    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5,9};
//        int[] arr2 = {1,0,0,9,5,8};
//
//        for (int i=0; i<arr1.length;i++) {
//            for (int j=0;j<arr2.length;j++) {
//                if (arr1[i] == arr2[j]) {
//                    System.out.println(arr1[i]);
//                }
//            }
//        }
//    }


    // using HashSet

//    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5,9,10,12,13,1};
//        int[] arr2 = {1,0,0,9,5,8};
//
//        HashSet<Integer> set1 = new HashSet();
//        for(int val: arr1){
//            set1.add(val);
//        }
//        for(int val:arr2){
//            if(set1.contains((val))){
//                System.out.println(val);
//            }
//        }
//    }

    // using HsshSet

    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5,9,10,12,13,1};
        Integer[] arr2 = {1,0,0,9,5,8};

        HashSet<Integer> set1 = new HashSet(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet(Arrays.asList(arr2));

        set1.retainAll(set2);
        System.out.println(set1);
    }

    }




