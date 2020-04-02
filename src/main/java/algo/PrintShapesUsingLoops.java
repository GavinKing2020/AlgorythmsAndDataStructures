package algo;

public class PrintShapesUsingLoops {
    //public static void main(String[] args) {
//        for(int i=6; i>=1; i--){
//
//            //print empty left triangle
//            for(int j=1;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int k=6;k>=i;k--){
//                System.out.print("$");
//            }
//            for(int k=6;k>=i;k--){
//                System.out.print("$");
//            }
//            System.out.println();
//        }
//        for (int i=6;i>=1;i--){
//
//            // draw empty triangle
//            for(int e=1; e<i; e++){
//                System.out.print(" ");
//            }
//            //draw first half triangle
//            for(int fh=6;fh>=i;fh--){
//                System.out.print("$");
//            }
//            //draw second half triangle
//            for(int sh=6;sh>=i;sh--){
//                System.out.print("$");
//            }
//            System.out.println();
//        }

    public static void main(String[] args) {


        System.out.println();
        for(int i=6;i>=1;i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");

            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }

            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
            for(int k=7;k>=0;k--){
                System.out.print("# ");
            }
        }

    }



