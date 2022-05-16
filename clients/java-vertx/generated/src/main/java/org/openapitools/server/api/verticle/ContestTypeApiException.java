package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class ContestTypeApiException extends MainApiException {
    public ContestTypeApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}