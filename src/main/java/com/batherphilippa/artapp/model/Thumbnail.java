package com.batherphilippa.artapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Thumbnail - contiene una descripción de la obra y información sobre la imagén.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Thumbnail {

    private String altText;
    private int width;
    private String lqip; // low quality image placeholder
    private int height;
}
