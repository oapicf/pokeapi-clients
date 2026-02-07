package org.openapitools.api;

import org.openapitools.model.BerryDetail;
import org.openapitools.model.BerryFirmnessDetail;
import org.openapitools.model.BerryFlavorDetail;
import org.openapitools.model.PaginatedBerryFirmnessSummaryList;
import org.openapitools.model.PaginatedBerryFlavorSummaryList;
import org.openapitools.model.PaginatedBerrySummaryList;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
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
public interface BerriesApi  {

    /**
     * List berry firmness
     *
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     *
     */
    @GET
    @Path("/berry-firmness/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List berry firmness", tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedBerryFirmnessSummaryList.class) })
    public PaginatedBerryFirmnessSummaryList berryFirmnessList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get berry by firmness
     *
     * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
     *
     */
    @GET
    @Path("/berry-firmness/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get berry by firmness", tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = BerryFirmnessDetail.class) })
    public BerryFirmnessDetail berryFirmnessRetrieve(@PathParam("id") String id);

    /**
     * List berry flavors
     *
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     *
     */
    @GET
    @Path("/berry-flavor/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List berry flavors", tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedBerryFlavorSummaryList.class) })
    public PaginatedBerryFlavorSummaryList berryFlavorList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get berries by flavor
     *
     * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
     *
     */
    @GET
    @Path("/berry-flavor/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get berries by flavor", tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = BerryFlavorDetail.class) })
    public BerryFlavorDetail berryFlavorRetrieve(@PathParam("id") String id);

    /**
     * List berries
     *
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     *
     */
    @GET
    @Path("/berry/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List berries", tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedBerrySummaryList.class) })
    public PaginatedBerrySummaryList berryList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get a berry
     *
     * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
     *
     */
    @GET
    @Path("/berry/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get a berry", tags={ "berries" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = BerryDetail.class) })
    public BerryDetail berryRetrieve(@PathParam("id") String id);
}
