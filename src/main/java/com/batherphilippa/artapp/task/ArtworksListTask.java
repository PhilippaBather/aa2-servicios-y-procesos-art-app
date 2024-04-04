package com.batherphilippa.artapp.task;

import com.batherphilippa.artapp.service.ArtworksService;
import io.reactivex.functions.Consumer;
import javafx.concurrent.Task;

/**
 * ArtworksListTask - maneja la llamada al ArtworkService para conseguir de forma asíncrona los datos de obras de un
 * artista.
 */
public class ArtworksListTask extends Task<Integer> {
    private final String artistQuery;

    public ArtworksListTask(String artistQuery) {
        this.artistQuery = artistQuery;
    }

    @Override
    protected Integer call() throws Exception {

        ArtworksService artworksService = new ArtworksService();

        // consumer recibe los detalles del obra desde el stream y duerme para simular concurrencia
        Consumer<String> consumer = (title) -> {
            Thread.sleep(250);
            System.out.println(title);  // TODO - remove: for testing
        };

        artworksService.getArtworks(artistQuery).subscribe(consumer);

        return null;
    }
}
