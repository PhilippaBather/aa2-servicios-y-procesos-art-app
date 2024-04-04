package com.batherphilippa.artapp.service;

import com.batherphilippa.artapp.model.ArtworkOutput;
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

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);

        // configurar HTTP client
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(loggingInterceptor).build();

        // Google JSON parser
        Gson gsonParser = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gsonParser))
                // permite el uso de observables y simula una API reactiva
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        // crear la interfaz
        this.artworksAPI = retrofit.create(ArtworksAPI.class);
    }

    public Observable<ArtworkOutput> getArtworks(String artist) {
        // TODO
        return  null;
    }
}
