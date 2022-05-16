package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MoveApiVerticle())
}

class MoveApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MoveApiImpl").newInstance() as MoveApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MoveApi.address)
            .register(MoveApi::class.java,instance)
    }
}