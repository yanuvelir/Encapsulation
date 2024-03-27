package com.company;

public class Second_Class {

    private String a;
    private String b;
    private int year;
    int second;

    public int firstMethod(){
        return getYear() + second;
    }

    public String getA() {
        return a;
    }

    public void setA(String name) {
        this.a = name;
    }



    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getCar(){
       String car = a + " " + b + " " + year+" year";
       if(year < 1996){
           car =  a + " " + b + " " + year+" year Old car";
       }
        return car;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
