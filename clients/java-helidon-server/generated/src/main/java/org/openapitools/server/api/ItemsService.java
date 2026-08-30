package org.openapitools.server.api;

import java.util.HexFormat;
import org.openapitools.server.model.ItemAttributeDetail;
import org.openapitools.server.model.ItemCategoryDetail;
import org.openapitools.server.model.ItemDetail;
import org.openapitools.server.model.ItemFlingEffectDetail;
import org.openapitools.server.model.ItemPocketDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PaginatedItemAttributeSummaryList;
import org.openapitools.server.model.PaginatedItemCategorySummaryList;
import org.openapitools.server.model.PaginatedItemFlingEffectSummaryList;
import org.openapitools.server.model.PaginatedItemPocketSummaryList;
import org.openapitools.server.model.PaginatedItemSummaryList;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Items'",
                             version = "7.24.0")
public interface ItemsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/item-attribute/", this::itemAttributeList);
        rules.get("/item-attribute/{id}/", this::itemAttributeRetrieve);
        rules.get("/item-category/", this::itemCategoryList);
        rules.get("/item-category/{id}/", this::itemCategoryRetrieve);
        rules.get("/item-fling-effect/", this::itemFlingEffectList);
        rules.get("/item-fling-effect/{id}/", this::itemFlingEffectRetrieve);
        rules.get("/item/", this::itemList);
        rules.get("/item-pocket/", this::itemPocketList);
        rules.get("/item-pocket/{id}/", this::itemPocketRetrieve);
        rules.get("/item/{id}/", this::itemRetrieve);
    }


    /**
     * GET /api/v2/item-attribute/ : List item attributes.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemAttributeList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/item-attribute/{id}/ : Get item attribute.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemAttributeRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/item-category/ : List item categories.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemCategoryList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/item-category/{id}/ : Get item category.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemCategoryRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/item-fling-effect/ : List item fling effects.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemFlingEffectList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/item-fling-effect/{id}/ : Get item fling effect.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemFlingEffectRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/item/ : List items.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/item-pocket/ : List item pockets.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemPocketList(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/item-pocket/{id}/ : Get item pocket.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemPocketRetrieve(ServerRequest request, ServerResponse response);
    /**
     * GET /api/v2/item/{id}/ : Get item.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemRetrieve(ServerRequest request, ServerResponse response);
}
