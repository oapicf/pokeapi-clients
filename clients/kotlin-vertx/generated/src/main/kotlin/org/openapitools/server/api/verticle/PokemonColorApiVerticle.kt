package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PokemonColorApiVerticle())
}

class PokemonColorApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PokemonColorApiImpl").newInstance() as PokemonColorApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PokemonColorApi.address)
            .register(PokemonColorApi::class.java,instance)
    }
}