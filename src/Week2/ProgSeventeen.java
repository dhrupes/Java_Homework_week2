package Week2;
/*17. Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5
Expected Output*/
public class ProgSeventeen {
    public static void main(String[] args) {
        int Decimal = 5; // int is a data type and decimal is variable.
        System.out.println("Decimal number = 5");
        System.out.println("Expected Binary output no is = "  +(Integer.toBinaryString(Decimal)));
    }
}
