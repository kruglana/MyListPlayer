package com.example.anastasiakruglova.mytestplayer.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.anastasiakruglova.mytestplayer.R;
import com.example.anastasiakruglova.mytestplayer.model.SongInfo;
import com.example.anastasiakruglova.mytestplayer.SongPlayerActivity_;

import java.util.ArrayList;
import java.util.List;


public class ListAdapter extends  RecyclerView.Adapter<ListAdapter.ListHolder> {

    private List<SongInfo> songs = new ArrayList<>();
    static Context context;

    public ListAdapter(List<SongInfo> songs) {
        this.songs = songs;
    }

    @NonNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View viewHolder = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ListHolder listHoler = new ListHolder(viewHolder);
        context = parent.getContext();
        return listHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull ListHolder listHolder, int i) {
        listHolder.bind(songs.get(i));
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public static class ListHolder extends RecyclerView.ViewHolder {

        private ImageView art;
        private TextView author;
        private TextView song;
        private CardView card;

        public ListHolder(@NonNull View itemView) {

            super(itemView);
            art = itemView.findViewById(R.id.art);
            author = itemView.findViewById(R.id.author);
            song = itemView.findViewById(R.id.song);
            card = itemView.findViewById(R.id.card);
        }

        public void bind(final SongInfo info) {
            song.setText(info.getTrackName());
            author.setText(info.getArtistName());
            Glide
                    .with(context)
                    .load(info.getArtworkUrl100())
                    .into(art);
            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        SongPlayerActivity_
                                .intent(context)
                                .songInfo(info)
                                .start();
                        return;
                }
            });
        }

    }

}
