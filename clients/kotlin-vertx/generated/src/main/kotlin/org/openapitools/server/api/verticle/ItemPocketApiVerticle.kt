package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ItemPocketApiVerticle())
}

class ItemPocketApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ItemPocketApiImpl").newInstance() as ItemPocketApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ItemPocketApi.address)
            .register(ItemPocketApi::class.java,instance)
    }
}