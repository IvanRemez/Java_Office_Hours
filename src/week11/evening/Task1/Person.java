package week11.evening.Task1;

public class Person {

    private String firstName, lastName;
    private int age;
    //constructors

//this is NOT default constructor, this is no arg constructor:
    public Person() {
        //change the default values
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1;
    }

    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        for (char each : firstName.toCharArray()) {
            if(Character.isDigit(each) || !Character.isLetterOrDigit(each) || Character.isSpaceChar(each)){
                System.err.println("Digits, special characters, and spaces are not allowed in the name");
                System.exit(1);
            }
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        for (char each : lastName.toCharArray()) {
            if(Character.isDigit(each) || !Character.isLetterOrDigit(each) || Character.isSpaceChar(each)){
                System.err.println("Digits, special characters, and spaces are not allowed in the name");
                System.exit(1);
            }
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
 1.
       Person class has the following attributes:

       - private String instance variables: firstName, lastName
       - private int instance variable: age

       Methods:
       - getter and setter methods for each instance variable. try to use this. keyword
       - toString method.No parameters and Returns(does not print! no println in the method!)
       person info in this format: "firstName | lastName | age"

       Constructors:

       1) No-Args constructor
       -sets default values for the Person object
       name and lastName => "undefined"
       age => -1

       2) 3-Args Constructor:
       - accepts firstName, lastName, age parameters and assigns
       values to encapsulated instance variable
       try to use this. keyword
 */