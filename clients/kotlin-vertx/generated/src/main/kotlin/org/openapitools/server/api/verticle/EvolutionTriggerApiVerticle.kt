package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(EvolutionTriggerApiVerticle())
}

class EvolutionTriggerApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.EvolutionTriggerApiImpl").newInstance() as EvolutionTriggerApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(EvolutionTriggerApi.address)
            .register(EvolutionTriggerApi::class.java,instance)
    }
}