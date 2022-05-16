package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class ContestEffectApiException extends MainApiException {
    public ContestEffectApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}