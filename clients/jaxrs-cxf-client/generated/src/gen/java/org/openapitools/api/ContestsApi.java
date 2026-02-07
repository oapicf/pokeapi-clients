package org.openapitools.api;

import org.openapitools.model.ContestEffectDetail;
import org.openapitools.model.ContestTypeDetail;
import org.openapitools.model.PaginatedContestEffectSummaryList;
import org.openapitools.model.PaginatedContestTypeSummaryList;
import org.openapitools.model.PaginatedSuperContestEffectSummaryList;
import org.openapitools.model.SuperContestEffectDetail;

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
public interface ContestsApi  {

    /**
     * List contest effects
     *
     * Contest effects refer to the effects of moves when used in contests.
     *
     */
    @GET
    @Path("/contest-effect/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List contest effects", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedContestEffectSummaryList.class) })
    public PaginatedContestEffectSummaryList contestEffectList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get contest effect
     *
     * Contest effects refer to the effects of moves when used in contests.
     *
     */
    @GET
    @Path("/contest-effect/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get contest effect", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ContestEffectDetail.class) })
    public ContestEffectDetail contestEffectRetrieve(@PathParam("id") String id);

    /**
     * List contest types
     *
     * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     *
     */
    @GET
    @Path("/contest-type/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List contest types", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedContestTypeSummaryList.class) })
    public PaginatedContestTypeSummaryList contestTypeList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get contest type
     *
     * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
     *
     */
    @GET
    @Path("/contest-type/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get contest type", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ContestTypeDetail.class) })
    public ContestTypeDetail contestTypeRetrieve(@PathParam("id") String id);

    /**
     * List super contest effects
     *
     * Super contest effects refer to the effects of moves when used in super contests.
     *
     */
    @GET
    @Path("/super-contest-effect/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List super contest effects", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedSuperContestEffectSummaryList.class) })
    public PaginatedSuperContestEffectSummaryList superContestEffectList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get super contest effect
     *
     * Super contest effects refer to the effects of moves when used in super contests.
     *
     */
    @GET
    @Path("/super-contest-effect/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get super contest effect", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = SuperContestEffectDetail.class) })
    public SuperContestEffectDetail superContestEffectRetrieve(@PathParam("id") String id);
}
