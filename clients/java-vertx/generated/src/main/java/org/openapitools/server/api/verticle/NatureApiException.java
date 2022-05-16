package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class NatureApiException extends MainApiException {
    public NatureApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}