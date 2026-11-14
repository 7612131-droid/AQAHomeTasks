package java_hw_6_1_3;

public class Media {

    private String title;
    private int duration;

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;

    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public void play() {
        System.out.println("Multimedia playback" + " " + title + " " + duration + " " + "minutes");
    }

    public static void playingMedia(Media media) {
        media.play();
    }

}