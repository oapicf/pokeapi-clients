package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MoveCategoryApiVerticle())
}

class MoveCategoryApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MoveCategoryApiImpl").newInstance() as MoveCategoryApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MoveCategoryApi.address)
            .register(MoveCategoryApi::class.java,instance)
    }
}