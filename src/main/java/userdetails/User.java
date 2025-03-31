package userdetails;

public class User {
    private String username;
    private String password;

    //Constructor
    public User(String username, String password) {
        this.username = username;
        this.password= password;
    }

    //get methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String newName) {
        username  =newName;
    }

    public void setPassword(String newpPassword) {
        password = "password123";
    }
}
