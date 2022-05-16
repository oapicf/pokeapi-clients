package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class PokemonApiException extends MainApiException {
    public PokemonApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}