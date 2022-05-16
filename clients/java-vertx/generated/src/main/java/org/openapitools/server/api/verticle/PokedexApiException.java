package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class PokedexApiException extends MainApiException {
    public PokedexApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}