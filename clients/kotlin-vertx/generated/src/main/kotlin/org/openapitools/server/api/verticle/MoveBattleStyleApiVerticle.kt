package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MoveBattleStyleApiVerticle())
}

class MoveBattleStyleApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MoveBattleStyleApiImpl").newInstance() as MoveBattleStyleApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MoveBattleStyleApi.address)
            .register(MoveBattleStyleApi::class.java,instance)
    }
}