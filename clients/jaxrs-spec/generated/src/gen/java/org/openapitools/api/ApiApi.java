package org.openapitools.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api/v2")
@Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-01-14T06:31:51.543681386Z[Etc/UTC]")
public class ApiApi {

    @GET
    @Path("/ability/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "ability" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response abilityList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/ability/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "ability" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response abilityRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry-firmness/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-firmness" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryFirmnessList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry-firmness/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-firmness" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryFirmnessRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry-flavor/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-flavor" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryFlavorList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry-flavor/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-flavor" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryFlavorRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "berry" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/berry/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "berry" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/characteristic/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "characteristic" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response characteristicList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/characteristic/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "characteristic" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response characteristicRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/contest-effect/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-effect" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response contestEffectList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/contest-effect/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-effect" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response contestEffectRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/contest-type/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response contestTypeList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/contest-type/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response contestTypeRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/egg-group/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "egg-group" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response eggGroupList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/egg-group/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "egg-group" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response eggGroupRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-condition/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterConditionList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-condition/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterConditionRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-condition-value/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition-value" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterConditionValueList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-condition-value/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition-value" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterConditionValueRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-method/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-method" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterMethodList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/encounter-method/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-method" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterMethodRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/evolution-chain/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-chain" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response evolutionChainList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/evolution-chain/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-chain" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response evolutionChainRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/evolution-trigger/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-trigger" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response evolutionTriggerList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/evolution-trigger/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-trigger" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response evolutionTriggerRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/gender/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "gender" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response genderList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/gender/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "gender" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response genderRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/generation/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "generation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response generationList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/generation/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "generation" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response generationRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/growth-rate/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "growth-rate" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response growthRateList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/growth-rate/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "growth-rate" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response growthRateRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-attribute/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "item-attribute" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemAttributeList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-attribute/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "item-attribute" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemAttributeRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-category/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "item-category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemCategoryList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-category/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "item-category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemCategoryRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-fling-effect/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "item-fling-effect" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemFlingEffectList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-fling-effect/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "item-fling-effect" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemFlingEffectRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "item" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-pocket/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "item-pocket" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemPocketList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item-pocket/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "item-pocket" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemPocketRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/item/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "item" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/language/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "language" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response languageList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/language/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "language" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response languageRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/location-area/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "location-area" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response locationAreaList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/location-area/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "location-area" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response locationAreaRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/location/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response locationList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/location/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "location" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response locationRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/machine/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "machine" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response machineList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/machine/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "machine" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response machineRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-ailment/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-ailment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveAilmentList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-ailment/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-ailment" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveAilmentRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-battle-style/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-battle-style" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveBattleStyleList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-battle-style/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-battle-style" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveBattleStyleRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-category/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveCategoryList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-category/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-category" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveCategoryRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-damage-class/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-damage-class" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveDamageClassList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-damage-class/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-damage-class" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveDamageClassRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-learn-method/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-learn-method" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveLearnMethodList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-learn-method/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-learn-method" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveLearnMethodRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-target/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-target" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveTargetList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/move-target/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "move-target" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveTargetRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/nature/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "nature" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response natureList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/nature/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "nature" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response natureRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pal-park-area/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pal-park-area" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response palParkAreaList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pal-park-area/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pal-park-area" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response palParkAreaRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokeathlon-stat/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokeathlon-stat" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokeathlonStatList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokeathlon-stat/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokeathlon-stat" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokeathlonStatRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokedex/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokedex" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokedexList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokedex/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokedex" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokedexRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-color/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-color" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonColorList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-color/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-color" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonColorRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-form/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-form" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonFormList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-form/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-form" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonFormRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-habitat/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-habitat" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonHabitatList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-habitat/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-habitat" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonHabitatRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-shape/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-shape" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonShapeList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-shape/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-shape" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonShapeRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-species/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-species" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonSpeciesList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/pokemon-species/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-species" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonSpeciesRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/region/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "region" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response regionList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/region/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "region" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response regionRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/stat/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "stat" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response statList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/stat/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "stat" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response statRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/super-contest-effect/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "super-contest-effect" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response superContestEffectList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/super-contest-effect/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "super-contest-effect" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response superContestEffectRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/type/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response typeList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/type/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "type" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response typeRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/version-group/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "version-group" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response versionGroupList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/version-group/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "version-group" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response versionGroupRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/version/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "version" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response versionList(@QueryParam("limit")   Integer limit,@QueryParam("offset")   Integer offset) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/version/{id}/")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "version" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response versionRead(@PathParam("id") Integer id) {
        return Response.ok().entity("magic!").build();
    }
}
