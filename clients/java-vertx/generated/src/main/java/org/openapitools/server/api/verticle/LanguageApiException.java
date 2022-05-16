package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class LanguageApiException extends MainApiException {
    public LanguageApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}