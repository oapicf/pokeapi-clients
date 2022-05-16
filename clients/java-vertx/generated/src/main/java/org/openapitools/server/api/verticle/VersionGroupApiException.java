package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class VersionGroupApiException extends MainApiException {
    public VersionGroupApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}