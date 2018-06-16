package com.example.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String MUSICAPP_SONG_NAME = "com.example.android.musicalstructureapp.SONG_NAME";
    public static final String MUSICAPP_SONG_ARTIST = "com.example.android.musicalstructureapp.SONG_ARTIST";
    public static final String MUSICAPP_SONG_LENGTH = "com.example.android.musicalstructureapp.SONG_LENGTH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songList = new ArrayList<>();

        songList.add(new Song("Song 1", "Artist 1", "2:59"));
        songList.add(new Song("Song 2", "Artist 1", "2:34"));
        songList.add(new Song("Song 3", "Artist 2", "2:57"));
        songList.add(new Song("Song 4", "Artist 2", "3:22"));
        songList.add(new Song("Song 5", "Artist 2", "3:48"));
        songList.add(new Song("Song 6", "Artist 3", "3:01"));
        songList.add(new Song("Song 7", "Artist 4", "2:49"));
        songList.add(new Song("Song 8", "Artist 5", "3:38"));
        songList.add(new Song("Song 9", "Artist 5", "4:12"));
        songList.add(new Song("Song 10", "Artist 5", "2:14"));
        songList.add(new Song("Song 11", "Artist 5", "2:55"));
        songList.add(new Song("Song 12", "Artist 5", "2:44"));
        songList.add(new Song("Song 13", "Artist 6", "2:33"));
        songList.add(new Song("Song 14", "Artist 6", "5:01"));
        songList.add(new Song("Song 15", "Artist 7", "2:59"));
        songList.add(new Song("Song 16", "Artist 7", "2:24"));
        songList.add(new Song("Song 17", "Artist 7", "1:56"));
        songList.add(new Song("Song 18", "Artist 8", "1:30"));
        songList.add(new Song("Song 19", "Artist 9", "4:31"));
        songList.add(new Song("Song 20", "Artist 9", "3:27"));

        SongListAdapter songAdapter = new SongListAdapter(this, songList);

        ListView songListView = findViewById(R.id.song_list_view);
        songListView.setAdapter(songAdapter);
    }
}
