/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-05-16T10:28:03.183322Z[Etc/UTC]")
@Client("${base-path}")
public interface MoveTargetApi {
    /**
     * moveTargetList
     *
     * @param limit  (optional)
     * @param offset  (optional)
     * @return String
     */
    @Get(uri="/api/v2/move-target/")
    @Consumes(value={"text/plain"})
    Mono<String> moveTargetList(
        @QueryValue(value="limit") @Nullable Integer limit, 
        @QueryValue(value="offset") @Nullable Integer offset
  );
    /**
     * moveTargetRead
     *
     * @param id  (required)
     * @return String
     */
    @Get(uri="/api/v2/move-target/{id}/")
    @Consumes(value={"text/plain"})
    Mono<String> moveTargetRead(
        @PathVariable(name="id") @NotNull Integer id
  );
}
