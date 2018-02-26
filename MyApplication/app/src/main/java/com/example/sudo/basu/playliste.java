package com.example.sudo.basu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.sudo.basu.models.Playlist;
import com.example.sudo.basu.utils.DatabaseHelper;
import com.example.sudo.basu.utils.PlaylistAdapter;

import java.util.ArrayList;
import java.util.List;

public class playliste extends Activity {

    private ListView lvListe;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playliste);
        setUI();
    }

    private void setUI() {
        lvListe = (ListView) findViewById(R.id.lvListe);

        databaseHelper = DatabaseHelper.getInstance(this);

        //final List<Playlist> playlists = databaseHelper.getPlaylists();

        List<Playlist> playlists = new ArrayList<Playlist>();
        playlists.add(new Playlist((long) 1, "Kuca"));


        final PlaylistAdapter playlistAdapter = new PlaylistAdapter(playlists, this);
        lvListe.setAdapter(playlistAdapter);
        lvListe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(playliste.this, pjesme.class);

                playliste.this.startActivity(intent);
            }
        });
    }
}
