package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class GenderApiException extends MainApiException {
    public GenderApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}