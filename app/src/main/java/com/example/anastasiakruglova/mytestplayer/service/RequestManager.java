package com.example.anastasiakruglova.mytestplayer.service;

import com.example.anastasiakruglova.mytestplayer.model.ResponceObject;
import com.example.anastasiakruglova.mytestplayer.model.SongInfo;

import java.util.List;

import retrofit2.Response;

public class RequestManager {
    private static RequestManager mInstance;
    private final TransportService mService;

    private RequestManager() {
        mService = TransportHolder.getServiceInstance();
    }

    public static RequestManager getInstance() {
        synchronized (RequestManager.class) {
            if (mInstance == null) {
                mInstance = new RequestManager();
            }
        }
        return mInstance;
    }

    public List<SongInfo> getListSongs(String searchKeyword) {
        try {
            Response<ResponceObject> response = mService.getSongs(searchKeyword).execute();
            ResponceObject resp = response.body();
            List<SongInfo> list = resp.getResults();
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
