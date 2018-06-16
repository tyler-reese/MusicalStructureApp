package com.example.android.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListAdapter extends ArrayAdapter<Song>  {

    public SongListAdapter(Context c, ArrayList<Song> songs) {
        super(c, R.layout.list_item, songs);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Song item = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.song_name_text_view);
        nameTextView.setText(item.getName());

        TextView artistTextView = listItemView.findViewById(R.id.song_artist_text_view);
        artistTextView.setText(item.getArtist());

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playSongIntent = new Intent(getContext(), PlaySongActivity.class);
                playSongIntent.putExtra(MainActivity.MUSICAPP_SONG_NAME, item.getName());
                playSongIntent.putExtra(MainActivity.MUSICAPP_SONG_ARTIST, item.getArtist());
                playSongIntent.putExtra(MainActivity.MUSICAPP_SONG_LENGTH, item.getLength());
                getContext().startActivity(playSongIntent);
            }
        });

        return listItemView;
    }
}
