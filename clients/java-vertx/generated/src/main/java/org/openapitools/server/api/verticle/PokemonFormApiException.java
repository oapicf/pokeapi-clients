package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class PokemonFormApiException extends MainApiException {
    public PokemonFormApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}