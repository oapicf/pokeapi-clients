package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.ItemAttributeDetail
import org.openapitools.server.api.model.ItemCategoryDetail
import org.openapitools.server.api.model.ItemDetail
import org.openapitools.server.api.model.ItemFlingEffectDetail
import org.openapitools.server.api.model.ItemPocketDetail
import org.openapitools.server.api.model.PaginatedItemAttributeSummaryList
import org.openapitools.server.api.model.PaginatedItemCategorySummaryList
import org.openapitools.server.api.model.PaginatedItemFlingEffectSummaryList
import org.openapitools.server.api.model.PaginatedItemPocketSummaryList
import org.openapitools.server.api.model.PaginatedItemSummaryList
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface ItemsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* itemAttributeList
     * List item attributes */
    suspend fun itemAttributeList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedItemAttributeSummaryList>
    /* itemAttributeRetrieve
     * Get item attribute */
    suspend fun itemAttributeRetrieve(id:kotlin.String?,context:OperationRequest):Response<ItemAttributeDetail>
    /* itemCategoryList
     * List item categories */
    suspend fun itemCategoryList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedItemCategorySummaryList>
    /* itemCategoryRetrieve
     * Get item category */
    suspend fun itemCategoryRetrieve(id:kotlin.String?,context:OperationRequest):Response<ItemCategoryDetail>
    /* itemFlingEffectList
     * List item fling effects */
    suspend fun itemFlingEffectList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedItemFlingEffectSummaryList>
    /* itemFlingEffectRetrieve
     * Get item fling effect */
    suspend fun itemFlingEffectRetrieve(id:kotlin.String?,context:OperationRequest):Response<ItemFlingEffectDetail>
    /* itemList
     * List items */
    suspend fun itemList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedItemSummaryList>
    /* itemPocketList
     * List item pockets */
    suspend fun itemPocketList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedItemPocketSummaryList>
    /* itemPocketRetrieve
     * Get item pocket */
    suspend fun itemPocketRetrieve(id:kotlin.String?,context:OperationRequest):Response<ItemPocketDetail>
    /* itemRetrieve
     * Get item */
    suspend fun itemRetrieve(id:kotlin.String?,context:OperationRequest):Response<ItemDetail>
    companion object {
        const val address = "ItemsApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in ItemsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ItemsApi::class.java, address)
            return routerFactory
        }
    }
}
