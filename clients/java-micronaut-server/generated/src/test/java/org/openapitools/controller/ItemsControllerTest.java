package org.openapitools.controller;

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
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for ItemsController
 */
@MicronautTest
public class ItemsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ItemsController controller;

    /**
     * This test is used to validate the implementation of itemAttributeList() method
     *
     * The method should: List item attributes
     *
     * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemAttributeListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedItemAttributeSummaryList result = controller.itemAttributeList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/item-attribute/' to the features of itemAttributeList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemAttributeListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/item-attribute/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@ae4a043");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedItemAttributeSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemAttributeRetrieve() method
     *
     * The method should: Get item attribute
     *
     * Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemAttributeRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        ItemAttributeDetail result = controller.itemAttributeRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/item-attribute/{id}/' to the features of itemAttributeRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemAttributeRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/item-attribute/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@50c9b080");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ItemAttributeDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemCategoryList() method
     *
     * The method should: List item categories
     *
     * Item categories determine where items will be placed in the players bag.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemCategoryListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedItemCategorySummaryList result = controller.itemCategoryList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/item-category/' to the features of itemCategoryList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemCategoryListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/item-category/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2ea8f277");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedItemCategorySummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemCategoryRetrieve() method
     *
     * The method should: Get item category
     *
     * Item categories determine where items will be placed in the players bag.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemCategoryRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        ItemCategoryDetail result = controller.itemCategoryRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/item-category/{id}/' to the features of itemCategoryRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemCategoryRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/item-category/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7244b40e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ItemCategoryDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemFlingEffectList() method
     *
     * The method should: List item fling effects
     *
     * The various effects of the move\&quot;Fling\&quot; when used with different items.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemFlingEffectListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedItemFlingEffectSummaryList result = controller.itemFlingEffectList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/item-fling-effect/' to the features of itemFlingEffectList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemFlingEffectListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/item-fling-effect/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@5d8de4bd");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedItemFlingEffectSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemFlingEffectRetrieve() method
     *
     * The method should: Get item fling effect
     *
     * The various effects of the move\&quot;Fling\&quot; when used with different items.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemFlingEffectRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        ItemFlingEffectDetail result = controller.itemFlingEffectRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/item-fling-effect/{id}/' to the features of itemFlingEffectRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemFlingEffectRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/item-fling-effect/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@405d123c");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ItemFlingEffectDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemList() method
     *
     * The method should: List items
     *
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedItemSummaryList result = controller.itemList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/item/' to the features of itemList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/item/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@298f7b0a");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedItemSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemPocketList() method
     *
     * The method should: List item pockets
     *
     * Pockets within the players bag used for storing items by category.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemPocketListMethodTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedItemPocketSummaryList result = controller.itemPocketList(limit, offset, q).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/item-pocket/' to the features of itemPocketList() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemPocketListClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/item-pocket/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7e3c5ef1");
        request.getParameters()
            .add("limit", String.valueOf(56)) // The query parameter format should be 
            .add("offset", String.valueOf(56)) // The query parameter format should be 
            .add("q", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, PaginatedItemPocketSummaryList.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemPocketRetrieve() method
     *
     * The method should: Get item pocket
     *
     * Pockets within the players bag used for storing items by category.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemPocketRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        ItemPocketDetail result = controller.itemPocketRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/item-pocket/{id}/' to the features of itemPocketRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemPocketRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/item-pocket/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4ca6f587");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ItemPocketDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of itemRetrieve() method
     *
     * The method should: Get item
     *
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void itemRetrieveMethodTest() {
        // given
        String id = "example";

        // when
        ItemDetail result = controller.itemRetrieve(id).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/v2/item/{id}/' to the features of itemRetrieve() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void itemRetrieveClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/v2/item/{id}/").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6442c2dd");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ItemDetail.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
