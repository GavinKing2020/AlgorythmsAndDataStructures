package algo2;

public class first {
// using loops to draw tree things

    // first loop for draw line
    public static void main(String[] args) {

        /*

        1*****
        12****
        123***
        1234**
        12345*
        123456

        */


        for (int i =1; i<=6; i++)

        {
            // second loop for draw digits
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }

            // third loop to draw a stars
            for (int k=6; k>i; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        /*

        *65432
        **6543
        ***654
        ****65
        *****6
        ******

        */

        for (int elementOfLine=1; elementOfLine<=6; elementOfLine++) {
            for (int star=1; star<=elementOfLine; star++){
                System.out.print("*");
            }
            for (int digit=6; digit>elementOfLine; digit--) {
                System.out.print(digit);
            }
            System.out.println();
        }

        System.out.println();

        /*

         *23456
         **3456
         ***456
         ****56
         *****6
         ******

        */

        for (int i=1; i<=6; i++){
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int k=i+1; k<=6; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }

}
