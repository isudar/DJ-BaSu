package com.example.sudo.basu.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sudo.basu.R;
import com.example.sudo.basu.models.Playlist;

import java.util.List;

/**
 * Created by Sudo on 8.2.2018..
 */

public class PlaylistAdapter extends BaseAdapter {

    private Context context;

    public PlaylistAdapter(List<Playlist> playlists, Context context) {
        this.context = context;
        this.playlists = playlists;
    }

    private List<Playlist> playlists;

    @Override
    public int getCount() {

        return playlists.size();
    }

    @Override
    public Playlist getItem(int position) {
        return playlists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return playlists.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.item_playlist, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Playlist playlist = playlists.get(position);
        viewHolder.tvPlaylist.setText(playlist.getName());
        return convertView;
    }

    private static class ViewHolder {

        public TextView tvPlaylist;
        public ViewHolder(View view) {
            tvPlaylist = (TextView) view.findViewById(R.id.tvPlaylista);
        }
    }
}
