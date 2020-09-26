package videoyoutube;

public class Main {
    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("My Tube");
        video.setTitle("Chris Heria");
        video.setUser(new User("quangduyntt2000@gmail.com"));

        var processor = new VideoProcessor(new VideoEncoderH264(), new VideoDatabaseMySQL(), new EmailServiceGoogle());
        processor.process(video);
    }
}





















