package week11.evening.Encapsulation;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        for (char each : name.toCharArray()) {
            if(Character.isDigit(each)){
                System.out.println("Digits are not allowed in the name");
                System.exit(1);
            }
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
