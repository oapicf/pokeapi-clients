package org.openapitools.api.impl;

import org.openapitools.api.*;
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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * PokéAPI
 *
 * <p>All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 */
public class ItemsApiServiceImpl implements ItemsApi {
    /**
     * List item attributes
     *
     * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
     *
     */
    public PaginatedItemAttributeSummaryList itemAttributeList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get item attribute
     *
     * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
     *
     */
    public ItemAttributeDetail itemAttributeRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List item categories
     *
     * Item categories determine where items will be placed in the players bag.
     *
     */
    public PaginatedItemCategorySummaryList itemCategoryList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get item category
     *
     * Item categories determine where items will be placed in the players bag.
     *
     */
    public ItemCategoryDetail itemCategoryRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List item fling effects
     *
     * The various effects of the move\&quot;Fling\&quot; when used with different items.
     *
     */
    public PaginatedItemFlingEffectSummaryList itemFlingEffectList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get item fling effect
     *
     * The various effects of the move\&quot;Fling\&quot; when used with different items.
     *
     */
    public ItemFlingEffectDetail itemFlingEffectRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List items
     *
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     *
     */
    public PaginatedItemSummaryList itemList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * List item pockets
     *
     * Pockets within the players bag used for storing items by category.
     *
     */
    public PaginatedItemPocketSummaryList itemPocketList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get item pocket
     *
     * Pockets within the players bag used for storing items by category.
     *
     */
    public ItemPocketDetail itemPocketRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get item
     *
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     *
     */
    public ItemDetail itemRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

}
