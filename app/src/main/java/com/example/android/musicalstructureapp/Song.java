package com.example.android.musicalstructureapp;

public class Song {
    private String name;
    private String artist;
    private String length;

    public Song(String name, String artist, String length) {
        this.name = name;
        this.artist = artist;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getLength() {
        return length;
    }
}
