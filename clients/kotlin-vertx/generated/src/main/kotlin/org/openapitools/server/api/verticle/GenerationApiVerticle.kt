package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(GenerationApiVerticle())
}

class GenerationApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.GenerationApiImpl").newInstance() as GenerationApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(GenerationApi.address)
            .register(GenerationApi::class.java,instance)
    }
}