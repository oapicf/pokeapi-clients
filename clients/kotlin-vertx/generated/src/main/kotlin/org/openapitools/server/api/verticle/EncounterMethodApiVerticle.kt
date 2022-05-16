package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(EncounterMethodApiVerticle())
}

class EncounterMethodApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.EncounterMethodApiImpl").newInstance() as EncounterMethodApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(EncounterMethodApi.address)
            .register(EncounterMethodApi::class.java,instance)
    }
}