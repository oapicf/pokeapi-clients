package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class PokemonShapeApiException extends MainApiException {
    public PokemonShapeApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}