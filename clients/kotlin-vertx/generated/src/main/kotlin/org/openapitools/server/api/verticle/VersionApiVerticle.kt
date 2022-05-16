package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(VersionApiVerticle())
}

class VersionApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.VersionApiImpl").newInstance() as VersionApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(VersionApi.address)
            .register(VersionApi::class.java,instance)
    }
}