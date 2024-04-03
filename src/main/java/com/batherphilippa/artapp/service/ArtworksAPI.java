package com.batherphilippa.artapp.service;

import com.batherphilippa.artapp.model.Artworks;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface ArtworksAPI {

    @GET("api/v1/artworks/search?q={artist}")  // TODO - do I need a forward slash before 'api'?
    Observable<Artworks> getArtworksByArtist(@Path("artist") String word);
}
