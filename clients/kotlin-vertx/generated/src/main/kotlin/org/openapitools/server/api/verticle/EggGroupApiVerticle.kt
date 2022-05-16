package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(EggGroupApiVerticle())
}

class EggGroupApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.EggGroupApiImpl").newInstance() as EggGroupApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(EggGroupApi.address)
            .register(EggGroupApi::class.java,instance)
    }
}