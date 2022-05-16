package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class PokemonSpeciesApiException extends MainApiException {
    public PokemonSpeciesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}