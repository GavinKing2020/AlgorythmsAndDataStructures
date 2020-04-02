package algo2;

import java.sql.SQLOutput;
import java.text.MessageFormat;
import java.util.Scanner;

public class second {

    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {


        /*   *//*

        12345 &
        1234 &&
        123 &&&
        12 &&&&
        1 &&&&&
        &&&&&&&

        *//*

        for (int mainLoop = 5; mainLoop >= 1; mainLoop--) {
            for (int i = 1; i <= mainLoop; i++) {
                System.out.print(i);
            }

            System.out.print(" ");
            for (int k=6;k>mainLoop; k--) {
                System.out.print("&");
            }

            System.out.println();
        }

        for (int g=1; g<=7; g++) {
            System.out.print("&");
        }



    }*//*
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
 */


        /*for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("&");
            }
            System.out.println();
        }*/


/*
        System.out.println("@");

        for(int i = 5; i >= 1; i--) {
			System.out.print("@");
			for(int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			System.out.println("@");
		}

		for(int j = 5; j> 0; j--) {
			System.out.print("@ ");
		}*/

        /*System.out.println();
         *//*for(    int a = 1, b = 10, c = 11, d = 20, e = 21, f = 30;
                            a <= 10;
                    a++, b--, c++, d--, e++, f--) {

			System.out.println(
			        a + "  " +
                            b + "  " +
                                    c + "  " +
                                d + "  " +
                                e + "  " +
                                f);
		}*/
/*
		for (int a=1,b=10,c=20,d=3000;a<=10; a++, b++, c++, d++) {
//            System.out.printf(a + " " + "\t" + b + " " + "\t" + c + " " + "\t" + d);
            System.out.printf("%3d %3d %3d %3d", a, b, c, d);
            System.out.println();
        }*/



        /*Scanner sc = new Scanner(System.in);
		System.out.print("Rows: ");
		int rows = sc.nextInt();
		System.out.print("Col: ");
		int col = sc.nextInt();
		if(rows <= 0 || col <= 0) {
			// print error
		} else {
			for(int i = 1; i <= rows; i++) {
				for(int j = 1; j <= col; j++) {
					System.out.printf("%8s", "<SLOT>");
				}
				System.out.println();
			}
		}*/

/*		Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        if (rows<0 || cols<0) {
            System.out.println("err");
        } else {

            for (int i=1; i<=rows; i++) {
                for (int j=1; j<=cols; j++){
                    System.out.print(" CELL ");
                }
                System.out.println();
            }

        }*/


       /* Scanner sc = new Scanner(System.in);
		int i = 2, small = 0, large = 0;

		System.out.print("Num 1: ");
		int a = sc.nextInt();
		small = a;
		large = a;

		while(i <= 10) {
			System.out.print("Num " + i + ": ");
			int b =sc.nextInt();
			if(b < small) {
				small = b;
			}
			if(b > large) {
				large = b;
			}

			i++;
		}

		System.out.print("Larger: " + large + "    Smaller: " + small);*/



      /* Scanner sc = new Scanner(System.in);

       int i=2, small =0, large =0;

        System.out.print("Enter value: ");
       int a = sc.nextInt();

       small = a;
       large = a;

       while (i<=10) {
            System.out.print("Enter next value: ");
            int b = sc.nextInt();

            if (b < small) {
                small = b;
            };

            if ( b> large) {
                large =b;
            }

            i++;


            }
        System.out.println("Small: " + small + " Large : " + large );


       }*/


/*        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        int b = sc.nextInt();
        System.out.print("Exp: ");
        int e = sc.nextInt();
        int result = 1, i = 1;
        do {
            result = result * b;
            i++;
        } while (i <= e);

        System.out.println(result);*/


    /*Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Exp: ");
        int exp = sc.nextInt();

        int result = 1, i = 1;

        do {
            // mulpiply base on result one time because
            // do-while-loop execute at least once !
            result = result * base;
            i++;
        } while (i<=exp);

        System.out.println(result);*/



		/*int even = 0, odd = 1;
		for(int i = 1; i <= 20; i+=2) {
			odd = odd * i;
		}
		for(int i = 2; i <= 100; i+=2) {
			even = even + i;
		}

		System.out.print("Even: " + even + "  Odd: " + odd);*/


		/*int odd=1, even=0;

		for(int i=1; i<=20; i+=2){
			odd = odd*i;
		}

		for(int i=2;i<=100;i+=2){
			even=even+i;
		}

		System.out.println("Even= " + even + " Odd: " + odd);*/


		/*	 $$
		    $$$$
		   $$$$$$
		  $$$$$$$$
		 $$$$$$$$$$
		$$$$$$$$$$$$
		*/

		/*for(int i = 6; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 6; k >= i; k--) {
				System.out.print("$");
			}
			for(int k = 6; k >= i; k--) {
				System.out.print("$");
			}

			System.out.println();
		}*/

		System.out.println();

		// general loop for 6 elements of line
		/*for(int i = 6; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			System.out.print("#");
			for(int k = 6; k >= i; k--) {
				System.out.print(" ");
			}
			for(int k = 6; k >= i; k--) {
				System.out.print(" ");
			}

			System.out.print("#");
			System.out.println();
		}

		// bottom line
		for(int k = 7; k >= 0; k--) {
			System.out.print("# ");
		}
		System.out.println();*/








    }
}
