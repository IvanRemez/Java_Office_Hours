package week11.evening.Task2;

public class Login {

    public static void main(String[] args) {

        Credentials credentials = new Credentials("Adam123", "Test2345");

        System.out.println(credentials.getUsername());
        System.out.println(credentials.getPassword());

        System.out.println(credentials);


    }
}
