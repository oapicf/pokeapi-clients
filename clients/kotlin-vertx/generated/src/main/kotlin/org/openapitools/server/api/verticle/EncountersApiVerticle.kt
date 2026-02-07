package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(EncountersApiVerticle())
}

class EncountersApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.EncountersApiImpl").newInstance() as EncountersApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(EncountersApi.address)
            .register(EncountersApi::class.java,instance)
    }
}