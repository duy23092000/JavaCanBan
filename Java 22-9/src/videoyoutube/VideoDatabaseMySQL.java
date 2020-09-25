package videoyoutube;

public class VideoDatabaseMySQL implements VideoDatabase {
    @Override
    public void store(Video video) {
        System.out.println("You are using mySQL database!");
        System.out.println("Title: " + video.getTitle());
        System.out.println("File Name: " + video.getFileName());
        System.out.println("Done!");
    }
}
