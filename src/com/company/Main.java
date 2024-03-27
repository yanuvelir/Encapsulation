package com.company;

public class Main {

    public static void main(String[] args) {

        Second_Class sec_class = new Second_Class();
//        sec_class.first = 2;
//        sec_class.second = 3;
//
//        System.out.println("*** " + sec_class.firstMethod() + " ***");

        sec_class.setA("Blue");
        sec_class.setB("Honda");
        sec_class.setYear(1990);
        //System.out.println("'A' value is: " + sec_class.getA());
        System.out.println(sec_class.getCar());

    }
}
