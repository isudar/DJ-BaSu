package com.example.sudo.basu;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sudo.basu.models.Music;
import com.example.sudo.basu.utils.DatabaseHelper;
import com.example.sudo.basu.utils.MusicAdapter;
import com.example.sudo.basu.utils.PlaylistAdapter;

import java.util.ArrayList;
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


       // final List<Music> musics = databaseHelper.getMusics();

        List<Music> musics = new ArrayList<Music>();
        musics.add(new Music((long) 1, "Moj Ivane", "Tomson", "3:45"));
        musics.add(new Music((long) 2, "Adio", "Sandrica", "3:47"));
        musics.add(new Music((long) 3, "Lopove", "maja", "3:45"));

        final MusicAdapter musicAdapter = new MusicAdapter(this, musics);

        lvGlazba.setAdapter(musicAdapter);
    }
}
