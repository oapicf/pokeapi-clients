package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ItemAttributeApiVerticle())
}

class ItemAttributeApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ItemAttributeApiImpl").newInstance() as ItemAttributeApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ItemAttributeApi.address)
            .register(ItemAttributeApi::class.java,instance)
    }
}