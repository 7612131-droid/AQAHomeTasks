package java_hw_6_1_3;

public class Video extends Media {
    private String resolution;

    public Video(String title, int duration, String resolution){
        super(title,duration);
        this.resolution=resolution;
    }

    @Override
    public String toString() {
        return "Video{" +
                "resolution='" + resolution + '\'' +
                '}';
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Playing video" + " " + getTitle() + " " + "at" + " " + resolution + " " + "resolution");

    }
}

