package week10.evening.Task5_School;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

    static ArrayList<Student> students = new ArrayList<>();

    static { // used to initialize static variables : students

        Student student1=new Student("Fatih",'M', LocalDate.of(
                2000,1,1),1,10);
        Student student2=new Student("Marvin",'M', LocalDate.of(
                1988,1,1),1,10);
        Student student3=new Student("Sergii",'M', LocalDate.of(
                1967,1,1),1,10);
        Student student4=new Student("Dan",'M', LocalDate.of(
                2000,1,1),1,10);
        Student student5=new Student("Vasyl",'M', LocalDate.of(
                1989,1,1),1,10);
        Student student6=new Student("Alisher",'M', LocalDate.of(
                2000,1,1),1,10);
        Student student7=new Student("Latifa",'F', LocalDate.of(
                1967,1,1),1,10);
        Student student8=new Student("Annie",'F', LocalDate.of(
                1976,1,1),1,10);
        Student student9=new Student("Eshwa",'F', LocalDate.of(
                2000,1,1),1,10);

        students.addAll(Arrays.asList(student1,student2,student3,student4,
                student5,student6,student7,student8,student9));
    }

    public static void main(String[] args) {

        ArrayList<Student> result = findStudentsByNameA('A');

        System.out.println(result);

    }

    private static ArrayList<Student> findStudentsByNameA(char firstChar) {

        ArrayList<Student> result = new ArrayList<>();

        for (Student eachStudent : students) {

            if (eachStudent.name.charAt(0) == firstChar){
                result.add(eachStudent);
            }
        }
        return result;
    }
}
/*
2. create a class which is School with main method
3. create a list of student in School class inside the static block
4. create a method in School class which is getting list of students as parameter
then return the list of students if the name start with "A"
 */