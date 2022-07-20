package Week2;

/*  16. Write a Java program to add two binary numbers.

Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101   */

public class ProgSixteen {
    public static void main(String[] args) {
        String binaryno1 = "10";
        String binaryno2 = "11";

        int interger1 = Integer.parseInt(binaryno1, 2);
        int interger2 = Integer.parseInt(binaryno2, 2);

         Integer output = interger1 + interger2;
        System.out.println("Sum of two binary number- " + Integer.toBinaryString(output));
    }
}
