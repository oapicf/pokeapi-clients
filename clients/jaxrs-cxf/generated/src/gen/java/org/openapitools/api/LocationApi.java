package org.openapitools.api;

import org.openapitools.model.LocationAreaDetail;
import org.openapitools.model.LocationDetail;
import org.openapitools.model.PaginatedLocationAreaSummaryList;
import org.openapitools.model.PaginatedLocationSummaryList;
import org.openapitools.model.PaginatedPalParkAreaSummaryList;
import org.openapitools.model.PaginatedRegionSummaryList;
import org.openapitools.model.PalParkAreaDetail;
import org.openapitools.model.RegionDetail;

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
public interface LocationApi  {

    /**
     * List location areas
     *
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     *
     */
    @GET
    @Path("/location-area/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List location areas", tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedLocationAreaSummaryList.class) })
    public PaginatedLocationAreaSummaryList locationAreaList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset);

    /**
     * Get location area
     *
     * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
     *
     */
    @GET
    @Path("/location-area/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get location area", tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = LocationAreaDetail.class) })
    public LocationAreaDetail locationAreaRetrieve(@PathParam("id") Integer id);

    /**
     * List locations
     *
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     *
     */
    @GET
    @Path("/location/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List locations", tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedLocationSummaryList.class) })
    public PaginatedLocationSummaryList locationList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get location
     *
     * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
     *
     */
    @GET
    @Path("/location/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get location", tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = LocationDetail.class) })
    public LocationDetail locationRetrieve(@PathParam("id") String id);

    /**
     * List pal park areas
     *
     * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
     *
     */
    @GET
    @Path("/pal-park-area/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pal park areas", tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPalParkAreaSummaryList.class) })
    public PaginatedPalParkAreaSummaryList palParkAreaList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get pal park area
     *
     * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
     *
     */
    @GET
    @Path("/pal-park-area/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pal park area", tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PalParkAreaDetail.class) })
    public PalParkAreaDetail palParkAreaRetrieve(@PathParam("id") String id);

    /**
     * List regions
     *
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     *
     */
    @GET
    @Path("/region/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List regions", tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedRegionSummaryList.class) })
    public PaginatedRegionSummaryList regionList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get region
     *
     * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
     *
     */
    @GET
    @Path("/region/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get region", tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = RegionDetail.class) })
    public RegionDetail regionRetrieve(@PathParam("id") String id);
}
