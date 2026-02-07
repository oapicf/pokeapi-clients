package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.MoveBattleStyleDetail
import org.openapitools.server.api.model.MoveDetail
import org.openapitools.server.api.model.MoveLearnMethodDetail
import org.openapitools.server.api.model.MoveMetaAilmentDetail
import org.openapitools.server.api.model.MoveMetaCategoryDetail
import org.openapitools.server.api.model.MoveTargetDetail
import org.openapitools.server.api.model.PaginatedMoveBattleStyleSummaryList
import org.openapitools.server.api.model.PaginatedMoveLearnMethodSummaryList
import org.openapitools.server.api.model.PaginatedMoveMetaAilmentSummaryList
import org.openapitools.server.api.model.PaginatedMoveMetaCategorySummaryList
import org.openapitools.server.api.model.PaginatedMoveSummaryList
import org.openapitools.server.api.model.PaginatedMoveTargetSummaryList
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


interface MovesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* moveAilmentList
     * List move meta ailments */
    suspend fun moveAilmentList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedMoveMetaAilmentSummaryList>
    /* moveAilmentRetrieve
     * Get move meta ailment */
    suspend fun moveAilmentRetrieve(id:kotlin.String?,context:OperationRequest):Response<MoveMetaAilmentDetail>
    /* moveBattleStyleList
     * List move battle styles */
    suspend fun moveBattleStyleList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedMoveBattleStyleSummaryList>
    /* moveBattleStyleRetrieve
     * Get move battle style */
    suspend fun moveBattleStyleRetrieve(id:kotlin.String?,context:OperationRequest):Response<MoveBattleStyleDetail>
    /* moveCategoryList
     * List move meta categories */
    suspend fun moveCategoryList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedMoveMetaCategorySummaryList>
    /* moveCategoryRetrieve
     * Get move meta category */
    suspend fun moveCategoryRetrieve(id:kotlin.String?,context:OperationRequest):Response<MoveMetaCategoryDetail>
    /* moveLearnMethodList
     * List move learn methods */
    suspend fun moveLearnMethodList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedMoveLearnMethodSummaryList>
    /* moveLearnMethodRetrieve
     * Get move learn method */
    suspend fun moveLearnMethodRetrieve(id:kotlin.String?,context:OperationRequest):Response<MoveLearnMethodDetail>
    /* moveList
     * List moves */
    suspend fun moveList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedMoveSummaryList>
    /* moveRetrieve
     * Get move */
    suspend fun moveRetrieve(id:kotlin.String?,context:OperationRequest):Response<MoveDetail>
    /* moveTargetList
     * List move targets */
    suspend fun moveTargetList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedMoveTargetSummaryList>
    /* moveTargetRetrieve
     * Get move target */
    suspend fun moveTargetRetrieve(id:kotlin.String?,context:OperationRequest):Response<MoveTargetDetail>
    companion object {
        const val address = "MovesApi-service"
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
            for (m in MovesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(MovesApi::class.java, address)
            return routerFactory
        }
    }
}
