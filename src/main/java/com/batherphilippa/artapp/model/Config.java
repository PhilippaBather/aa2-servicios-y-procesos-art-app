package com.batherphilippa.artapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Config - información sobre los URLs usado por el Art Institute of Chicago.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Config {

    private String iifURL; // International Image Interoperability Framework URL
    private String websiteURL;
}
