package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class VersionApiException extends MainApiException {
    public VersionApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}