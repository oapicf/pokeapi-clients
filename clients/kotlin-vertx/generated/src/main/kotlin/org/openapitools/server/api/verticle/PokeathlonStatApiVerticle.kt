package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PokeathlonStatApiVerticle())
}

class PokeathlonStatApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PokeathlonStatApiImpl").newInstance() as PokeathlonStatApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PokeathlonStatApi.address)
            .register(PokeathlonStatApi::class.java,instance)
    }
}