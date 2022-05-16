package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(StatApiVerticle())
}

class StatApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.StatApiImpl").newInstance() as StatApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(StatApi.address)
            .register(StatApi::class.java,instance)
    }
}