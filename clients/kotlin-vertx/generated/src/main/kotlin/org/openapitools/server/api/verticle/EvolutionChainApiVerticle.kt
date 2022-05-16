package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(EvolutionChainApiVerticle())
}

class EvolutionChainApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.EvolutionChainApiImpl").newInstance() as EvolutionChainApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(EvolutionChainApi.address)
            .register(EvolutionChainApi::class.java,instance)
    }
}