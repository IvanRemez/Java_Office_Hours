package week04_review;

public class Task5 {

    public static void main(String[] args) {

        String animal = "lion";

        if (animal.equalsIgnoreCase("DOG") || animal.equalsIgnoreCase("CAT")) {
            System.out.println("domestic animal");
        } else if (animal.equalsIgnoreCase("TIGER")) {
            System.out.println("wild animal");
        } else {
            System.out.println("unknown animal");
        }

    }
}
/*
Task 5:

Create  a program that accepts animal as String

							DOG 	- domestic animal
							CAT 	- domestic animal
							TIGER 	- wild  animal

							For other animal - unknown animal

							INPUT : DOG 		EXPECTED OUTPUT : DOG is domestic animal
 */