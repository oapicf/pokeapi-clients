package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class PokeathlonStatApiException extends MainApiException {
    public PokeathlonStatApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}