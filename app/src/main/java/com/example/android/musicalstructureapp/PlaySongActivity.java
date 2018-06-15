package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PlaySongActivity extends AppCompatActivity {

    private String songName = "";
    private String songArtist = "";
    private String songLength = "";

    TextView playSongNameTextView;
    TextView playSongArtistTextView;
    TextView playSongLengthTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        if (savedInstanceState == null) {
            // this path gets executed only once, at startup
            // get the data passed from MainActivity
            Intent intent = getIntent();
            songName = intent.getStringExtra(MainActivity.MUSICAPP_SONG_NAME);
            songArtist = intent.getStringExtra(MainActivity.MUSICAPP_SONG_ARTIST);
            songLength = intent.getStringExtra(MainActivity.MUSICAPP_SONG_LENGTH);
        }

        playSongNameTextView = findViewById(R.id.playsong_name);
        playSongArtistTextView = findViewById(R.id.playsong_artist);
        playSongLengthTextView = findViewById(R.id.playsong_length);

        playSongNameTextView.setText(songName);
        playSongArtistTextView.setText(songArtist);
        playSongLengthTextView.setText(songLength);
    }
}
