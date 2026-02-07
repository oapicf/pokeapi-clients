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

class MovesApiVertxProxyHandler(private val vertx: Vertx, private val service: MovesApi, topLevel: Boolean, private val timeoutSeconds: Long) : ProxyHandler() {
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
        
                "moveAilmentList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveAilmentList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveAilmentRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveAilmentRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveBattleStyleList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveBattleStyleList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveBattleStyleRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveBattleStyleRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveCategoryList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveCategoryList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveCategoryRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveCategoryRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveLearnMethodList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveLearnMethodList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveLearnMethodRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveLearnMethodRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveRetrieve(id,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveTargetList" -> {
                    val params = context.params
                    val limit = ApiHandlerUtils.searchIntegerInJson(params,"limit")
                    val offset = ApiHandlerUtils.searchIntegerInJson(params,"offset")
                    val q = ApiHandlerUtils.searchStringInJson(params,"q")
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveTargetList(limit,offset,q,context)
                        val payload = JsonObject(Json.encode(result.payload)).toBuffer()
                        val res = OperationResponse(result.statusCode,result.statusMessage,payload,result.headers)
                        msg.reply(res.toJson())
                    }.invokeOnCompletion{
                        it?.let{ throw it }
                    }
                }
        
                "moveTargetRetrieve" -> {
                    val params = context.params
                    val id = ApiHandlerUtils.searchStringInJson(params,"id")
                    if(id == null){
                        throw IllegalArgumentException("id is required")
                    }
                    GlobalScope.launch(vertx.dispatcher()){
                        val result = service.moveTargetRetrieve(id,context)
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
