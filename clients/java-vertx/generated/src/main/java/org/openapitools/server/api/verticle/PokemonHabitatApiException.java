package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class PokemonHabitatApiException extends MainApiException {
    public PokemonHabitatApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}