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
    private float _score;  // _score
    private Thumbnail thumbnail;
    private String api_model;
    private boolean is_boosted;
    private String api_link;
    private long id;
    private String title;
    private LocalDateTime timestamp; // timestamp of the search

}
