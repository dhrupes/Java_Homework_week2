package Week2;
/*18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
public class ProgEighteen {

    public static void main(String[] args) {
        int a = 125; // int is a data type and a is variable
        int b = 24; // int is a datatype and b is variable

        System.out.println("Expected output");
        System.out.println(+a+ " + " +b+ " = " +(a+b)); // Printing addition of a and b
        System.out.println(+a+ " - " +b+ " = " +(a-b)); // Printing subtation of a and b
        System.out.println(+a+ " X " +b+ " = " +(a*b)); // Printing multiplication of a and b
        System.out.println(+a+ " / " +b+ " = " +(a/b)); // printing division of a and b
        System.out.println(+a+ " mod " +b+ " = " +(a%b)); // printing mod of a and b.
    }
}
