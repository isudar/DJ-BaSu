package com.example.sudo.basu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sudo.basu.models.Music;
import com.example.sudo.basu.utils.DatabaseHelper;
import com.example.sudo.basu.utils.MusicAdapter;
import com.example.sudo.basu.utils.PlaylistAdapter;

import java.util.List;

public class pjesme extends Activity {

    private ListView lvGlazba;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pjesme);
        setUI();
    }

    private void setUI() {
        lvGlazba = (ListView) findViewById(R.id.lvGlazba);

        databaseHelper = DatabaseHelper.getInstance(this);

        final List<Music> musics = databaseHelper.getMusics();

        final MusicAdapter musicAdapter = new MusicAdapter(this, musics);

        lvGlazba.setAdapter(musicAdapter);
    }
}
