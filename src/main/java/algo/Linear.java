package algo;

public class Linear {

    public static void main(String[] args) {

        int[] arr = {23,54, 65, 76,87};
        int search = 87;
        int index = search (arr, search);
        System.out.println(index);

    }

    static int search(int[] arr, int search) {
        for (int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return i;
            }
            System.out.println("Iteration: " + i);
        }
        return -1;
    }
}
