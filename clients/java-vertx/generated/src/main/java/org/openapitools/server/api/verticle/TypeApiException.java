package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class TypeApiException extends MainApiException {
    public TypeApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}