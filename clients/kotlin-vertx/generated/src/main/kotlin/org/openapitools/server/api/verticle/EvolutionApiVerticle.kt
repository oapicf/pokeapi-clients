package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(EvolutionApiVerticle())
}

class EvolutionApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.EvolutionApiImpl").newInstance() as EvolutionApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(EvolutionApi.address)
            .register(EvolutionApi::class.java,instance)
    }
}