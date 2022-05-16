package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class PokemonColorApiException extends MainApiException {
    public PokemonColorApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}