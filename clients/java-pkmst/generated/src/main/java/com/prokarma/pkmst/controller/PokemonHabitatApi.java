/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-23T13:56:50.702287Z[Etc/UTC]")
@Api(value = "PokemonHabitat", description = "the PokemonHabitat API")
public interface PokemonHabitatApi {

    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-habitat", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v2/pokemon-habitat/",
        produces = { "text/plain" }
    )
    ResponseEntity<String> pokemonHabitatList(@ApiParam(value = "")  @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "")  @RequestParam(value = "offset", required = false) Integer offset, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-habitat", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v2/pokemon-habitat/{id}/",
        produces = { "text/plain" }
    )
    ResponseEntity<String> pokemonHabitatRead(@ApiParam(value = "",required=true ) @PathVariable("id") Integer id, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
