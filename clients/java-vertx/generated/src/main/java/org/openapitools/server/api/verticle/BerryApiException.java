package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class BerryApiException extends MainApiException {
    public BerryApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}