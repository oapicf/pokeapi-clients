package org.openapitools.api;

import org.openapitools.model.EvolutionChainDetail;
import org.openapitools.model.EvolutionTriggerDetail;
import org.openapitools.model.PaginatedEvolutionChainSummaryList;
import org.openapitools.model.PaginatedEvolutionTriggerSummaryList;

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
public interface EvolutionApi  {

    /**
     * List evolution chains
     *
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     *
     */
    @GET
    @Path("/evolution-chain/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List evolution chains", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEvolutionChainSummaryList.class) })
    public PaginatedEvolutionChainSummaryList evolutionChainList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get evolution chain
     *
     * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
     *
     */
    @GET
    @Path("/evolution-chain/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get evolution chain", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EvolutionChainDetail.class) })
    public EvolutionChainDetail evolutionChainRetrieve(@PathParam("id") String id);

    /**
     * List evolution triggers
     *
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     *
     */
    @GET
    @Path("/evolution-trigger/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List evolution triggers", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedEvolutionTriggerSummaryList.class) })
    public PaginatedEvolutionTriggerSummaryList evolutionTriggerList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get evolution trigger
     *
     * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
     *
     */
    @GET
    @Path("/evolution-trigger/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get evolution trigger", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = EvolutionTriggerDetail.class) })
    public EvolutionTriggerDetail evolutionTriggerRetrieve(@PathParam("id") String id);
}
