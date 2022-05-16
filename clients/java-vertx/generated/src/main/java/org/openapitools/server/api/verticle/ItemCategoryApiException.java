package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class ItemCategoryApiException extends MainApiException {
    public ItemCategoryApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}