package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(PalParkAreaApiVerticle())
}

class PalParkAreaApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.PalParkAreaApiImpl").newInstance() as PalParkAreaApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(PalParkAreaApi.address)
            .register(PalParkAreaApi::class.java,instance)
    }
}