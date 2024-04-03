package com.batherphilippa.artapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Info - información sobre la licencia.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Info {

    private String licenseText;
    private List<String> licenseLinks;
    private String version;
}
