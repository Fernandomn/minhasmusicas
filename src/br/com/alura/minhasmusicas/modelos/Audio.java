package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String title;
    private int durationTime;
    private int totalReproductions;
    private int totalLikes;

    public void giveLike() {
        this.totalLikes++;
    }

    public void play() {
        this.totalReproductions++;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public double getClassification() {
        return classification;
    }

    public int getDurationTime() {
        return durationTime;
    }

    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }

    private double classification;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
