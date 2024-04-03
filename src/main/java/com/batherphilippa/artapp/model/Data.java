package com.batherphilippa.artapp.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Data - una lista de las obras de un artista.
 */
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Data {
    private List<Artwork> data;
}
