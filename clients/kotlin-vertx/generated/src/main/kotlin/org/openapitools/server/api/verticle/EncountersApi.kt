package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.EncounterConditionDetail
import org.openapitools.server.api.model.EncounterConditionValueDetail
import org.openapitools.server.api.model.EncounterMethodDetail
import org.openapitools.server.api.model.PaginatedEncounterConditionSummaryList
import org.openapitools.server.api.model.PaginatedEncounterConditionValueSummaryList
import org.openapitools.server.api.model.PaginatedEncounterMethodSummaryList
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


interface EncountersApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* encounterConditionList
     * List encounter conditions */
    suspend fun encounterConditionList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedEncounterConditionSummaryList>
    /* encounterConditionRetrieve
     * Get encounter condition */
    suspend fun encounterConditionRetrieve(id:kotlin.String?,context:OperationRequest):Response<EncounterConditionDetail>
    /* encounterConditionValueList
     * List encounter condition values */
    suspend fun encounterConditionValueList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedEncounterConditionValueSummaryList>
    /* encounterConditionValueRetrieve
     * Get encounter condition value */
    suspend fun encounterConditionValueRetrieve(id:kotlin.String?,context:OperationRequest):Response<EncounterConditionValueDetail>
    /* encounterMethodList
     * List encounter methods */
    suspend fun encounterMethodList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedEncounterMethodSummaryList>
    /* encounterMethodRetrieve
     * Get encounter method */
    suspend fun encounterMethodRetrieve(id:kotlin.String?,context:OperationRequest):Response<EncounterMethodDetail>
    companion object {
        const val address = "EncountersApi-service"
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
            for (m in EncountersApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(EncountersApi::class.java, address)
            return routerFactory
        }
    }
}
