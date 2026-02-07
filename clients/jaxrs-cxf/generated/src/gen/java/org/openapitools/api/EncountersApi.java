package org.openapitools.api;

import org.openapitools.model.EncounterConditionDetail;
import org.openapitools.model.EncounterConditionValueDetail;
import org.openapitools.model.EncounterMethodDetail;
import org.openapitools.model.PaginatedEncounterConditionSummaryList;
import org.openapitools.model.PaginatedEncounterConditionValueSummaryList;
import org.openapitools.model.PaginatedEncounterMethodSummaryList;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInner;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * PokéAPI
 *
 * <p>All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 */
@Path("/api/v2")
@Api(value = "/", description = "")
public interface EncountersApi  {

    /**
     * List encounter conditions
     *
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     *
     */
    @GET
    @Path("/encounter-condition/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List encounter conditions", tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEncounterConditionSummaryList.class) })
    public PaginatedEncounterConditionSummaryList encounterConditionList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get encounter condition
     *
     * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
     *
     */
    @GET
    @Path("/encounter-condition/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get encounter condition", tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EncounterConditionDetail.class) })
    public EncounterConditionDetail encounterConditionRetrieve(@PathParam("id") String id);

    /**
     * List encounter condition values
     *
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     *
     */
    @GET
    @Path("/encounter-condition-value/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List encounter condition values", tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEncounterConditionValueSummaryList.class) })
    public PaginatedEncounterConditionValueSummaryList encounterConditionValueList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get encounter condition value
     *
     * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
     *
     */
    @GET
    @Path("/encounter-condition-value/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get encounter condition value", tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EncounterConditionValueDetail.class) })
    public EncounterConditionValueDetail encounterConditionValueRetrieve(@PathParam("id") String id);

    /**
     * List encounter methods
     *
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     *
     */
    @GET
    @Path("/encounter-method/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List encounter methods", tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEncounterMethodSummaryList.class) })
    public PaginatedEncounterMethodSummaryList encounterMethodList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get encounter method
     *
     * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
     *
     */
    @GET
    @Path("/encounter-method/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get encounter method", tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EncounterMethodDetail.class) })
    public EncounterMethodDetail encounterMethodRetrieve(@PathParam("id") String id);

    /**
     * Get pokemon encounter
     *
     * Handles Pokemon Encounters as a sub-resource.
     *
     */
    @GET
    @Path("/pokemon/{pokemon_id}/encounters")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokemon encounter", tags={ "encounters" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokemonEncountersRetrieve200ResponseInner.class, responseContainer = "List") })
    public List<PokemonEncountersRetrieve200ResponseInner> pokemonEncountersRetrieve(@PathParam("pokemon_id") @Pattern(regexp="^\\d+$") String pokemonId);
}
