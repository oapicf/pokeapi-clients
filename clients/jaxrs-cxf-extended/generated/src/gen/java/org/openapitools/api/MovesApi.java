package org.openapitools.api;

import org.openapitools.model.MoveBattleStyleDetail;
import org.openapitools.model.MoveDetail;
import org.openapitools.model.MoveLearnMethodDetail;
import org.openapitools.model.MoveMetaAilmentDetail;
import org.openapitools.model.MoveMetaCategoryDetail;
import org.openapitools.model.MoveTargetDetail;
import org.openapitools.model.PaginatedMoveBattleStyleSummaryList;
import org.openapitools.model.PaginatedMoveLearnMethodSummaryList;
import org.openapitools.model.PaginatedMoveMetaAilmentSummaryList;
import org.openapitools.model.PaginatedMoveMetaCategorySummaryList;
import org.openapitools.model.PaginatedMoveSummaryList;
import org.openapitools.model.PaginatedMoveTargetSummaryList;

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
public interface MovesApi  {

    /**
     * List move meta ailments
     *
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     *
     */
    @GET
    @Path("/move-ailment/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move meta ailments", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveMetaAilmentSummaryList.class) })
    public PaginatedMoveMetaAilmentSummaryList moveAilmentList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get move meta ailment
     *
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     *
     */
    @GET
    @Path("/move-ailment/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move meta ailment", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveMetaAilmentDetail.class) })
    public MoveMetaAilmentDetail moveAilmentRetrieve(@PathParam("id") String id);

    /**
     * List move battle styles
     *
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     *
     */
    @GET
    @Path("/move-battle-style/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move battle styles", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveBattleStyleSummaryList.class) })
    public PaginatedMoveBattleStyleSummaryList moveBattleStyleList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get move battle style
     *
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     *
     */
    @GET
    @Path("/move-battle-style/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move battle style", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveBattleStyleDetail.class) })
    public MoveBattleStyleDetail moveBattleStyleRetrieve(@PathParam("id") String id);

    /**
     * List move meta categories
     *
     * Very general categories that loosely group move effects.
     *
     */
    @GET
    @Path("/move-category/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move meta categories", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveMetaCategorySummaryList.class) })
    public PaginatedMoveMetaCategorySummaryList moveCategoryList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get move meta category
     *
     * Very general categories that loosely group move effects.
     *
     */
    @GET
    @Path("/move-category/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move meta category", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveMetaCategoryDetail.class) })
    public MoveMetaCategoryDetail moveCategoryRetrieve(@PathParam("id") String id);

    /**
     * List move learn methods
     *
     * Methods by which Pokémon can learn moves.
     *
     */
    @GET
    @Path("/move-learn-method/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move learn methods", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveLearnMethodSummaryList.class) })
    public PaginatedMoveLearnMethodSummaryList moveLearnMethodList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get move learn method
     *
     * Methods by which Pokémon can learn moves.
     *
     */
    @GET
    @Path("/move-learn-method/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move learn method", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveLearnMethodDetail.class) })
    public MoveLearnMethodDetail moveLearnMethodRetrieve(@PathParam("id") String id);

    /**
     * List moves
     *
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     *
     */
    @GET
    @Path("/move/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List moves", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveSummaryList.class) })
    public PaginatedMoveSummaryList moveList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get move
     *
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     *
     */
    @GET
    @Path("/move/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveDetail.class) })
    public MoveDetail moveRetrieve(@PathParam("id") String id);

    /**
     * List move targets
     *
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     *
     */
    @GET
    @Path("/move-target/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List move targets", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedMoveTargetSummaryList.class) })
    public PaginatedMoveTargetSummaryList moveTargetList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get move target
     *
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     *
     */
    @GET
    @Path("/move-target/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get move target", tags={ "moves" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = MoveTargetDetail.class) })
    public MoveTargetDetail moveTargetRetrieve(@PathParam("id") String id);
}
