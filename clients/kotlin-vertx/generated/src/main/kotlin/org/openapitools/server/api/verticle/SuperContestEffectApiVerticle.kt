package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(SuperContestEffectApiVerticle())
}

class SuperContestEffectApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.SuperContestEffectApiImpl").newInstance() as SuperContestEffectApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(SuperContestEffectApi.address)
            .register(SuperContestEffectApi::class.java,instance)
    }
}