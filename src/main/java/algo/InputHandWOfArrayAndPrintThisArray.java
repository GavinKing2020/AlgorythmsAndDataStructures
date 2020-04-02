package algo;
import java.util.Scanner;

public class InputHandWOfArrayAndPrintThisArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Rows: ");
        int rows = sc.nextInt();
        System.out.println("Col: ");
        int col = sc.nextInt();

        if(rows<=0 || col<=0) {
            System.out.println("Row or Col less than 0");
        } else {
            for(int i=1; i<=rows; i++){
                for(int j=1; j<=col; j++) {
                    System.out.print("B ");
                }
                System.out.println();
            }
        }
    }
}
