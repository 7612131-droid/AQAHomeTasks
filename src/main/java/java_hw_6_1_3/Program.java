package java_hw_6_1_3;

public class Program {
    public static void main(String[] args) {
        Music music = new Music("Song", 3, "Rotaru");
        Video video = new Video("Movie", 120, "1920x1080");

        Media music1 = new Music("Song", 3, "Bes obmegen");
        music1.play();

        Media video1 = new Video("Movie", 120, "1920x1080");
        video1.play();

        Media.playingMedia(music1);
        Media.playingMedia(video1);


    }
}
