package Week2;
/*
Write a Java program to convert a given string into lowercase. Sample
Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.*/
public class ProgNinteen {

    public static void main(String[] args) {
        String uppercase = "The QUICK BROWNFOX JUMPS OVER THE LAZY DOG";
        System.out.println("Input:" +uppercase);
        String l = uppercase.toLowerCase();
        System.out.println("Output:" +l);
    }

}
