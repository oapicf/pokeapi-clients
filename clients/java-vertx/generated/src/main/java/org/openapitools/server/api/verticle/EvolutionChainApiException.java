package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class EvolutionChainApiException extends MainApiException {
    public EvolutionChainApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}