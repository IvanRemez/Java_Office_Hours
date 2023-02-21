package week11.evening.Task2;

public class Credentials {

    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        for (char each : username.toCharArray()) {

            if (!Character.isLetterOrDigit(each)){
                System.err.println("Only letters(a-z), digits(0-9), and periods (.) are allowed.");
                System.exit(1);
            }
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        int numOfUpperCaseLetters = 0;

        for (char each : password.toCharArray()) {

            if (!Character.isLetterOrDigit(each)){
                System.err.println("Password must contain at least 1 Special character");
                System.exit(1);
            }
            if (Character.isSpaceChar(each)){
                System.err.println("Password cannot contain spaces");
                System.exit(1);
            }

            if (Character.isUpperCase(each)){
                numOfUpperCaseLetters++;
            }
        }
        if (numOfUpperCaseLetters < 1){
            System.err.println("Password must contain at least 1 Uppercase letter");
            System.exit(1);
        }
        this.password = password;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
2. Create an encapsulated class called Credentials
with attributes username and password,
which are already initialized with some values in the
same Credentials class.
Create another class Login, to set and get values of Credentials class.

 put your conditions  for password
        - at least one upper case
        - at least one special chars
        - do not use space in your password
        __________________
        conditon for username
        - you can only use letter and digit and .


 */