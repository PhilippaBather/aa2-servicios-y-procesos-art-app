package com.batherphilippa.artapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Pagination - información sobre la paginación de la busqueda.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pagination {

    private int total;
    private int limit;
    private int offset;
    private int totalPages;
    private int currentPage;
}
