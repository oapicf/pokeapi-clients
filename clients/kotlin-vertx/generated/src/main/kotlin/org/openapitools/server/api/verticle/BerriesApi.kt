package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.BerryDetail
import org.openapitools.server.api.model.BerryFirmnessDetail
import org.openapitools.server.api.model.BerryFlavorDetail
import org.openapitools.server.api.model.PaginatedBerryFirmnessSummaryList
import org.openapitools.server.api.model.PaginatedBerryFlavorSummaryList
import org.openapitools.server.api.model.PaginatedBerrySummaryList
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


interface BerriesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* berryFirmnessList
     * List berry firmness */
    suspend fun berryFirmnessList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedBerryFirmnessSummaryList>
    /* berryFirmnessRetrieve
     * Get berry by firmness */
    suspend fun berryFirmnessRetrieve(id:kotlin.String?,context:OperationRequest):Response<BerryFirmnessDetail>
    /* berryFlavorList
     * List berry flavors */
    suspend fun berryFlavorList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedBerryFlavorSummaryList>
    /* berryFlavorRetrieve
     * Get berries by flavor */
    suspend fun berryFlavorRetrieve(id:kotlin.String?,context:OperationRequest):Response<BerryFlavorDetail>
    /* berryList
     * List berries */
    suspend fun berryList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedBerrySummaryList>
    /* berryRetrieve
     * Get a berry */
    suspend fun berryRetrieve(id:kotlin.String?,context:OperationRequest):Response<BerryDetail>
    companion object {
        const val address = "BerriesApi-service"
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
            for (m in BerriesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(BerriesApi::class.java, address)
            return routerFactory
        }
    }
}
