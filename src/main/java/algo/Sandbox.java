package algo;

public class Sandbox {

//    // Linear search
//
//    public static void main(String[] args) {
//        int[] arr = {1,3,5,2,7,8};
//        int search = 5;
//        int index = linearSearch(arr,search);
//        System.out.println(index);
//
//    }
//
//    static int linearSearch (int[] arr, int search){
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] == search) {
//                return i;
//            }
//        }
//        return -1;
//    }

        // Binary search
        public static void main(String[] args) {
            int[] arr = {1,2,4,6,7,8,11,20,23,24,25,
                        56,78,89,90,91,92,100,101,102,
                        103,104,105};
            int search = 24;
            int index = binarySearch(arr,search);
            System.out.println(index);
        }

        static int binarySearch (int[] arr, int search) {

            int start = arr[0];
            int end = arr.length-1;

            int i=0;

            while ((start + end) > 0) {

            int mid = (start + end) / 2;

            if (arr[mid] == search) {
                return mid;
            } else {
                if (arr[mid] < search) {
                    start = mid +1;
                } else {
                    end = mid -1;
                }
            }
                System.out.println("Iteration: " +i);
                i++;
            }

            return -1;
        }

}
