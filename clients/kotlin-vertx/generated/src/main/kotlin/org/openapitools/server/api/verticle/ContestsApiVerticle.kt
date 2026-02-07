package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ContestsApiVerticle())
}

class ContestsApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ContestsApiImpl").newInstance() as ContestsApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ContestsApi.address)
            .register(ContestsApi::class.java,instance)
    }
}