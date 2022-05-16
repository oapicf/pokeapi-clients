package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(TypeApiVerticle())
}

class TypeApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.TypeApiImpl").newInstance() as TypeApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(TypeApi.address)
            .register(TypeApi::class.java,instance)
    }
}