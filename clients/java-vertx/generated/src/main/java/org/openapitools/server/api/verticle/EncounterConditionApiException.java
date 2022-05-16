package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class EncounterConditionApiException extends MainApiException {
    public EncounterConditionApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}