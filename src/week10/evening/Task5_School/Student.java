package week10.evening.Task5_School;

import java.time.LocalDate;

public class Student {

    public String name;
    public char gender;
    public LocalDate dateOfBirth;
    public int age, studentID, grade;

    public Student(String name, char gender, LocalDate dateOfBirth, int studentID, int grade) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        // this.age = age; // can calculate using dateOfBirth:
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.studentID = studentID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
   /*
Task 5 :
1. create a class named Student that has the followings features:
			Attributes:
				name, gender, dateOfBirth(use LocalDate), age, studentID, grade
			Methods:
				sets all the attributes of the student object
				toString(): returns the full info of student Object
2. create a class which is School with main method
3. create a list of student in School class inside the static block
4. create a method in School class which is getting list of students as parameter
then return the list of students if the name start with "A"
     */