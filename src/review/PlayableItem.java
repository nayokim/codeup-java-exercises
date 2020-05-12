package review;

public class PlayableItem {

    private byte count;

    public void play(Album album){
        System.out.println("play album: " + album.getName());
        for (Song currentSong : album.getTrackList()){
//            System.out.println("Playing song: " + currentSong);
            this.play(currentSong);
        }
    }
    //method overlaoding
    public void play(Song song){
        System.out.println("Playing song: " + song.getTitle() + " from " + song.getArtist());
    }
}
