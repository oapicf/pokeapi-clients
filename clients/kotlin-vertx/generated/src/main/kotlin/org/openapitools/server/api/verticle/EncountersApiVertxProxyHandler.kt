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
import org.openapitools.server.api.model.EncounterConditionDetail
import org.openapitools.server.api.model.EncounterConditionValueDetail
import org.openapitools.server.api.model.EncounterMethodDetail
import org.openapitools.server.api.model.PaginatedEncounterConditionSummaryList
import org.openapitools.server.api.model.PaginatedEncounterConditionValueSummaryList
import org.openapitools.server.api.model.PaginatedEncounterMethodSummaryList
import org.openapitools.server.api.model.PokemonEncountersRetrieve200ResponseInner

class EncountersApiVertxProxyHandler(private val vertx: Vertx, private val service: EncountersApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "encounterConditionList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.encounterConditionList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "encounterConditionRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.encounterConditionRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "encounterConditionValueList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.encounterConditionValueList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "encounterConditionValueRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.encounterConditionValueRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "encounterMethodList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.encounterMethodList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "encounterMethodRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.encounterMethodRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "pokemonEncountersRetrieve" -> {
                    val params = context.params
                    val pokemonId = ApiHandlerUtils.searchStringInJson(params,"pokemon_id")
                    if(pokemonId == null){
                        throw IllegalArgumentException("pokemonId is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.pokemonEncountersRetrieve(pokemonId,context)
                        val payload = JsonArray(Json.encode(result.payload)).toBuffer()
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
