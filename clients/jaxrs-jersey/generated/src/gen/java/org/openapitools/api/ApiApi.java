package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ApiApiService;
import org.openapitools.api.factories.ApiApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api/v2")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-23T21:53:24.369756Z[Etc/UTC]")
public class ApiApi  {
   private final ApiApiService delegate;

   public ApiApi(@Context ServletConfig servletContext) {
      ApiApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ApiApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ApiApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ApiApiServiceFactory.getApiApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/ability/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "ability", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response abilityList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.abilityList(limit, offset, securityContext);
    }
    @GET
    @Path("/ability/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "ability", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response abilityRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.abilityRead(id, securityContext);
    }
    @GET
    @Path("/berry-firmness/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-firmness", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryFirmnessList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.berryFirmnessList(limit, offset, securityContext);
    }
    @GET
    @Path("/berry-firmness/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-firmness", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryFirmnessRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.berryFirmnessRead(id, securityContext);
    }
    @GET
    @Path("/berry-flavor/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-flavor", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryFlavorList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.berryFlavorList(limit, offset, securityContext);
    }
    @GET
    @Path("/berry-flavor/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry-flavor", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryFlavorRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.berryFlavorRead(id, securityContext);
    }
    @GET
    @Path("/berry/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.berryList(limit, offset, securityContext);
    }
    @GET
    @Path("/berry/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "berry", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response berryRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.berryRead(id, securityContext);
    }
    @GET
    @Path("/characteristic/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "characteristic", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response characteristicList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.characteristicList(limit, offset, securityContext);
    }
    @GET
    @Path("/characteristic/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "characteristic", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response characteristicRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.characteristicRead(id, securityContext);
    }
    @GET
    @Path("/contest-effect/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-effect", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response contestEffectList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contestEffectList(limit, offset, securityContext);
    }
    @GET
    @Path("/contest-effect/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-effect", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response contestEffectRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contestEffectRead(id, securityContext);
    }
    @GET
    @Path("/contest-type/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response contestTypeList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contestTypeList(limit, offset, securityContext);
    }
    @GET
    @Path("/contest-type/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "contest-type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response contestTypeRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.contestTypeRead(id, securityContext);
    }
    @GET
    @Path("/egg-group/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "egg-group", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response eggGroupList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.eggGroupList(limit, offset, securityContext);
    }
    @GET
    @Path("/egg-group/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "egg-group", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response eggGroupRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.eggGroupRead(id, securityContext);
    }
    @GET
    @Path("/encounter-condition/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterConditionList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.encounterConditionList(limit, offset, securityContext);
    }
    @GET
    @Path("/encounter-condition/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterConditionRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.encounterConditionRead(id, securityContext);
    }
    @GET
    @Path("/encounter-condition-value/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition-value", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterConditionValueList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.encounterConditionValueList(limit, offset, securityContext);
    }
    @GET
    @Path("/encounter-condition-value/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-condition-value", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterConditionValueRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.encounterConditionValueRead(id, securityContext);
    }
    @GET
    @Path("/encounter-method/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-method", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterMethodList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.encounterMethodList(limit, offset, securityContext);
    }
    @GET
    @Path("/encounter-method/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "encounter-method", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response encounterMethodRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.encounterMethodRead(id, securityContext);
    }
    @GET
    @Path("/evolution-chain/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-chain", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response evolutionChainList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.evolutionChainList(limit, offset, securityContext);
    }
    @GET
    @Path("/evolution-chain/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-chain", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response evolutionChainRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.evolutionChainRead(id, securityContext);
    }
    @GET
    @Path("/evolution-trigger/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-trigger", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response evolutionTriggerList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.evolutionTriggerList(limit, offset, securityContext);
    }
    @GET
    @Path("/evolution-trigger/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "evolution-trigger", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response evolutionTriggerRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.evolutionTriggerRead(id, securityContext);
    }
    @GET
    @Path("/gender/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "gender", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response genderList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.genderList(limit, offset, securityContext);
    }
    @GET
    @Path("/gender/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "gender", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response genderRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.genderRead(id, securityContext);
    }
    @GET
    @Path("/generation/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "generation", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response generationList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.generationList(limit, offset, securityContext);
    }
    @GET
    @Path("/generation/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "generation", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response generationRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.generationRead(id, securityContext);
    }
    @GET
    @Path("/growth-rate/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "growth-rate", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response growthRateList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.growthRateList(limit, offset, securityContext);
    }
    @GET
    @Path("/growth-rate/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "growth-rate", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response growthRateRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.growthRateRead(id, securityContext);
    }
    @GET
    @Path("/item-attribute/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-attribute", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemAttributeList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemAttributeList(limit, offset, securityContext);
    }
    @GET
    @Path("/item-attribute/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-attribute", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemAttributeRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemAttributeRead(id, securityContext);
    }
    @GET
    @Path("/item-category/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemCategoryList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemCategoryList(limit, offset, securityContext);
    }
    @GET
    @Path("/item-category/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemCategoryRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemCategoryRead(id, securityContext);
    }
    @GET
    @Path("/item-fling-effect/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-fling-effect", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemFlingEffectList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemFlingEffectList(limit, offset, securityContext);
    }
    @GET
    @Path("/item-fling-effect/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-fling-effect", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemFlingEffectRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemFlingEffectRead(id, securityContext);
    }
    @GET
    @Path("/item/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemList(limit, offset, securityContext);
    }
    @GET
    @Path("/item-pocket/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-pocket", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemPocketList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemPocketList(limit, offset, securityContext);
    }
    @GET
    @Path("/item-pocket/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item-pocket", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemPocketRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemPocketRead(id, securityContext);
    }
    @GET
    @Path("/item/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "item", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response itemRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemRead(id, securityContext);
    }
    @GET
    @Path("/language/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "language", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response languageList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.languageList(limit, offset, securityContext);
    }
    @GET
    @Path("/language/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "language", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response languageRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.languageRead(id, securityContext);
    }
    @GET
    @Path("/location-area/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "location-area", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response locationAreaList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.locationAreaList(limit, offset, securityContext);
    }
    @GET
    @Path("/location-area/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "location-area", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response locationAreaRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.locationAreaRead(id, securityContext);
    }
    @GET
    @Path("/location/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "location", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response locationList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.locationList(limit, offset, securityContext);
    }
    @GET
    @Path("/location/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "location", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response locationRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.locationRead(id, securityContext);
    }
    @GET
    @Path("/machine/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "machine", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response machineList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.machineList(limit, offset, securityContext);
    }
    @GET
    @Path("/machine/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "machine", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response machineRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.machineRead(id, securityContext);
    }
    @GET
    @Path("/move-ailment/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-ailment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveAilmentList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveAilmentList(limit, offset, securityContext);
    }
    @GET
    @Path("/move-ailment/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-ailment", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveAilmentRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveAilmentRead(id, securityContext);
    }
    @GET
    @Path("/move-battle-style/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-battle-style", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveBattleStyleList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveBattleStyleList(limit, offset, securityContext);
    }
    @GET
    @Path("/move-battle-style/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-battle-style", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveBattleStyleRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveBattleStyleRead(id, securityContext);
    }
    @GET
    @Path("/move-category/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveCategoryList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveCategoryList(limit, offset, securityContext);
    }
    @GET
    @Path("/move-category/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-category", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveCategoryRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveCategoryRead(id, securityContext);
    }
    @GET
    @Path("/move-damage-class/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-damage-class", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveDamageClassList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveDamageClassList(limit, offset, securityContext);
    }
    @GET
    @Path("/move-damage-class/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-damage-class", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveDamageClassRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveDamageClassRead(id, securityContext);
    }
    @GET
    @Path("/move-learn-method/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-learn-method", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveLearnMethodList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveLearnMethodList(limit, offset, securityContext);
    }
    @GET
    @Path("/move-learn-method/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-learn-method", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveLearnMethodRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveLearnMethodRead(id, securityContext);
    }
    @GET
    @Path("/move/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveList(limit, offset, securityContext);
    }
    @GET
    @Path("/move/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveRead(id, securityContext);
    }
    @GET
    @Path("/move-target/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-target", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveTargetList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveTargetList(limit, offset, securityContext);
    }
    @GET
    @Path("/move-target/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "move-target", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response moveTargetRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moveTargetRead(id, securityContext);
    }
    @GET
    @Path("/nature/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "nature", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response natureList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.natureList(limit, offset, securityContext);
    }
    @GET
    @Path("/nature/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "nature", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response natureRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.natureRead(id, securityContext);
    }
    @GET
    @Path("/pal-park-area/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pal-park-area", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response palParkAreaList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.palParkAreaList(limit, offset, securityContext);
    }
    @GET
    @Path("/pal-park-area/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pal-park-area", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response palParkAreaRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.palParkAreaRead(id, securityContext);
    }
    @GET
    @Path("/pokeathlon-stat/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokeathlon-stat", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokeathlonStatList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokeathlonStatList(limit, offset, securityContext);
    }
    @GET
    @Path("/pokeathlon-stat/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokeathlon-stat", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokeathlonStatRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokeathlonStatRead(id, securityContext);
    }
    @GET
    @Path("/pokedex/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokedex", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokedexList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokedexList(limit, offset, securityContext);
    }
    @GET
    @Path("/pokedex/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokedex", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokedexRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokedexRead(id, securityContext);
    }
    @GET
    @Path("/pokemon-color/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-color", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonColorList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonColorList(limit, offset, securityContext);
    }
    @GET
    @Path("/pokemon-color/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-color", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonColorRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonColorRead(id, securityContext);
    }
    @GET
    @Path("/pokemon-form/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-form", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonFormList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonFormList(limit, offset, securityContext);
    }
    @GET
    @Path("/pokemon-form/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-form", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonFormRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonFormRead(id, securityContext);
    }
    @GET
    @Path("/pokemon-habitat/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-habitat", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonHabitatList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonHabitatList(limit, offset, securityContext);
    }
    @GET
    @Path("/pokemon-habitat/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-habitat", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonHabitatRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonHabitatRead(id, securityContext);
    }
    @GET
    @Path("/pokemon/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonList(limit, offset, securityContext);
    }
    @GET
    @Path("/pokemon/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonRead(id, securityContext);
    }
    @GET
    @Path("/pokemon-shape/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-shape", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonShapeList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonShapeList(limit, offset, securityContext);
    }
    @GET
    @Path("/pokemon-shape/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-shape", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonShapeRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonShapeRead(id, securityContext);
    }
    @GET
    @Path("/pokemon-species/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-species", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonSpeciesList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonSpeciesList(limit, offset, securityContext);
    }
    @GET
    @Path("/pokemon-species/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "pokemon-species", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response pokemonSpeciesRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pokemonSpeciesRead(id, securityContext);
    }
    @GET
    @Path("/region/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "region", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response regionList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.regionList(limit, offset, securityContext);
    }
    @GET
    @Path("/region/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "region", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response regionRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.regionRead(id, securityContext);
    }
    @GET
    @Path("/stat/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "stat", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response statList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.statList(limit, offset, securityContext);
    }
    @GET
    @Path("/stat/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "stat", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response statRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.statRead(id, securityContext);
    }
    @GET
    @Path("/super-contest-effect/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "super-contest-effect", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response superContestEffectList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.superContestEffectList(limit, offset, securityContext);
    }
    @GET
    @Path("/super-contest-effect/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "super-contest-effect", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response superContestEffectRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.superContestEffectRead(id, securityContext);
    }
    @GET
    @Path("/type/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response typeList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.typeList(limit, offset, securityContext);
    }
    @GET
    @Path("/type/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "type", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response typeRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.typeRead(id, securityContext);
    }
    @GET
    @Path("/version-group/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "version-group", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response versionGroupList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.versionGroupList(limit, offset, securityContext);
    }
    @GET
    @Path("/version-group/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "version-group", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response versionGroupRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.versionGroupRead(id, securityContext);
    }
    @GET
    @Path("/version/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "version", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response versionList(@ApiParam(value = "") @QueryParam("limit")  Integer limit,@ApiParam(value = "") @QueryParam("offset")  Integer offset,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.versionList(limit, offset, securityContext);
    }
    @GET
    @Path("/version/{id}/")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "version", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response versionRead(@ApiParam(value = "", required = true) @PathParam("id") @NotNull  Integer id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.versionRead(id, securityContext);
    }
}
