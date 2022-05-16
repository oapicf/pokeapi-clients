package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(CharacteristicApiVerticle())
}

class CharacteristicApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.CharacteristicApiImpl").newInstance() as CharacteristicApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(CharacteristicApi.address)
            .register(CharacteristicApi::class.java,instance)
    }
}