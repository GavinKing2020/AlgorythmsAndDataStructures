package algo;

public class One {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4.4s", j);
            }

            for (int k = 20; k > i; k--) {
                System.out.printf("%4.4s","*");
            }
            System.out.println();
        }
    }
}

