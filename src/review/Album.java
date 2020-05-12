package review;

public class Album extends PlayableItem{
    private Song[] trackList;
    private String releaseDate;
    private String label;
    private String name;



    //you want to add parameters that contain the peices that are needed for your program to work
    public Album(Song[] trackList, String releaseDate, String label,String name){
        this.trackList = trackList;
        this.releaseDate = releaseDate;
        this.label = label;
        this.name = name;
    }


    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String albumName) {
        this.name = albumName;
    }

    public Song[] getTrackList(){
        return trackList;
    }

    public void setTrackList(Song[] trackList){
       this.trackList = trackList;
    }




}
