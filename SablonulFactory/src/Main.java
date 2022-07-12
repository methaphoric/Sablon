public class Main {
    public static void main(String[] args) {

        User user = UserFactory.newUser("admin", "John");
        User user1 = UserFactory.newUser("superuser", "Gigi");
        User user2 = UserFactory.newUser("viewer", "Coca");

    }
}
