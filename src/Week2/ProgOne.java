package Week2;

public class ProgOne {
   /* 1. Write a Java programme using the following steps.
            1.1 Declare two instance variables.
            1.2 Declare one instance method.
            1.3 Call both instance variables into the instance method inside the print
    statement. 1.4 Declare the Main method.
            1.5 Call the above instance method into the Main method and Run the programme.*/


    int a= 10;
    int b=20;

    void m1(){  //Declare instance method
 //instant method area
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ProgOne t = new ProgOne(); // Called instance variable using object name
        t.m1();


    }


}
