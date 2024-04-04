package com.batherphilippa.artapp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Data - información sobre la obra de un artista.
 */
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Data {
    private float score;  // _score
    private Thumbnail thumbnail;
    private String apiModel;
    private boolean isBoosted;
    private String apiLink;
    private long id;
    private String title;
    private String timestamp; // timestamp of the search

}
