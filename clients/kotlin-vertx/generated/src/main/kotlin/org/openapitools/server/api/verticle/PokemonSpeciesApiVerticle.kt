package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PokemonSpeciesApiVerticle())
}

class PokemonSpeciesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PokemonSpeciesApiImpl").newInstance() as PokemonSpeciesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PokemonSpeciesApi.address)
            .register(PokemonSpeciesApi::class.java,instance)
    }
}