package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;

public final class RegionApiException extends MainApiException {
    public RegionApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    

}