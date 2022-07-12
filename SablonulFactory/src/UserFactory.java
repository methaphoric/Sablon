public class UserFactory {
    public static User newUser(String userType, String username) {
        User user=null;
        switch (userType) {
            case "viewer":
                user = new Viewer(username);
                break;
            case "admin":
                user = new Admin(username);
                break;
            case "superuser":
                user = new Superuser(username);
                break;
        }
        return user;
    }
}
