package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class LocationAreaApiException extends MainApiException {
    public LocationAreaApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}