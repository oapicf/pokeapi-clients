package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class GenerationApiException extends MainApiException {
    public GenerationApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}