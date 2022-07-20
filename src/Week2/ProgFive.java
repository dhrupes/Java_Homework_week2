package Week2;
   /*5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)*/

import java.sql.SQLOutput;

public class ProgFive {

    public static void main(String[] args) {
        ProgFive t = new ProgFive();
        t.add();
        t.sub();
        multi();
        div();


    }

    void add() {
        int a = 10;
        int b = 15;
        int total = a + b;
        System.out.println("Addition is = " + total);
    }

    void sub() {
        int a = 11;
        int b = 19;
        int total = a + b;
        System.out.println("Subtraction is = " + total);
    }

    static void multi() {
        int a = 11;
        int b = 19;
        int total = a * b;
        System.out.println("Multiplication is = " + total);


    }

    static void div() {
        int a = 25;
        int b = 8;
        int total = a / b;
        System.out.println("Division is = " + total);

    }
}