package com.batherphilippa.artapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Artwork - información sobre la obra de un artista.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artwork {
    private float score;  // _score
    private Thumbnail thumbnail;
    private String apiModel;
    private boolean isBoosted;
    private String apiLink;
    private long id;
    private String title;
    private LocalDateTime timestamp; // timestamp of the search

}
