/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;


import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-11-19T09:47:23.420529Z[Etc/UTC]")
@Api(value = "MoveTarget", description = "the MoveTarget API")
public interface MoveTargetApi {

    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-target", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v2/move-target/",
        produces = { "text/plain" }
    )
    ResponseEntity<String> moveTargetList(@ApiParam(value = "")  @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "")  @RequestParam(value = "offset", required = false) Integer offset, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-target", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v2/move-target/{id}/",
        produces = { "text/plain" }
    )
    ResponseEntity<String> moveTargetRead(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
