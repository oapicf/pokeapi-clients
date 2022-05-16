package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ContestTypeApiVerticle())
}

class ContestTypeApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ContestTypeApiImpl").newInstance() as ContestTypeApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ContestTypeApi.address)
            .register(ContestTypeApi::class.java,instance)
    }
}