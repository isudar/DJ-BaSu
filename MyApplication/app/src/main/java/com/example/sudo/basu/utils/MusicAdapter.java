package com.example.sudo.basu.utils;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.sudo.basu.R;
import com.example.sudo.basu.models.Music;
import com.example.sudo.basu.models.Playlist;
import com.example.sudo.basu.pjesme;

import java.util.List;

/**
 * Created by Sudo on 10.2.2018..
 */

public class MusicAdapter extends BaseAdapter {

    private Context context;
    private List<Music> musics;

    public MusicAdapter(List<Music> context, pjesme musics) {
        this.context = context;
        this.musics = musics;
    }

    @Override
    public int getCount() {
        return musics.size();
    }

    @Override
    public Object getItem(int position) {
        return musics.get(position);
    }

    @Override
    public long getItemId(int position) {
        return musics.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.item_music, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Music music = musics.get(position);
        viewHolder.tvImeItem.setText(music.getName());
        viewHolder.tvArtist.setText(music.getArtist());
        viewHolder.tvDuration.setText(music.getDuration());
        return convertView;
    }

    private static class ViewHolder {
        public TextView tvImeItem, tvArtist, tvDuration;
        public ImageButton ibPlay, ibDelete;

        public ViewHolder(View view){
            tvImeItem = (TextView) view.findViewById(R.id.tvImeItem);
            tvArtist  = (TextView) view.findViewById(R.id.tvArtist);
            tvDuration = (TextView) view.findViewById(R.id.tvDuration);
            ibPlay = (ImageButton) view.findViewById(R.id.ibPlay);
            ibDelete = (ImageButton) view.findViewById(R.id.ibDelete);
        }
    }
}
