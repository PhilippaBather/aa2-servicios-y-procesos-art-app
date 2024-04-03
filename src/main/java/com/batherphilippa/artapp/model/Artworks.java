package com.batherphilippa.artapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Artworks - los datos de obras recibidos según una busqueda para un artista.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artworks {
    private String preference;
    private Pagination pagination;
    private com.batherphilippa.artapp.model.Data data;
    private Info info;
    private Config config;
}
