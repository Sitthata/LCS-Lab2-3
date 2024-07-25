package org.example;

public class Song {
    private String title;
    private String artist;
    private String album;
    private double duration;
    private double rating;

    public Song(String title, String artist, String album, double duration, double rating) {
        this.title = (title != null) ? title : "Untitled";
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.rating = rating;
    }

    // Default constructor
    public Song() {
        this("Untitled", null, null, 0.0, 0.0);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public double getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            System.out.println("Rating should be between 0.0 and 5.0");
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + ((artist != null) ? artist : "Unknown"));
        System.out.println("Album: " + ((album != null) ? album : "Unknown"));
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rating: " + rating + "/5.0");
    }

    public boolean isLongSong() {
        return this.duration > 1.30;
    }
}
