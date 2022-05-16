package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MoveTargetApiVerticle())
}

class MoveTargetApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MoveTargetApiImpl").newInstance() as MoveTargetApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MoveTargetApi.address)
            .register(MoveTargetApi::class.java,instance)
    }
}