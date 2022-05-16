package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ItemCategoryApiVerticle())
}

class ItemCategoryApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ItemCategoryApiImpl").newInstance() as ItemCategoryApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ItemCategoryApi.address)
            .register(ItemCategoryApi::class.java,instance)
    }
}