package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(BerryFlavorApiVerticle())
}

class BerryFlavorApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.BerryFlavorApiImpl").newInstance() as BerryFlavorApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(BerryFlavorApi.address)
            .register(BerryFlavorApi::class.java,instance)
    }
}