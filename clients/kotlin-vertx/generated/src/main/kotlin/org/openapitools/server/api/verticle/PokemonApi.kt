package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AbilityDetail
import org.openapitools.server.api.model.CharacteristicDetail
import org.openapitools.server.api.model.EggGroupDetail
import org.openapitools.server.api.model.GenderDetail
import org.openapitools.server.api.model.GrowthRateDetail
import org.openapitools.server.api.model.MoveDamageClassDetail
import org.openapitools.server.api.model.NatureDetail
import org.openapitools.server.api.model.PaginatedAbilitySummaryList
import org.openapitools.server.api.model.PaginatedCharacteristicSummaryList
import org.openapitools.server.api.model.PaginatedEggGroupSummaryList
import org.openapitools.server.api.model.PaginatedGenderSummaryList
import org.openapitools.server.api.model.PaginatedGrowthRateSummaryList
import org.openapitools.server.api.model.PaginatedMoveDamageClassSummaryList
import org.openapitools.server.api.model.PaginatedNatureSummaryList
import org.openapitools.server.api.model.PaginatedPokeathlonStatSummaryList
import org.openapitools.server.api.model.PaginatedPokemonColorSummaryList
import org.openapitools.server.api.model.PaginatedPokemonFormSummaryList
import org.openapitools.server.api.model.PaginatedPokemonHabitatSummaryList
import org.openapitools.server.api.model.PaginatedPokemonShapeSummaryList
import org.openapitools.server.api.model.PaginatedPokemonSpeciesSummaryList
import org.openapitools.server.api.model.PaginatedPokemonSummaryList
import org.openapitools.server.api.model.PaginatedStatSummaryList
import org.openapitools.server.api.model.PaginatedTypeSummaryList
import org.openapitools.server.api.model.PokeathlonStatDetail
import org.openapitools.server.api.model.PokemonColorDetail
import org.openapitools.server.api.model.PokemonDetail
import org.openapitools.server.api.model.PokemonFormDetail
import org.openapitools.server.api.model.PokemonHabitatDetail
import org.openapitools.server.api.model.PokemonShapeDetail
import org.openapitools.server.api.model.PokemonSpeciesDetail
import org.openapitools.server.api.model.StatDetail
import org.openapitools.server.api.model.TypeDetail
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


interface PokemonApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* abilityList
     *  */
    suspend fun abilityList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedAbilitySummaryList>
    /* abilityRetrieve
     *  */
    suspend fun abilityRetrieve(id:kotlin.String?,context:OperationRequest):Response<AbilityDetail>
    /* characteristicList
     * List charecterictics */
    suspend fun characteristicList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedCharacteristicSummaryList>
    /* characteristicRetrieve
     * Get characteristic */
    suspend fun characteristicRetrieve(id:kotlin.String?,context:OperationRequest):Response<CharacteristicDetail>
    /* eggGroupList
     * List egg groups */
    suspend fun eggGroupList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedEggGroupSummaryList>
    /* eggGroupRetrieve
     * Get egg group */
    suspend fun eggGroupRetrieve(id:kotlin.String?,context:OperationRequest):Response<EggGroupDetail>
    /* genderList
     * List genders */
    suspend fun genderList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedGenderSummaryList>
    /* genderRetrieve
     * Get gender */
    suspend fun genderRetrieve(id:kotlin.String?,context:OperationRequest):Response<GenderDetail>
    /* growthRateList
     * List growth rates */
    suspend fun growthRateList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedGrowthRateSummaryList>
    /* growthRateRetrieve
     * Get growth rate */
    suspend fun growthRateRetrieve(id:kotlin.String?,context:OperationRequest):Response<GrowthRateDetail>
    /* moveDamageClassList
     * List move damage classes */
    suspend fun moveDamageClassList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedMoveDamageClassSummaryList>
    /* moveDamageClassRetrieve
     * Get move damage class */
    suspend fun moveDamageClassRetrieve(id:kotlin.String?,context:OperationRequest):Response<MoveDamageClassDetail>
    /* natureList
     * List natures */
    suspend fun natureList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedNatureSummaryList>
    /* natureRetrieve
     * Get nature */
    suspend fun natureRetrieve(id:kotlin.String?,context:OperationRequest):Response<NatureDetail>
    /* pokeathlonStatList
     * List pokeathlon stats */
    suspend fun pokeathlonStatList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedPokeathlonStatSummaryList>
    /* pokeathlonStatRetrieve
     * Get pokeathlon stat */
    suspend fun pokeathlonStatRetrieve(id:kotlin.String?,context:OperationRequest):Response<PokeathlonStatDetail>
    /* pokemonColorList
     * List pokemon colors */
    suspend fun pokemonColorList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedPokemonColorSummaryList>
    /* pokemonColorRetrieve
     * Get pokemon color */
    suspend fun pokemonColorRetrieve(id:kotlin.String?,context:OperationRequest):Response<PokemonColorDetail>
    /* pokemonFormList
     * List pokemon forms */
    suspend fun pokemonFormList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedPokemonFormSummaryList>
    /* pokemonFormRetrieve
     * Get pokemon form */
    suspend fun pokemonFormRetrieve(id:kotlin.String?,context:OperationRequest):Response<PokemonFormDetail>
    /* pokemonHabitatList
     * List pokemom habitas */
    suspend fun pokemonHabitatList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedPokemonHabitatSummaryList>
    /* pokemonHabitatRetrieve
     * Get pokemom habita */
    suspend fun pokemonHabitatRetrieve(id:kotlin.String?,context:OperationRequest):Response<PokemonHabitatDetail>
    /* pokemonList
     * List pokemon */
    suspend fun pokemonList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedPokemonSummaryList>
    /* pokemonRetrieve
     * Get pokemon */
    suspend fun pokemonRetrieve(id:kotlin.String?,context:OperationRequest):Response<PokemonDetail>
    /* pokemonShapeList
     * List pokemon shapes */
    suspend fun pokemonShapeList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedPokemonShapeSummaryList>
    /* pokemonShapeRetrieve
     * Get pokemon shape */
    suspend fun pokemonShapeRetrieve(id:kotlin.String?,context:OperationRequest):Response<PokemonShapeDetail>
    /* pokemonSpeciesList
     * List pokemon species */
    suspend fun pokemonSpeciesList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedPokemonSpeciesSummaryList>
    /* pokemonSpeciesRetrieve
     * Get pokemon species */
    suspend fun pokemonSpeciesRetrieve(id:kotlin.String?,context:OperationRequest):Response<PokemonSpeciesDetail>
    /* statList
     * List stats */
    suspend fun statList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedStatSummaryList>
    /* statRetrieve
     * Get stat */
    suspend fun statRetrieve(id:kotlin.String?,context:OperationRequest):Response<StatDetail>
    /* typeList
     * List types */
    suspend fun typeList(limit:kotlin.Int?,offset:kotlin.Int?,q:kotlin.String?,context:OperationRequest):Response<PaginatedTypeSummaryList>
    /* typeRetrieve
     * Get types */
    suspend fun typeRetrieve(id:kotlin.String?,context:OperationRequest):Response<TypeDetail>
    companion object {
        const val address = "PokemonApi-service"
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
            for (m in PokemonApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(PokemonApi::class.java, address)
            return routerFactory
        }
    }
}
