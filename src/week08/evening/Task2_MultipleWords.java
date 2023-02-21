package week08.evening;

public class Task2_MultipleWords {

    public static void main(String[] args) {

        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, " +
                "fridge, dish washer";

        String[] words = str.split(", "); // separates words using ", " indicator
        // and adds each word as an element to the words array
        // ** this gets RID of the INDICATOR ", " when creating array

        for (String eachWord : words) {

            if (eachWord.contains(" ")){ // if element is made up of multiple words
                // (contains " " space), print the element
                System.out.println(eachWord);
            }
        }

    }
}
/*
Task 2 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge,
        dish washer"

        output : wooden spoons
                 trash can
                 dish washer
 */