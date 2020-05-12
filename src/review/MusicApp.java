package review;

public class MusicApp {
    public static void main(String[] args) {

        Song[] trackList = {
                new Song("Anymore", "Goldfrapp"),
                new Song("Systematic Magic", "Goldfrapp"),
                new Song("Tigerman", "Goldfrapp"),
                new Song("Become the one", "Goldfrapp"),
                new Song("Become the one", "Goldfrapp")
        };

//        Album record = new Album(null, "2017", "Mute artists", "Silver Eye");
        Album record = new Album(trackList, "2017", "Mute artists", "Silver Eye");

        PlayableItem mp3Player = new PlayableItem();

        mp3Player.play(record);
        mp3Player.play(trackList[trackList.length-1]);


//        Song myFavSong = new Song("Anymore", "Goldfrapp");

    }
}
