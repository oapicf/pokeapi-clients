package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class BerryFlavorApiException extends MainApiException {
    public BerryFlavorApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}