package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class EggGroupApiException extends MainApiException {
    public EggGroupApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}