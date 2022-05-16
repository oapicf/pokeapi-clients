package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MoveLearnMethodApiVerticle())
}

class MoveLearnMethodApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MoveLearnMethodApiImpl").newInstance() as MoveLearnMethodApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MoveLearnMethodApi.address)
            .register(MoveLearnMethodApi::class.java,instance)
    }
}