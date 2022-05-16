package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(AbilityApiVerticle())
}

class AbilityApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.AbilityApiImpl").newInstance() as AbilityApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(AbilityApi.address)
            .register(AbilityApi::class.java,instance)
    }
}