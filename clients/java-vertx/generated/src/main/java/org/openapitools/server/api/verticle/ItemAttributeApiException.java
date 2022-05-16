package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class ItemAttributeApiException extends MainApiException {
    public ItemAttributeApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}