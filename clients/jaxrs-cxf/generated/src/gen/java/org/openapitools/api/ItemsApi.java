package org.openapitools.api;

import org.openapitools.model.ItemAttributeDetail;
import org.openapitools.model.ItemCategoryDetail;
import org.openapitools.model.ItemDetail;
import org.openapitools.model.ItemFlingEffectDetail;
import org.openapitools.model.ItemPocketDetail;
import org.openapitools.model.PaginatedItemAttributeSummaryList;
import org.openapitools.model.PaginatedItemCategorySummaryList;
import org.openapitools.model.PaginatedItemFlingEffectSummaryList;
import org.openapitools.model.PaginatedItemPocketSummaryList;
import org.openapitools.model.PaginatedItemSummaryList;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
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
public interface ItemsApi  {

    /**
     * List item attributes
     *
     * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
     *
     */
    @GET
    @Path("/item-attribute/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List item attributes", tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedItemAttributeSummaryList.class) })
    public PaginatedItemAttributeSummaryList itemAttributeList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get item attribute
     *
     * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
     *
     */
    @GET
    @Path("/item-attribute/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item attribute", tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ItemAttributeDetail.class) })
    public ItemAttributeDetail itemAttributeRetrieve(@PathParam("id") String id);

    /**
     * List item categories
     *
     * Item categories determine where items will be placed in the players bag.
     *
     */
    @GET
    @Path("/item-category/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List item categories", tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedItemCategorySummaryList.class) })
    public PaginatedItemCategorySummaryList itemCategoryList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get item category
     *
     * Item categories determine where items will be placed in the players bag.
     *
     */
    @GET
    @Path("/item-category/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item category", tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ItemCategoryDetail.class) })
    public ItemCategoryDetail itemCategoryRetrieve(@PathParam("id") String id);

    /**
     * List item fling effects
     *
     * The various effects of the move\&quot;Fling\&quot; when used with different items.
     *
     */
    @GET
    @Path("/item-fling-effect/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List item fling effects", tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedItemFlingEffectSummaryList.class) })
    public PaginatedItemFlingEffectSummaryList itemFlingEffectList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get item fling effect
     *
     * The various effects of the move\&quot;Fling\&quot; when used with different items.
     *
     */
    @GET
    @Path("/item-fling-effect/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item fling effect", tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ItemFlingEffectDetail.class) })
    public ItemFlingEffectDetail itemFlingEffectRetrieve(@PathParam("id") String id);

    /**
     * List items
     *
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     *
     */
    @GET
    @Path("/item/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List items", tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedItemSummaryList.class) })
    public PaginatedItemSummaryList itemList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * List item pockets
     *
     * Pockets within the players bag used for storing items by category.
     *
     */
    @GET
    @Path("/item-pocket/")
    @Produces({ "application/json" })
    @ApiOperation(value = "List item pockets", tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = PaginatedItemPocketSummaryList.class) })
    public PaginatedItemPocketSummaryList itemPocketList(@QueryParam("limit") Integer limit, @QueryParam("offset") Integer offset, @QueryParam("q") String q);

    /**
     * Get item pocket
     *
     * Pockets within the players bag used for storing items by category.
     *
     */
    @GET
    @Path("/item-pocket/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item pocket", tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ItemPocketDetail.class) })
    public ItemPocketDetail itemPocketRetrieve(@PathParam("id") String id);

    /**
     * Get item
     *
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     *
     */
    @GET
    @Path("/item/{id}/")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get item", tags={ "items" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = ItemDetail.class) })
    public ItemDetail itemRetrieve(@PathParam("id") String id);
}
