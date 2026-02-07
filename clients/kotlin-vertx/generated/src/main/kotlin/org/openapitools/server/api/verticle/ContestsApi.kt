package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.ContestEffectDetail
import org.openapitools.server.api.model.ContestTypeDetail
import org.openapitools.server.api.model.PaginatedContestEffectSummaryList
import org.openapitools.server.api.model.PaginatedContestTypeSummaryList
import org.openapitools.server.api.model.PaginatedSuperContestEffectSummaryList
import org.openapitools.server.api.model.SuperContestEffectDetail
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


interface ContestsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* contestEffectList
     * List contest effects */
    suspend fun contestEffectList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedContestEffectSummaryList>
    /* contestEffectRetrieve
     * Get contest effect */
    suspend fun contestEffectRetrieve(id:kotlin.String?,context:OperationRequest):Response<ContestEffectDetail>
    /* contestTypeList
     * List contest types */
    suspend fun contestTypeList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedContestTypeSummaryList>
    /* contestTypeRetrieve
     * Get contest type */
    suspend fun contestTypeRetrieve(id:kotlin.String?,context:OperationRequest):Response<ContestTypeDetail>
    /* superContestEffectList
     * List super contest effects */
    suspend fun superContestEffectList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedSuperContestEffectSummaryList>
    /* superContestEffectRetrieve
     * Get super contest effect */
    suspend fun superContestEffectRetrieve(id:kotlin.String?,context:OperationRequest):Response<SuperContestEffectDetail>
    companion object {
        const val address = "ContestsApi-service"
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
            for (m in ContestsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ContestsApi::class.java, address)
            return routerFactory
        }
    }
}
