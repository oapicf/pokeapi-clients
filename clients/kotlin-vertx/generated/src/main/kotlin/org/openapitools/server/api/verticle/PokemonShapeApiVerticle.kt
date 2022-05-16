package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PokemonShapeApiVerticle())
}

class PokemonShapeApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PokemonShapeApiImpl").newInstance() as PokemonShapeApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PokemonShapeApi.address)
            .register(PokemonShapeApi::class.java,instance)
    }
}