package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(UtilityApiVerticle())
}

class UtilityApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.UtilityApiImpl").newInstance() as UtilityApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(UtilityApi.address)
            .register(UtilityApi::class.java,instance)
    }
}