package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PokemonApiVerticle())
}

class PokemonApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PokemonApiImpl").newInstance() as PokemonApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PokemonApi.address)
            .register(PokemonApi::class.java,instance)
    }
}