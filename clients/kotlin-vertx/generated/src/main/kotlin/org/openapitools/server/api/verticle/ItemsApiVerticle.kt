package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ItemsApiVerticle())
}

class ItemsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ItemsApiImpl").newInstance() as ItemsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ItemsApi.address)
            .register(ItemsApi::class.java,instance)
    }
}