package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PokemonHabitatApiVerticle())
}

class PokemonHabitatApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PokemonHabitatApiImpl").newInstance() as PokemonHabitatApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PokemonHabitatApi.address)
            .register(PokemonHabitatApi::class.java,instance)
    }
}