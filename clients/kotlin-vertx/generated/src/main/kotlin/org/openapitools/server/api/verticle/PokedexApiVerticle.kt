package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PokedexApiVerticle())
}

class PokedexApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PokedexApiImpl").newInstance() as PokedexApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PokedexApi.address)
            .register(PokedexApi::class.java,instance)
    }
}