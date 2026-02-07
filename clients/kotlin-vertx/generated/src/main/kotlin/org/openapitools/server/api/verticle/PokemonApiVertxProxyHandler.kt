package org.openapitools.server.api.verticle

import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.api.OperationRequest
import io.vertx.ext.web.api.OperationResponse
import io.vertx.ext.web.api.generator.ApiHandlerUtils
import io.vertx.serviceproxy.ProxyHandler
import io.vertx.serviceproxy.ServiceException
import io.vertx.serviceproxy.ServiceExceptionMessageCodec
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import io.vertx.kotlin.coroutines.dispatcher
import io.vertx.core.json.Json
import io.vertx.core.json.JsonArray
import com.google.gson.reflect.TypeToken
import com.google.gson.Gson
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

class PokemonApiVertxProxyHandler(private val vertx: Vertx, private val service: PokemonApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
    private lateinit var timerID: Long
    private var lastAccessed: Long = 0
    init {
        try {
            this.vertx.eventBus().registerDefaultCodec(ServiceException::class.java,
            ServiceExceptionMessageCodec())
        } catch (ex: IllegalStateException) {}

        if (timeoutSeconds != (-1).toLong() && !topLevel) {
            var period = timeoutSeconds * 1000 / 2
            if (period > 10000) {
                period = 10000
            }
            this.timerID = vertx.setPeriodic(period) { this.checkTimedOut(it) }
        } else {
            this.timerID = -1
        }
        accessed()
    }
    private fun checkTimedOut(id: Long) {
        val now = System.nanoTime()
        if (now - lastAccessed > timeoutSeconds * 1000000000) {
            close()
        }
    }

    override fun close() {
        if (timerID != (-1).toLong()) {
            vertx.cancelTimer(timerID)
        }
        super.close()
    }

    private fun accessed() {
        this.lastAccessed = System.nanoTime()
    }
    override fun handle(msg: Message<JsonObject>) {
        try {
            val json = msg.body()
            val action = msg.headers().get("action") ?: throw IllegalStateException("action not specified")
            accessed()
            val contextSerialized = json.getJsonObject("context") ?: throw IllegalStateException("Received action $action without OperationRequest \"context\"")
            val context = OperationRequest(contextSerialized)
            when (action) {
        
                "abilityList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.abilityList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "abilityRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.abilityRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "characteristicList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.characteristicList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "characteristicRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.characteristicRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "eggGroupList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.eggGroupList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "eggGroupRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.eggGroupRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "genderList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.genderList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "genderRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.genderRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "growthRateList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.growthRateList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "growthRateRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.growthRateRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveDamageClassList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveDamageClassList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveDamageClassRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveDamageClassRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "natureList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.natureList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "natureRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.natureRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokeathlonStatList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokeathlonStatList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokeathlonStatRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokeathlonStatRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonColorList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonColorList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonColorRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonColorRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonFormList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonFormList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonFormRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonFormRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonHabitatList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonHabitatList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonHabitatRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonHabitatRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonShapeList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonShapeList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonShapeRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonShapeRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonSpeciesList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonSpeciesList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonSpeciesRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonSpeciesRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "statList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.statList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "statRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.statRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "typeList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.typeList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "typeRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.typeRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
            }
        }catch (t: Throwable) {
            msg.reply(ServiceException(500, t.message))
            throw t
        }
    }
}
