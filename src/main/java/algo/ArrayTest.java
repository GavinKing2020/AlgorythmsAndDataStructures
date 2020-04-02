package algo;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {1,5,3,3,7,8,2};
        method(array);
    }

    static void method(int[] array){
        for (int i = 1; i<array.length; i++) {
            if (array[i-1] == array[i]) {
            System.out.println(array[i]);}
        }
    }
}