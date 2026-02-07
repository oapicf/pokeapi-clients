package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.GenerationDetail
import org.openapitools.server.api.model.PaginatedGenerationSummaryList
import org.openapitools.server.api.model.PaginatedPokedexSummaryList
import org.openapitools.server.api.model.PaginatedVersionGroupSummaryList
import org.openapitools.server.api.model.PaginatedVersionSummaryList
import org.openapitools.server.api.model.PokedexDetail
import org.openapitools.server.api.model.VersionDetail
import org.openapitools.server.api.model.VersionGroupDetail
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


interface GamesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* generationList
     * List genrations */
    suspend fun generationList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedGenerationSummaryList>
    /* generationRetrieve
     * Get genration */
    suspend fun generationRetrieve(id:kotlin.String?,context:OperationRequest):Response<GenerationDetail>
    /* pokedexList
     * List pokedex */
    suspend fun pokedexList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedPokedexSummaryList>
    /* pokedexRetrieve
     * Get pokedex */
    suspend fun pokedexRetrieve(id:kotlin.String?,context:OperationRequest):Response<PokedexDetail>
    /* versionGroupList
     * List version groups */
    suspend fun versionGroupList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedVersionGroupSummaryList>
    /* versionGroupRetrieve
     * Get version group */
    suspend fun versionGroupRetrieve(id:kotlin.String?,context:OperationRequest):Response<VersionGroupDetail>
    /* versionList
     * List versions */
    suspend fun versionList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedVersionSummaryList>
    /* versionRetrieve
     * Get version */
    suspend fun versionRetrieve(id:kotlin.String?,context:OperationRequest):Response<VersionDetail>
    companion object {
        const val address = "GamesApi-service"
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
            for (m in GamesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(GamesApi::class.java, address)
            return routerFactory
        }
    }
}
