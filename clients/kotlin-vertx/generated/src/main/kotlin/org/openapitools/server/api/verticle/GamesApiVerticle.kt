package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(GamesApiVerticle())
}

class GamesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.GamesApiImpl").newInstance() as GamesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(GamesApi.address)
            .register(GamesApi::class.java,instance)
    }
}