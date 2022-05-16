/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class BerryFirmnessApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        GET /api/v2/berry-firmness/
        **/
        rest()
            .get("/api/v2/berry-firmness/")
                .description("")
                .id("berryFirmnessListApi")
                .clientRequestValidation(false)
                .bindingMode(RestBindingMode.off)
                .produces("text/plain")
                .outType(String.class)
                .param()
                    .name("limit")
                    .type(RestParamType.query)
                    .required(false)
                .endParam()
                .param()
                    .name("offset")
                    .type(RestParamType.query)
                    .required(false)
                .endParam()
                .to("direct:berryFirmnessList");
        

        /**
        GET /api/v2/berry-firmness/{id}/
        **/
        rest()
            .get("/api/v2/berry-firmness/{id}/")
                .description("")
                .id("berryFirmnessReadApi")
                .clientRequestValidation(false)
                .bindingMode(RestBindingMode.off)
                .produces("text/plain")
                .outType(String.class)
                .param()
                    .name("id")
                    .type(RestParamType.path)
                    .required(true)
                .endParam()
                .to("direct:berryFirmnessRead");
        
    }
}
