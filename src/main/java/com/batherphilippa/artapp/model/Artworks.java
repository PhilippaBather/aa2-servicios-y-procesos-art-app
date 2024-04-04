package com.batherphilippa.artapp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Artworks - los data de obras recibidos según una busqueda para un artista.
 */
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Artworks {
    private String preference;
    private Pagination pagination;
    private List<Data> data;
    private Info info;
    private Config config;
}
