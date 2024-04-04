package com.batherphilippa.artapp.service;

import com.batherphilippa.artapp.model.Artworks;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;


public interface ArtworksAPI {

    @Headers({"Accept: application/json"})
    @GET("api/v1/artworks/search")
    Observable<Artworks> getArtworksByArtist(@Query("q") String q);
}
