package Week2;

/*
12. Write a Java program to compute the specified expressions and print the
        output.
        Test Data:
        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        Expected Output : 2.138888888888889  */




public class ProgTwelve {

    public static void main(String[] args){
        Double a= 25.5;// Double is data type and a is variable name
        Double b= 3.5; // Double is data type and b is variable name
        Double c= 40.5;// Double is data type and c is variable name
        Double d= 4.5;// Double is data type and d is variable name
        System.out.println("Expected output = ");
        System.out.println((a*b - b*b) / (c-d));
    }
}
