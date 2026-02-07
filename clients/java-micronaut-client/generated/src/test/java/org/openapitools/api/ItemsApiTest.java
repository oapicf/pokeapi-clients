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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for ItemsApi
 */
@MicronautTest
public class ItemsApiTest {

    @Inject
    ItemsApi api;

    
    /**
     * List item attributes
     *
     * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemAttributeListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedItemAttributeSummaryList body = api.itemAttributeList(limit, offset, q).block();

        // then
        // TODO implement the itemAttributeListTest()
    }

    
    /**
     * Get item attribute
     *
     * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemAttributeRetrieveTest() {
        // given
        String id = "example";

        // when
        ItemAttributeDetail body = api.itemAttributeRetrieve(id).block();

        // then
        // TODO implement the itemAttributeRetrieveTest()
    }

    
    /**
     * List item categories
     *
     * Item categories determine where items will be placed in the players bag.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemCategoryListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedItemCategorySummaryList body = api.itemCategoryList(limit, offset, q).block();

        // then
        // TODO implement the itemCategoryListTest()
    }

    
    /**
     * Get item category
     *
     * Item categories determine where items will be placed in the players bag.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemCategoryRetrieveTest() {
        // given
        String id = "example";

        // when
        ItemCategoryDetail body = api.itemCategoryRetrieve(id).block();

        // then
        // TODO implement the itemCategoryRetrieveTest()
    }

    
    /**
     * List item fling effects
     *
     * The various effects of the move\&quot;Fling\&quot; when used with different items.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemFlingEffectListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedItemFlingEffectSummaryList body = api.itemFlingEffectList(limit, offset, q).block();

        // then
        // TODO implement the itemFlingEffectListTest()
    }

    
    /**
     * Get item fling effect
     *
     * The various effects of the move\&quot;Fling\&quot; when used with different items.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemFlingEffectRetrieveTest() {
        // given
        String id = "example";

        // when
        ItemFlingEffectDetail body = api.itemFlingEffectRetrieve(id).block();

        // then
        // TODO implement the itemFlingEffectRetrieveTest()
    }

    
    /**
     * List items
     *
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedItemSummaryList body = api.itemList(limit, offset, q).block();

        // then
        // TODO implement the itemListTest()
    }

    
    /**
     * List item pockets
     *
     * Pockets within the players bag used for storing items by category.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemPocketListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedItemPocketSummaryList body = api.itemPocketList(limit, offset, q).block();

        // then
        // TODO implement the itemPocketListTest()
    }

    
    /**
     * Get item pocket
     *
     * Pockets within the players bag used for storing items by category.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemPocketRetrieveTest() {
        // given
        String id = "example";

        // when
        ItemPocketDetail body = api.itemPocketRetrieve(id).block();

        // then
        // TODO implement the itemPocketRetrieveTest()
    }

    
    /**
     * Get item
     *
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     */
    @Test
    @Disabled("Not Implemented")
    public void itemRetrieveTest() {
        // given
        String id = "example";

        // when
        ItemDetail body = api.itemRetrieve(id).block();

        // then
        // TODO implement the itemRetrieveTest()
    }

    
}
