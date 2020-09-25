package videoyoutube;

public class EmailServiceGoogle implements EmailService {
    @Override
    public void sendEmail(User user) {
        System.out.println("Sent!");
    }
}
