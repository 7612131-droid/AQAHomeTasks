package java_hw_6_1_3;

public class Music extends Media{
    private String artist;

    public Music(String title, int duration, String artist){
        super(title,duration);
        this.artist=artist;
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}';
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void play(){
        super.play();
        System.out.println("Music is playing"+ " " + artist + " " + getTitle() );
    }
}
