package br.com.alura.minhasmusicas.modelos;

public class Music extends Audio {
    private String album;
    private String artist;
    private String gender;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public double getClassification() {
        if (this.getTotalReproductions() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
