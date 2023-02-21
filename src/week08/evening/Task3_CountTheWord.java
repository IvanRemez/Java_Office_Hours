package week08.evening;

public class Task3_CountTheWord {

    public static void main(String[] args) {

        String[] names = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

        // we need to check each name:

        int count = 0;

        for (String eachName : names) {

            // get the 1st char of each name
            char firstChar = eachName.toLowerCase().charAt(0);

            // get the last char of each name
            char lastChar = eachName.toLowerCase().charAt(eachName.length() - 1);

            if (firstChar == lastChar){

                count++;
            }

        }
        System.out.println(count);
    }
}
/*
 Task 3 : Write a program that accepts String array. Count how many names have the
            same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus",
                            "Mehmet","Asya"

                Output : 4
 */