package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class MoveTargetApiException extends MainApiException {
    public MoveTargetApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}