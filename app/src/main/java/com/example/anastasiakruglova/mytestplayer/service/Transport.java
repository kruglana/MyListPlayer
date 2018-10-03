package com.example.anastasiakruglova.mytestplayer.service;

import android.support.annotation.NonNull;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Transport {
    public static final String HOST = "https://itunes.apple.com";

    static TransportService hostInstance() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(@NonNull Chain chain) throws IOException {
                        Request original = chain.request();

                        Request request = original.newBuilder()
                                .method(original.method(), original.body())
                                .build();

                        return chain.proceed(request);
                    }
                })
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(TransportService.class);
    }

}
