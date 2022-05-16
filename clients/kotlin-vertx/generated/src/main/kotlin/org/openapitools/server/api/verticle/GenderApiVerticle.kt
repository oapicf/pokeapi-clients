package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(GenderApiVerticle())
}

class GenderApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.GenderApiImpl").newInstance() as GenderApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(GenderApi.address)
            .register(GenderApi::class.java,instance)
    }
}