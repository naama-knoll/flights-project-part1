package pocoPackage;

import BusniessLogics.UserRole;

public class User implements POCO{
    public long id;
    public String username;
    public String password;
    public String email;
    public int userRole;

    public User(long id,String username, String password, String email, int userRole) {
        this.id=id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.userRole =userRole;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userRole=" + userRole +
                '}';
    }
}
