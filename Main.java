package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // int data type
        int myFirstint = 10;
        int mySecondint = 5;
        double myFirstDouble = 5.46;
        double mySecondDouble = 3.54;
        float my1stfloat = 0.77777f;

        // print two ints to console
        System.out.println("My ints = " + myFirstint + " + " + mySecondint);

        // add my tow ints
        System.out.println("My 1st int + my 2nd int = " + (myFirstint + mySecondint));

        //subtract you ints
        System.out.println("My 1st int - my 2nd int = " + (myFirstint - mySecondint));

        //multiply
        System.out.println("My 1st int * my 2nd int = " + (myFirstint * mySecondint));

        //divide
        System.out.println("My 1st int / my 2nd int = " + (myFirstint / mySecondint));

        System.out.println(" ");

        //print two doubles
        System.out.println("My doubles are = " + myFirstDouble + " + " + mySecondDouble);

        //add
        System.out.println("My 1st double + my 2nd double = " + (myFirstDouble + mySecondDouble));

        //subtract
        System.out.println("my 1st double - my 2nd double = " + (myFirstDouble - mySecondDouble));

        //multiply
        System.out.println("My 1st double * my 2nd double = " +(myFirstDouble * mySecondDouble));

        //divide
        System.out.println("My 1st double / my 2nd double = " + (myFirstDouble / mySecondDouble));

        System.out.println(" ");

        //Print my float
        System.out.println("My 1st Float = " + my1stfloat);

        // Cast 1st double as float
        float myCastfloat = (float) myFirstDouble;
        System.out.println("My 1st double cast as float = " + myCastfloat);
        System.out.println("My 2 float data types are " + my1stfloat + " and " + myCastfloat);

        //add
        System.out.println("My 1st float + my Cast float = " + (my1stfloat + myCastfloat));

        //subtract
        System.out.println("My 1st float - my Cast float = " + (my1stfloat - myCastfloat));

        //multiply
        System.out.println("My 1st float * my Cast float = " + (my1stfloat * myCastfloat));

        //divide
        System.out.println("My 1st float / my Cast float = " + (my1stfloat / myCastfloat));

        System.out.println(" ");

        String myName = "Russell";
        System.out.println(myName);
        System.out.println("Hello my name is " + myName);
        String sentance = "Hello my name is ";
        System.out.println(sentance.concat(myName));
        System.out.println(" ");

        System.out.println("       J J J J J J J       A             V          V              A");
        System.out.println("             J           A   A             V       V             A   A");
        System.out.println("             J          A A A A             V     V             A A A A");
        System.out.println("             J         A       A             V   V             A       A");
        System.out.println("    J        J        A         A             V V             A         A");
        System.out.println("      J J J J        A           A             V             A           A");

        System.out.println(" ");

        float radius = 5.5f;
        System.out.println("Perimeter = " + (2 * (radius * 3.14)));
        System.out.println("Area = " + (radius * radius)*3.14);

        System.out.println(" ");

        int kilos = 16;
        float kiloHours = 65.45f;
        float milesPerkilo = (kiloHours / kilos)/60;
        float milesPerhour = milesPerkilo * kiloHours;
        int roundedMilesperhour = (int) milesPerhour;

        System.out.println(roundedMilesperhour + " Miles Per Hour");

        for (int i = 1; i <= 9; i++) {
            System.out.println(i);

            if (i == 3) {
                System.out.println("hello");
            }
            else {
                System.out.println("goodbye");
            }
        }




    }

}
