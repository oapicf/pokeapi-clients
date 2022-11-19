package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ApiApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api/v2")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-11-19T09:48:24.912647Z[Etc/UTC]")
public class ApiApi  {

    @Inject ApiApiService service;

    @GET
    @Path("/ability/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "ability", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response abilityList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.abilityList(limit,offset,securityContext);
    }
    @GET
    @Path("/ability/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "ability", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response abilityRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.abilityRead(id,securityContext);
    }
    @GET
    @Path("/berry-firmness/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-firmness", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response berryFirmnessList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.berryFirmnessList(limit,offset,securityContext);
    }
    @GET
    @Path("/berry-firmness/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-firmness", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response berryFirmnessRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.berryFirmnessRead(id,securityContext);
    }
    @GET
    @Path("/berry-flavor/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-flavor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response berryFlavorList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.berryFlavorList(limit,offset,securityContext);
    }
    @GET
    @Path("/berry-flavor/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-flavor", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response berryFlavorRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.berryFlavorRead(id,securityContext);
    }
    @GET
    @Path("/berry/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response berryList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.berryList(limit,offset,securityContext);
    }
    @GET
    @Path("/berry/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response berryRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.berryRead(id,securityContext);
    }
    @GET
    @Path("/characteristic/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "characteristic", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response characteristicList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.characteristicList(limit,offset,securityContext);
    }
    @GET
    @Path("/characteristic/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "characteristic", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response characteristicRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.characteristicRead(id,securityContext);
    }
    @GET
    @Path("/contest-effect/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-effect", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response contestEffectList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contestEffectList(limit,offset,securityContext);
    }
    @GET
    @Path("/contest-effect/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-effect", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response contestEffectRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contestEffectRead(id,securityContext);
    }
    @GET
    @Path("/contest-type/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response contestTypeList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contestTypeList(limit,offset,securityContext);
    }
    @GET
    @Path("/contest-type/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response contestTypeRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.contestTypeRead(id,securityContext);
    }
    @GET
    @Path("/egg-group/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "egg-group", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response eggGroupList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.eggGroupList(limit,offset,securityContext);
    }
    @GET
    @Path("/egg-group/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "egg-group", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response eggGroupRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.eggGroupRead(id,securityContext);
    }
    @GET
    @Path("/encounter-condition/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response encounterConditionList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.encounterConditionList(limit,offset,securityContext);
    }
    @GET
    @Path("/encounter-condition/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response encounterConditionRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.encounterConditionRead(id,securityContext);
    }
    @GET
    @Path("/encounter-condition-value/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition-value", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response encounterConditionValueList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.encounterConditionValueList(limit,offset,securityContext);
    }
    @GET
    @Path("/encounter-condition-value/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition-value", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response encounterConditionValueRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.encounterConditionValueRead(id,securityContext);
    }
    @GET
    @Path("/encounter-method/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-method", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response encounterMethodList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.encounterMethodList(limit,offset,securityContext);
    }
    @GET
    @Path("/encounter-method/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-method", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response encounterMethodRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.encounterMethodRead(id,securityContext);
    }
    @GET
    @Path("/evolution-chain/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-chain", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response evolutionChainList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.evolutionChainList(limit,offset,securityContext);
    }
    @GET
    @Path("/evolution-chain/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-chain", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response evolutionChainRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.evolutionChainRead(id,securityContext);
    }
    @GET
    @Path("/evolution-trigger/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response evolutionTriggerList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.evolutionTriggerList(limit,offset,securityContext);
    }
    @GET
    @Path("/evolution-trigger/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-trigger", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response evolutionTriggerRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.evolutionTriggerRead(id,securityContext);
    }
    @GET
    @Path("/gender/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "gender", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response genderList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.genderList(limit,offset,securityContext);
    }
    @GET
    @Path("/gender/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "gender", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response genderRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.genderRead(id,securityContext);
    }
    @GET
    @Path("/generation/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "generation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response generationList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generationList(limit,offset,securityContext);
    }
    @GET
    @Path("/generation/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "generation", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response generationRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generationRead(id,securityContext);
    }
    @GET
    @Path("/growth-rate/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "growth-rate", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response growthRateList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.growthRateList(limit,offset,securityContext);
    }
    @GET
    @Path("/growth-rate/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "growth-rate", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response growthRateRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.growthRateRead(id,securityContext);
    }
    @GET
    @Path("/item-attribute/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-attribute", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response itemAttributeList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.itemAttributeList(limit,offset,securityContext);
    }
    @GET
    @Path("/item-attribute/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-attribute", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response itemAttributeRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.itemAttributeRead(id,securityContext);
    }
    @GET
    @Path("/item-category/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response itemCategoryList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.itemCategoryList(limit,offset,securityContext);
    }
    @GET
    @Path("/item-category/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response itemCategoryRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.itemCategoryRead(id,securityContext);
    }
    @GET
    @Path("/item-fling-effect/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-fling-effect", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response itemFlingEffectList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.itemFlingEffectList(limit,offset,securityContext);
    }
    @GET
    @Path("/item-fling-effect/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-fling-effect", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response itemFlingEffectRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.itemFlingEffectRead(id,securityContext);
    }
    @GET
    @Path("/item/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response itemList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.itemList(limit,offset,securityContext);
    }
    @GET
    @Path("/item-pocket/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-pocket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response itemPocketList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.itemPocketList(limit,offset,securityContext);
    }
    @GET
    @Path("/item-pocket/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-pocket", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response itemPocketRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.itemPocketRead(id,securityContext);
    }
    @GET
    @Path("/item/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response itemRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.itemRead(id,securityContext);
    }
    @GET
    @Path("/language/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "language", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response languageList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.languageList(limit,offset,securityContext);
    }
    @GET
    @Path("/language/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "language", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response languageRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.languageRead(id,securityContext);
    }
    @GET
    @Path("/location-area/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "location-area", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response locationAreaList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.locationAreaList(limit,offset,securityContext);
    }
    @GET
    @Path("/location-area/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "location-area", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response locationAreaRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.locationAreaRead(id,securityContext);
    }
    @GET
    @Path("/location/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response locationList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.locationList(limit,offset,securityContext);
    }
    @GET
    @Path("/location/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "location", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response locationRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.locationRead(id,securityContext);
    }
    @GET
    @Path("/machine/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "machine", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response machineList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.machineList(limit,offset,securityContext);
    }
    @GET
    @Path("/machine/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "machine", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response machineRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.machineRead(id,securityContext);
    }
    @GET
    @Path("/move-ailment/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-ailment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveAilmentList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveAilmentList(limit,offset,securityContext);
    }
    @GET
    @Path("/move-ailment/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-ailment", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveAilmentRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveAilmentRead(id,securityContext);
    }
    @GET
    @Path("/move-battle-style/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-battle-style", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveBattleStyleList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveBattleStyleList(limit,offset,securityContext);
    }
    @GET
    @Path("/move-battle-style/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-battle-style", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveBattleStyleRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveBattleStyleRead(id,securityContext);
    }
    @GET
    @Path("/move-category/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveCategoryList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveCategoryList(limit,offset,securityContext);
    }
    @GET
    @Path("/move-category/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-category", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveCategoryRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveCategoryRead(id,securityContext);
    }
    @GET
    @Path("/move-damage-class/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-damage-class", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveDamageClassList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveDamageClassList(limit,offset,securityContext);
    }
    @GET
    @Path("/move-damage-class/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-damage-class", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveDamageClassRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveDamageClassRead(id,securityContext);
    }
    @GET
    @Path("/move-learn-method/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-learn-method", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveLearnMethodList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveLearnMethodList(limit,offset,securityContext);
    }
    @GET
    @Path("/move-learn-method/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-learn-method", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveLearnMethodRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveLearnMethodRead(id,securityContext);
    }
    @GET
    @Path("/move/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveList(limit,offset,securityContext);
    }
    @GET
    @Path("/move/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveRead(id,securityContext);
    }
    @GET
    @Path("/move-target/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-target", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveTargetList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveTargetList(limit,offset,securityContext);
    }
    @GET
    @Path("/move-target/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-target", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response moveTargetRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.moveTargetRead(id,securityContext);
    }
    @GET
    @Path("/nature/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "nature", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response natureList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.natureList(limit,offset,securityContext);
    }
    @GET
    @Path("/nature/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "nature", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response natureRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.natureRead(id,securityContext);
    }
    @GET
    @Path("/pal-park-area/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pal-park-area", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response palParkAreaList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.palParkAreaList(limit,offset,securityContext);
    }
    @GET
    @Path("/pal-park-area/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pal-park-area", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response palParkAreaRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.palParkAreaRead(id,securityContext);
    }
    @GET
    @Path("/pokeathlon-stat/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokeathlon-stat", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokeathlonStatList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokeathlonStatList(limit,offset,securityContext);
    }
    @GET
    @Path("/pokeathlon-stat/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokeathlon-stat", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokeathlonStatRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokeathlonStatRead(id,securityContext);
    }
    @GET
    @Path("/pokedex/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokedex", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokedexList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokedexList(limit,offset,securityContext);
    }
    @GET
    @Path("/pokedex/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokedex", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokedexRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokedexRead(id,securityContext);
    }
    @GET
    @Path("/pokemon-color/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-color", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonColorList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonColorList(limit,offset,securityContext);
    }
    @GET
    @Path("/pokemon-color/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-color", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonColorRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonColorRead(id,securityContext);
    }
    @GET
    @Path("/pokemon-form/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-form", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonFormList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonFormList(limit,offset,securityContext);
    }
    @GET
    @Path("/pokemon-form/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-form", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonFormRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonFormRead(id,securityContext);
    }
    @GET
    @Path("/pokemon-habitat/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-habitat", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonHabitatList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonHabitatList(limit,offset,securityContext);
    }
    @GET
    @Path("/pokemon-habitat/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-habitat", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonHabitatRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonHabitatRead(id,securityContext);
    }
    @GET
    @Path("/pokemon/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonList(limit,offset,securityContext);
    }
    @GET
    @Path("/pokemon/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonRead(id,securityContext);
    }
    @GET
    @Path("/pokemon-shape/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-shape", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonShapeList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonShapeList(limit,offset,securityContext);
    }
    @GET
    @Path("/pokemon-shape/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-shape", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonShapeRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonShapeRead(id,securityContext);
    }
    @GET
    @Path("/pokemon-species/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-species", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonSpeciesList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonSpeciesList(limit,offset,securityContext);
    }
    @GET
    @Path("/pokemon-species/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-species", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response pokemonSpeciesRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pokemonSpeciesRead(id,securityContext);
    }
    @GET
    @Path("/region/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response regionList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.regionList(limit,offset,securityContext);
    }
    @GET
    @Path("/region/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "region", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response regionRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.regionRead(id,securityContext);
    }
    @GET
    @Path("/stat/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "stat", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response statList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.statList(limit,offset,securityContext);
    }
    @GET
    @Path("/stat/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "stat", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response statRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.statRead(id,securityContext);
    }
    @GET
    @Path("/super-contest-effect/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "super-contest-effect", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response superContestEffectList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.superContestEffectList(limit,offset,securityContext);
    }
    @GET
    @Path("/super-contest-effect/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "super-contest-effect", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response superContestEffectRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.superContestEffectRead(id,securityContext);
    }
    @GET
    @Path("/type/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response typeList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.typeList(limit,offset,securityContext);
    }
    @GET
    @Path("/type/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "type", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response typeRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.typeRead(id,securityContext);
    }
    @GET
    @Path("/version-group/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "version-group", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response versionGroupList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.versionGroupList(limit,offset,securityContext);
    }
    @GET
    @Path("/version-group/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "version-group", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response versionGroupRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.versionGroupRead(id,securityContext);
    }
    @GET
    @Path("/version/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "version", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response versionList( @QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.versionList(limit,offset,securityContext);
    }
    @GET
    @Path("/version/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "version", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response versionRead( @PathParam("id") Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.versionRead(id,securityContext);
    }
}
