package algo;

public class Playground {

    public static void main(String[] args) {

        // COMPLEXITY B(n);
        // there will be for example 14 by 14 elements

//        int[] arr = {3,2,5,1,6};
//        int search =6;
        // Search

        // Linear search
//        for (int i=0;i<arr.length;i++){
//            //System.out.println(arr[i]);
//            if (arr[i]==search){
//                System.out.println(i);
//                break;
//            }
//        }


        // COMPLEXITY B(log n) (the morre efficient than LinearSearch)
        // there will be for example 2 by 14 elements

        // Everytime we are finding the middle position

        // Binary Search
        // divide by 2 our array and go to the right
        // or go to the left
//        int[] arr = {23,54,65,76,87, 123, 145, 167, 178, 196};
//        int search = 196;
//
//        int start = 0;
//        int end = arr.length;
//
//        // infinity loop
//        boolean toggle = true;
//
//        // check about iteration quantity
//        int i = 0;
//        while(toggle) {
//
//            int mid = (start + end) / 2;
//
//            if (arr[mid] == search){
//                System.out.println("Searched: "+ mid);
//                toggle = false;
//            } else{
//                if (arr[mid] < search) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//            System.out.println("Iteration: " + i);
//            i++;
//        }


        // Insertion Sorting

//            int[] arr = {5,5,1,0,45,6,8};
//
//            for (int i=0; i<arr.length; i++) {
//                for (int j=i+1; j<arr.length; j++) {
//                    if (arr[i] > arr[j]) {
//                        int tmp = arr[j];
//                        arr[j] = arr[i];
//                        arr[i] = tmp;
//                    }
//                }
//            }
//            for (int number : arr) {
//                System.out.println(number);
//            }

        // Insertion sort second way
        // better way


//        int[] arr = {5, 5, 1, 0, 45, 6, 8};
//
//        arr = sort(arr);
//
//        for (int number : arr) {
//            System.out.println(number);
//        }
//    }
//
//
//        static int[] sort ( int[] arr){
//            for (int i = 1; i < arr.length; i++) {
//                for (int j = i; j > 0 && (arr[j] < arr[j - 1]); j--) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = tmp;
//                }
//
//            }
//            return arr;


        // SELECTION Sort
        // algo saving whos number is minimal


//        int[] arr = {12,2,4,5,0,1};
//
//        arr = sort(arr);
//
//            for (int number : arr) {
//                System.out.println(number);
//            }
//
//
//
//        }
//
//        static int[] sort (int[] arr) {
//            for (int i=0; i<arr.length; i++){
//                int min =i;
//                for (int j=i+1; j<arr.length; j++ ) {
//                    if(arr[min]>arr[j]){
//                        min = j;
//                    }
//                }
//                int tmp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = tmp;
//            }
//            return arr;
//        }




        // Bubble sort
        // The less numbers should go up like bubble
        // The lightest number go to the left of array

//        int[] arr = {12,2,12,3,1};
//
//        for (int i=0; i<arr.length-1;i++) {
//            for (int j=arr.length-1; j>i; j--) {
//                if(arr[j] < arr[j-1] ){
//                    int tmp =  arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = tmp;
//                }
//            }
//        }
//
//        for (int number : arr) {
//            System.out.println(number);
//        }


    }

    }











