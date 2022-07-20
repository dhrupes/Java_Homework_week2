package Week2;

public class ProgSix {

 /*   6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).  */

void circle()  { //Instance method
    int r =10;
    double pi= 3.14;
    double A = pi*r*r;
    System.out.println("Area of circle = " +A);

}
   public static void main(String[] args) {

    ProgSix z = new ProgSix();  //Create an object
    z.circle(); // Called instance method
   }

}
