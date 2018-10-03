package com.example.anastasiakruglova.mytestplayer.service;

import com.example.anastasiakruglova.mytestplayer.model.ResponceObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TransportService {
    //search?term={searchLine}           https://itunes.apple.com/search?term==SEARCH_KEYWORD
    @GET("/search")
    Call<ResponceObject> getSongs(@Query("term") String search_keyword);
}
