package Week2;

public class ProgTwenty {

    /*20. Write a Java Program to print as below.
"+------------------------+"
"|                        |"
"| CORNER STORE           |"
"|                        |"
"| 2015-03-29 04:38PM     |"
"|                        |"
"| Gallons: 10.870        |"
"| Price/gallon: $ 2.89   |"
"|                        |"
"| Fuel total: $ 22.71    |"
"|                        |"
"+------------------------+" */
    public static void main(String[] args) {
        String a = "CORNER STORE"; //local variable
        String Date = "2015-03-29";//local variable
        String Time = "04:38 PM";//local variable
        String G ="10.870";//local variable
        String Pr= "$ 2.89";//local variable
        String total = "$ 22.71";//local variable

        System.out.println("\"+------------------------+\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| "+a+"           |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| "+Date+" "+Time+"    |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Gallons: "+G+"        |\"");
        System.out.println("\"| Price/gallon: "+Pr+"   |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"| Fuel total: "+total+"    |\"");
        System.out.println("\"|                        |\"");
        System.out.println("\"+------------------------+\"");
    }
}
