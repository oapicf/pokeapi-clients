package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BerriesApiVerticle())
}

class BerriesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.BerriesApiImpl").newInstance() as BerriesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BerriesApi.address)
            .register(BerriesApi::class.java,instance)
    }
}