package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(EncounterConditionApiVerticle())
}

class EncounterConditionApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.EncounterConditionApiImpl").newInstance() as EncounterConditionApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(EncounterConditionApi.address)
            .register(EncounterConditionApi::class.java,instance)
    }
}