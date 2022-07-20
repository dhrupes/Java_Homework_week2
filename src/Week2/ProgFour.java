package Week2;

public class ProgFour {

    /*4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.*/

int a =35; // Declare instance variable
int b = 40; // Declare instance variable
static String c= "Yes"; //Declare instance variable
static String d = "Please";  //Declare instance variable

    void m1(){
        System.out.println(a);
        System.out.println(b);
        ProgFour t = new ProgFour();
        System.out.println(t.c);
        System.out.println(t.d);
    }

    static void m2(){
        ProgFour t = new ProgFour();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(c);
        System.out.println(d);


    }

    public static void main(String[] args) {
        ProgFour t = new ProgFour();
        t.m1();
        m2();
    }
}
