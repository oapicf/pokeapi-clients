package org.openapitools.api;

import org.openapitools.model.MachineDetail;
import org.openapitools.model.PaginatedMachineSummaryList;

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
@Path("/api/v2/machine")
@Api(value = "/", description = "")
public interface MachinesApi  {

    /**
     * List machines
     *
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List machines", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMachineSummaryList.class) })
    public PaginatedMachineSummaryList machineList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get machine
     *
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     *
     */
    @GET
    @Path("/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get machine", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MachineDetail.class) })
    public MachineDetail machineRetrieve(@PathParam("id") String id);
}
