package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class LocationApiException extends MainApiException {
    public LocationApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}