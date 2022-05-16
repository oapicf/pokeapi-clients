package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class AbilityApiException extends MainApiException {
    public AbilityApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}