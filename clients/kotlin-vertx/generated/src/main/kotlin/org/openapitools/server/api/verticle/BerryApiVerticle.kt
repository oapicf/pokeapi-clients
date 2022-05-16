package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BerryApiVerticle())
}

class BerryApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.BerryApiImpl").newInstance() as BerryApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BerryApi.address)
            .register(BerryApi::class.java,instance)
    }
}