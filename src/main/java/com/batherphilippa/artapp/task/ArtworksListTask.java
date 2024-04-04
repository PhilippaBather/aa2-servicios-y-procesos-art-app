package com.batherphilippa.artapp.task;

import com.batherphilippa.artapp.model.ArtworkOutput;
import com.batherphilippa.artapp.service.ArtworksService;
import io.reactivex.functions.Consumer;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;

/**
 * ArtworksListTask - maneja la llamada al ArtworkService para conseguir de forma asíncrona los datos de obras de un
 * artista.
 */
public class ArtworksListTask extends Task<Integer> {
    private final String artistQuery;
    private final ObservableList<ArtworkOutput> artworks;

    public ArtworksListTask(String artistQuery, ObservableList<ArtworkOutput> artworks) {
        this.artistQuery = artistQuery;
        this.artworks = artworks;
    }

    @Override
    protected Integer call() throws Exception {
        ArtworksService artworksService = new ArtworksService();

        // consumer recibe los detalles del obra desde el stream y duerme para simular concurrencia
        Consumer<ArtworkOutput> consumer = (artworkDetails) -> {
            Thread.sleep(250);
            // previene un error mientras que la UI está cambiada
            Platform.runLater(() -> this.artworks.add(artworkDetails));
        };

        artworksService.getArtworks(artistQuery).subscribe(consumer);

        return null;
    }
}
