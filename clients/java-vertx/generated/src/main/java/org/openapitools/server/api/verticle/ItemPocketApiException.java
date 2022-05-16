package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class ItemPocketApiException extends MainApiException {
    public ItemPocketApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}