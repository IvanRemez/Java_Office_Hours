package week11.evening.Task3;

public class Password {

    private String username, password;

    public Password(String username, String password) {
        setUsername(username);
        setPassword(username, password);
    }

    public String getUsername(String prefix) {

        if (username.substring(0,3).equals(prefix)){
            return username;
        }else {
            return null;
        }
    }

    public void setUsername(String username) {

        if (this.username == null){
            this.username = username;
        }
    }

    public String getPassword(String username) {
        if (username.equals(this.username) && password != null){
            return password;
        }else {
            return "Please enter correct username";
        }

    }

    public void setPassword(String username, String password) {

        if (this.username.equals(username)){
            this.password = password;
        }else {
            this.password = null;
        }
    }

    @Override
    public String toString() {
        return "Password{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
/*
3. Create an encapsulated class called Password with attributes "password" and "username".
Create getters and setters with conditions inside them:

You can only set username if it is null,
You can only get username if you can provide first three characters correctly,

You can only set password if you provide username correctly.
You can only get password if it is not null and you can provide username correctly.

 */