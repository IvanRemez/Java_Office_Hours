package week11.evening.Task3;

public class TestPasswordObjects {

    public static void main(String[] args) {

        Password credentials = new Password("Adam1234","Test12345");

        System.out.println(credentials);

        credentials.setUsername("Magic");
        System.out.println(credentials);

        System.out.println(credentials.getUsername("Ada"));

        credentials.setPassword("Adam1234","Test1");
        System.out.println(credentials);

        System.out.println(credentials.getPassword("Adam1234"));
    }
}
