package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(LocationApiVerticle())
}

class LocationApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.LocationApiImpl").newInstance() as LocationApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(LocationApi.address)
            .register(LocationApi::class.java,instance)
    }
}