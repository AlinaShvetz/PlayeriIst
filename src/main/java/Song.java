


public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public static Song createsong(String title, Double duration) {
        return new Song(title, duration);
    }

    public String toString() {
        return "Song{title='" + this.title + "', duration=" + this.duration + "}";
    }

    public String getTitle() {
        return this.title;
    }

    public double getDuration() {
        return this.duration;
    }
}
