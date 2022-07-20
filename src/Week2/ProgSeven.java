package Week2;

public class ProgSeven {

  /*  7. Write a program to insert any temperature value in degree Fahrenheit and
    convert to degree Celsius ((F − 32) × 5/9 = 0°C).  */

    public static void main(String[] args) {
        int F = 10;
        int a= 32;
        int b = 5;  int c = 9 ;
        int Celcius = ((F-a)*b/c);
        System.out.println(" Fehrenheit to degee Celcius = " +Celcius);
    }
}
