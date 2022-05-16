package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class CharacteristicApiException extends MainApiException {
    public CharacteristicApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}