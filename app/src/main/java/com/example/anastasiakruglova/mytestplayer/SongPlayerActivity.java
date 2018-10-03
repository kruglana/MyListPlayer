package com.example.anastasiakruglova.mytestplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.anastasiakruglova.mytestplayer.model.SongInfo;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_player)
public class SongPlayerActivity extends AppCompatActivity {

    @ViewById
    TextView author;

    @ViewById
    TextView song;

    @ViewById
    ImageView art;

    @Extra
    SongInfo songInfo;

    @AfterViews
    void initActivity() {
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if(songInfo != null) {
            author.setText(songInfo.getArtistName());
            song.setText(songInfo.getTrackName());

            Glide
                    .with(this)
                    .load(songInfo.getArtworkUrl100())
                    .into(art);

            SimpleExoPlayer player = ExoPlayerFactory.newSimpleInstance(this);

            // Bind the player to the view.
           // playerView.setPlayer(player);

                Uri uriBase = Uri.parse(songInfo.getPreviewUrl().toString());
                DataSource.Factory dataSourceFactory =
                        new DefaultDataSourceFactory(this, Util.getUserAgent(this, "MyPlayer"));
                MediaSource mediaSource = new DashMediaSource.Factory(dataSourceFactory)
                        .createMediaSource(uriBase);
                player.prepare(mediaSource);
        }
        else {
            // may be error
            return;
        }
    }

    @OptionsItem(android.R.id.home)
    void home() {
        finish();
    }

}
