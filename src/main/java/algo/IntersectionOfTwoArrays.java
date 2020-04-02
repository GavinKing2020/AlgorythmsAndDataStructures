package algo;

import java.io.BufferedReader;
import java.util.*;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {3,4,5,6};

        // O(mn)
//        for (int i=0; i<arr1.length;i++){
//            for (int j=0;j<arr2.length; j++){
//                if (arr1[i] == arr2[j]) {
//                    System.out.println(arr1[i]);
//                }
//            }
//        }
        ArrayList list = new ArrayList();

        HashMap map = new HashMap();
        List linkedList = new LinkedList();




        /*O(m+n)
        BUffered*/
//        long start = System.currentTimeMillis();
//        System.out.println(start);
//
//
//        int i=0;
//        int j=0;
//
//        while (i<arr1.length && j<arr2.length) {
//            if (arr1[i] == arr2[j]){
//                System.out.println(arr1[i]);
//                i++;
//                j++;
//            } else if (arr1[i] > arr2[j]) {
//                j++;
//            } else {
//                i++;
//            }
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end);
//        long elapsed = end - start;
//        System.out.println(elapsed);

        Set<Integer> set1 = new HashSet<>();

        for(int val: arr1) {
            set1.add(val);
        }

        for(int val: arr2) {
            if (set1.contains(val)) {
                System.out.println(val);
            }
        }
    }

    }

