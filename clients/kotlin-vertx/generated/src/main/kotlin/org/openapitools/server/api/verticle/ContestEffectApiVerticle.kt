package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ContestEffectApiVerticle())
}

class ContestEffectApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ContestEffectApiImpl").newInstance() as ContestEffectApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ContestEffectApi.address)
            .register(ContestEffectApi::class.java,instance)
    }
}