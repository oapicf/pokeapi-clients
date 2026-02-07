package org.openapitools.api;

import org.openapitools.model.GenerationDetail;
import org.openapitools.model.PaginatedGenerationSummaryList;
import org.openapitools.model.PaginatedPokedexSummaryList;
import org.openapitools.model.PaginatedVersionGroupSummaryList;
import org.openapitools.model.PaginatedVersionSummaryList;
import org.openapitools.model.PokedexDetail;
import org.openapitools.model.VersionDetail;
import org.openapitools.model.VersionGroupDetail;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * PokéAPI
 *
 * <p>All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 */
@Path("/api/v2")
@Api(value = "/", description = "")
public interface GamesApi  {

    /**
     * List genrations
     *
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     *
     */
    @GET
    @Path("/generation/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List genrations", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedGenerationSummaryList.class) })
    public PaginatedGenerationSummaryList generationList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get genration
     *
     * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
     *
     */
    @GET
    @Path("/generation/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get genration", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = GenerationDetail.class) })
    public GenerationDetail generationRetrieve(@PathParam("id") String id);

    /**
     * List pokedex
     *
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     *
     */
    @GET
    @Path("/pokedex/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List pokedex", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedPokedexSummaryList.class) })
    public PaginatedPokedexSummaryList pokedexList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get pokedex
     *
     * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
     *
     */
    @GET
    @Path("/pokedex/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get pokedex", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PokedexDetail.class) })
    public PokedexDetail pokedexRetrieve(@PathParam("id") String id);

    /**
     * List version groups
     *
     * Version groups categorize highly similar versions of the games.
     *
     */
    @GET
    @Path("/version-group/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List version groups", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedVersionGroupSummaryList.class) })
    public PaginatedVersionGroupSummaryList versionGroupList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get version group
     *
     * Version groups categorize highly similar versions of the games.
     *
     */
    @GET
    @Path("/version-group/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get version group", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = VersionGroupDetail.class) })
    public VersionGroupDetail versionGroupRetrieve(@PathParam("id") String id);

    /**
     * List versions
     *
     * Versions of the games, e.g., Red, Blue or Yellow.
     *
     */
    @GET
    @Path("/version/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List versions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedVersionSummaryList.class) })
    public PaginatedVersionSummaryList versionList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get version
     *
     * Versions of the games, e.g., Red, Blue or Yellow.
     *
     */
    @GET
    @Path("/version/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get version", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = VersionDetail.class) })
    public VersionDetail versionRetrieve(@PathParam("id") String id);
}
