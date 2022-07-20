package Week2;


public class Prog21 {

  /*  Make class save your name in string variable and use all string methods. */

  public static void main(String[] args) { //Main method


    String name = "Dhrupesh";
    String lastname= "Patel";
    System.out.println("String length is " +name.length()); //Length of string
    System.out.println("Character value is " +name.charAt(3)); //return a character value at given index number.
    System.out.println("Combined string is " +name.concat( " Dhrupesh Patel"));
    System.out.println("contains the word- " +name.contains("Dhrup patel"));// Return true if character found in string
    System.out.println("Starting character- " +name.startsWith("D"));//String start with given prefix
    System.out.println("Ending character- " +name.endsWith("h"));//String end with suffix
    System.out.println("both String-" +name.equals(name + lastname) );//Compare the both strings.
    System.out.println("index of String- " +name.indexOf("Dhrupesh"));
    System.out.println("Empty or not- " +name.isEmpty()); //Check ifstring is empty.
    System.out.println("Replacement of String- "+name.replace("Dhrupesh","Dhrup"));//Replacing the String
    System.out.println("Part of the String- "+name.substring(5));// Return the part of the string
    System.out.println("Char to String Array- " +name.toCharArray());//Converting string to array.
    System.out.println("Lower case- " +name.toLowerCase()); // Conver string in to lowercase.
    System.out.println("uppper case- " +name.toUpperCase());// Convert in to upper case.
    System.out.println("Eliminates- "+name.trim()); //Eliminate spacing at begining and end of the string
  }

}

