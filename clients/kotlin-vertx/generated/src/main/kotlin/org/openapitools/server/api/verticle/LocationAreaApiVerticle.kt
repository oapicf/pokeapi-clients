package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(LocationAreaApiVerticle())
}

class LocationAreaApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.LocationAreaApiImpl").newInstance() as LocationAreaApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(LocationAreaApi.address)
            .register(LocationAreaApi::class.java,instance)
    }
}