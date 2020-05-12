package review;

public class Song extends PlayableItem {

    private String title;
    private String artist;
    private byte trackNumber = 0;
//    private byte trackNumber;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
//        this.trackNumber +=1;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
