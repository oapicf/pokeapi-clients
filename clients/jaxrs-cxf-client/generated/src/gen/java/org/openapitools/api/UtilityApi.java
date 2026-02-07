package org.openapitools.api;

import org.openapitools.model.LanguageDetail;
import org.openapitools.model.PaginatedLanguageSummaryList;

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
@Path("/api/v2/language")
@Api(value = "/", description = "")
public interface UtilityApi  {

    /**
     * List languages
     *
     * Languages for translations of API resource information.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List languages", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedLanguageSummaryList.class) })
    public PaginatedLanguageSummaryList languageList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get language
     *
     * Languages for translations of API resource information.
     *
     */
    @GET
    @Path("/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get language", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = LanguageDetail.class) })
    public LanguageDetail languageRetrieve(@PathParam("id") String id);
}
