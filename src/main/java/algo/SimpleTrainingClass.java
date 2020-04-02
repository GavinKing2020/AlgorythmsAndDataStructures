package algo;

import java.util.ArrayList;
import java.util.List;

public class SimpleTrainingClass {



    public static void main(String[] args) {


        String[] TenNumbers = {"FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIX", "SEVENTH", "EIGHT", "NOUN", "TEN"};

        /*List<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");

        for (String strings: list  ) {
            System.out.println(strings);
        }
        System.out.println(" - - - - - ");

        for ( int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }*/
        for (int i=0; i<10; i++) {
            System.out.printf (TenNumbers[i] + ": X ");
            for (int j = 0; j < 10; j++) {
                System.out.printf ("Y ");
            }
            System.out.println("");
        }

        }


    }





