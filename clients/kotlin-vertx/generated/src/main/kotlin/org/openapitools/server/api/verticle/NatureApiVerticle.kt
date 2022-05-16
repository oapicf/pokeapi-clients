package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(NatureApiVerticle())
}

class NatureApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.NatureApiImpl").newInstance() as NatureApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(NatureApi.address)
            .register(NatureApi::class.java,instance)
    }
}