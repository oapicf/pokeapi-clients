package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(EncounterConditionValueApiVerticle())
}

class EncounterConditionValueApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.EncounterConditionValueApiImpl").newInstance() as EncounterConditionValueApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(EncounterConditionValueApi.address)
            .register(EncounterConditionValueApi::class.java,instance)
    }
}