package org.openapitools.api.factories;

import org.openapitools.api.ApiApiService;
import org.openapitools.api.impl.ApiApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-16T10:29:38.077204Z[Etc/UTC]")
public class ApiApiServiceFactory {
    private static final ApiApiService service = new ApiApiServiceImpl();

    public static ApiApiService getApiApi() {
        return service;
    }
}
