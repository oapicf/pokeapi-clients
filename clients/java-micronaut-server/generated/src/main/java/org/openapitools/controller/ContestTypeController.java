/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import reactor.core.publisher.Mono;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-05-23T13:56:38.071794Z[Etc/UTC]")
@Controller("${context-path}")
public class ContestTypeController {
    /**
     * contestTypeList
     *
     * @param limit  (optional)
     * @param offset  (optional)
     * @return String
     */
    @ApiOperation(
        value = "",
        nickname = "contestTypeList",
        response = String.class,
        authorizations = {},
        tags={})
    @ApiResponses(value = {
        @ApiResponse(code = 0, message = "Default response", response = String.class)})
    @Get(uri="/api/v2/contest-type/")
    @Produces(value = {"text/plain"})
    @Secured(SecurityRule.IS_ANONYMOUS)
    public Mono<String> contestTypeList(
        @QueryValue(value="limit") @Nullable Integer limit, 
        @QueryValue(value="offset") @Nullable Integer offset
    ) {
        // TODO implement contestTypeList() body;
        Mono<String> result = Mono.empty();
        return result;
    }

    /**
     * contestTypeRead
     *
     * @param id  (required)
     * @return String
     */
    @ApiOperation(
        value = "",
        nickname = "contestTypeRead",
        response = String.class,
        authorizations = {},
        tags={})
    @ApiResponses(value = {
        @ApiResponse(code = 0, message = "Default response", response = String.class)})
    @Get(uri="/api/v2/contest-type/{id}/")
    @Produces(value = {"text/plain"})
    @Secured(SecurityRule.IS_ANONYMOUS)
    public Mono<String> contestTypeRead(
        @PathVariable(value="id") @NotNull Integer id
    ) {
        // TODO implement contestTypeRead() body;
        Mono<String> result = Mono.empty();
        return result;
    }
}
