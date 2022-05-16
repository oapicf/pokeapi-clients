package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class StatApiException extends MainApiException {
    public StatApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}