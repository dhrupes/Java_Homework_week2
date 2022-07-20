package Week2;
/*10. Write a Java program that takes a number as input and prints its
        multiplication table up to 10.
        Test Data: Input a number: 8
        Expected Output :

        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ... double area=math.PI
        8 x 10 = 80 */
public class ProgTen {

    static void Table(){ // Static method
        for(int a = 1; a< 11; a++){
            int b=8; // int is data type and b is variable name
            int c = a * b; // int is data type and c is variable name
            System.out.println(+b+ " X " +a+ " = " +c);
        }
    }

    public static void main(String[] args) { //Main method
        System.out.println("Table");
        Table(); // Calling instant method

    }

}
