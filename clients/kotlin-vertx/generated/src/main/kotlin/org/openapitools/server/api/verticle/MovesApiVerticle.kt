package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MovesApiVerticle())
}

class MovesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MovesApiImpl").newInstance() as MovesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MovesApi.address)
            .register(MovesApi::class.java,instance)
    }
}