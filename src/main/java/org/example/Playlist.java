package org.example;

public class Playlist {
    private Song[] playlist;
    private int songCount;

    public Playlist() {
        playlist = new Song[10];
        songCount = 0;
    }

    public void addSong(Song song) {
        if (songCount > 10) {
            System.out.println("This playlist is full");
        }

        playlist[songCount++] = song;
    }

    public void viewPlaylist() {
        System.out.println("Songs in playlist");
        for (int i = 0; i < songCount; i++) {
            System.out.printf("Index %d - %s", i, playlist[i].getTitle());
        }
    }

    public Song[] filterRating(double rating) {
        int count = 0;
        for (int i = 0; i < songCount; i++) {
            if (playlist[i].getRating() > rating) count++;
        }
        Song[] filteredSong = new Song[count];
        int filteredSongCount = 0;
        for (int i = 0; i < songCount; i++) {
            if (playlist[i].getRating() > rating) {
                filteredSong[filteredSongCount++] = playlist[i];
            }
        }
        return filteredSong;
    }

    public void removeSong(int songIndex) {
        if (songIndex < 0 && songIndex > songCount) {
            System.out.println("Invalid song index");
        }

        for (int i = songIndex; i < songCount; i++) {
            playlist[i] = playlist[i + 1];
        }
        int lastSongIndex = songCount - 1;
        playlist[lastSongIndex] = null;
        songCount--;
    }
}
