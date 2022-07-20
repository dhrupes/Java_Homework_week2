package Week2;

public class ProgThree {
  /*  3. Write a Java programme using the following steps.
            3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
            3.3 Declare one static method.

3.4 Call both instance and static variables i
    nto both instance and static methods inside the print statement.
    3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
*/

    int a= 12;  //Declare instance variable
    static int b= 18; // Declare static Variable

    void m1() { //Declare instance method
        System.out.println(a);
        System.out.println(b);
    }
     static void m2(){ //Declare static method
         ProgThree h = new ProgThree();
        System.out.println(h.a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ProgThree h = new ProgThree();
      // System.out.println(h.a);
      // System.out.println(h.b);
       h.m1();
        m2();
    }

}
