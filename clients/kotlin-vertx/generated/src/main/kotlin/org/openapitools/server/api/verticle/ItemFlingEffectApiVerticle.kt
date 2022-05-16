package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ItemFlingEffectApiVerticle())
}

class ItemFlingEffectApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ItemFlingEffectApiImpl").newInstance() as ItemFlingEffectApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ItemFlingEffectApi.address)
            .register(ItemFlingEffectApi::class.java,instance)
    }
}