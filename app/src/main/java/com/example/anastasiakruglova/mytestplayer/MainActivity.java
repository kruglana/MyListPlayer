package com.example.anastasiakruglova.mytestplayer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.anastasiakruglova.mytestplayer.model.SongInfo;
import com.example.anastasiakruglova.mytestplayer.adapters.ListAdapter;
import com.example.anastasiakruglova.mytestplayer.model.SongInfo;
import com.example.anastasiakruglova.mytestplayer.service.RequestManager;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import java.util.List;


@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewById
    RecyclerView listSongs;

    @ViewById
    EditText search_edit_text;

    @ViewById
    ImageView search_icon;

    @ViewById
    ImageView search_clear;

    private RecyclerView.Adapter mAdapter;

    @AfterViews
    void initActivity() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getListOfSongs("la-la-la");
    }

    @Background
    void getListOfSongs(String searchName) {
        onGetListOfSongs(RequestManager.getInstance().getListSongs(searchName));
    }

    @UiThread
    void onGetListOfSongs(List<SongInfo> data) {
        // use a linear layout manager
        listSongs.setLayoutManager(new LinearLayoutManager(this));

        // specify an adapter (see also next example)
        mAdapter = new ListAdapter(data);
        listSongs.setAdapter(mAdapter);
    }

    @Click(R.id.search_icon)
    void clickSearch() {
        String searchLine;
        searchLine = search_edit_text.getText().toString();
        if(searchLine.length() < 5) {
            Toast.makeText(this, "Для поиска необходимо более 5 символов", Toast.LENGTH_SHORT);
        } else {
            getListOfSongs(searchLine);
        }
    }

    @Click(R.id.search_clear)
    void clickClear() {
        search_edit_text.setText("");
    }


}
