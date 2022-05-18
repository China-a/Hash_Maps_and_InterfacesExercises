package Interfaces.InterfaceInABox_Exercise;

public class CD implements Packable{
    @Override
    public Double weight() {
        return 0.1 ;
    }

    private String cdArtist;
    private String cdSongTitle;
    private Integer cdReleaseYear;

    private Double weight = 0.1;

    public CD( String cdArtist, String cdSongTitle, Integer cdReleaseYear) {
        this.cdArtist = cdArtist;
        this.cdSongTitle = cdSongTitle;
        this.cdReleaseYear = cdReleaseYear;
    }

    public String getCdArtist() {
        return cdArtist;
    }

    public String getCdSongTitle() {
        return cdSongTitle;
    }

    public Integer getCdReleaseYear() {
        return cdReleaseYear;
    }

    public String toString() {
        return getCdArtist() + ": " + getCdSongTitle() + " (" + getCdReleaseYear() + ")";
    }
}
