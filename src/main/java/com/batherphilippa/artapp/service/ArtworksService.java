package com.batherphilippa.artapp.service;

import com.batherphilippa.artapp.model.Data;
import com.batherphilippa.artapp.model.Artworks;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ArtworksService {

    private final String BASE_URL = "https://api.artic.edu";
    private final ArtworksAPI artworksAPI;  // acceso a los endpoints

    public ArtworksService() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        // configure HTTP client
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        // Google json parser
        Gson gsonParser = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gsonParser))
                // allows us to use observables and simulate a reactive api
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();


        // crear la interfaz
        this.artworksAPI = retrofit.create(ArtworksAPI.class);
    }

    public Observable<String> getArtworks(String artist) {
        return this.artworksAPI.getArtworksByArtist(artist)
                .map(Artworks::getData)
                .flatMapIterable(data -> data)
                .map(Data::getTitle);
    }
}
