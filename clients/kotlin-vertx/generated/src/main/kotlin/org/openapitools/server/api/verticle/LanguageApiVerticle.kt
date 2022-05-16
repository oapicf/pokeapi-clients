package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(LanguageApiVerticle())
}

class LanguageApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.LanguageApiImpl").newInstance() as LanguageApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(LanguageApi.address)
            .register(LanguageApi::class.java,instance)
    }
}