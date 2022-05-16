package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class EncounterMethodApiException extends MainApiException {
    public EncounterMethodApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}