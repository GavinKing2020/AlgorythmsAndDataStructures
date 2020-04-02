package trainings;

public class FiveEssentialsAlgoKiteSchool {

    public static void main(String[] args) {

    // simple search
       /* int[] array = {1, 3, 5, 4, 8, 23, 12, 0, -32};

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);*/

        int[] array = {300, 112, 28, 45, -64, 82, 33, 120, 234, 15, 876};
        // int search = 97;
        // int index = binarySearch(array, search);

        array = selectionSort(array);

        for (int number : array) {
            System.out.print(number + " ");
        }

        /*if (index == -1) {
            System.out.println("No such element: " + search);
        } else System.out.println("Element: " + search + " have index: " + index);
        */
    }

    // selection sort
    static int[] selectionSort (int[] array){
        for (int i=0; i<array.length;i++){
            int min = i;
                for (int j=i+1; j<array.length; j++){
                    if(array[min]> array[j])
                    min = j;
                }
                int temp = array[i];
                array[i]=array[min];
                array[min] = temp;
        }
        return array;
    }

    // my insertion sort implementation
    /*static int[] insertionSort (int[] array){
        for(int i=1; i<array.length; i++) {
            for (int j=i; j>0 && (array[j]<array[j-1]); j--){
            int temp = array[j];
            array[j] = array[j-1];
            array[j-1] = temp;
            }
        }
        return array;
    }*/

    // insertion sort
    /*static int[] insertionSort (int[] array){
        for (int i=1; i<array.length; i++) {
            for (int j=i; j>0 && (array[j]< array[j-1]);j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
        return array;
    }*/

    // linear search
    /*static int search (int[] array, int search) {

        for (int i = 0; i< array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }*/

    // binary search
    /*static int binarySearch (int[] array, int search) {
        int start = 0;
        int end = array.length-1;
        int iteration = 1;
        while ((start + end) > 0) {

            int mid = (start + end) / 2;
            if (array[mid] == search) {
                return mid;
            } else {
                if (array[mid] < search) {
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }
            System.out.println("iteration: " + iteration);
            iteration++;
        }
        return -1;
    }*/

    // binary search my implementation
    /*static int binarySearch (int[] array, int search){

        int start = 0;
        int end = array.length - 1;

        while ((start+end > 0)){

        int mid = (start + end) / 2;

        if (array[mid] == search){
            return mid;
        } else {
            if (array[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        }
        return -1;
    }
*/

    // bubble sort
   /* static int[] bubbleSort (int[] array){

        for (int i = 0; i < array.length-1; i++) {
            for (int j = array.length-1; j > i; j--){
                if (array[j]< array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }*/

   // my bubble sort implementation
/*    static int[] bubbleSort (int[] array) {
        for (int i = 0; i < array.length-1; i++){
            for (int j = array.length-1; j>i; j--){
                if (array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }*/



}
