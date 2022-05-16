package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class MoveApiException extends MainApiException {
    public MoveApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}