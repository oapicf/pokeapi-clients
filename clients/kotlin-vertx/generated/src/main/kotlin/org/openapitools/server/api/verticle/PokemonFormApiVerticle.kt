package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PokemonFormApiVerticle())
}

class PokemonFormApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PokemonFormApiImpl").newInstance() as PokemonFormApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PokemonFormApi.address)
            .register(PokemonFormApi::class.java,instance)
    }
}