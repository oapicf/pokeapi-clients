package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(VersionGroupApiVerticle())
}

class VersionGroupApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.VersionGroupApiImpl").newInstance() as VersionGroupApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(VersionGroupApi.address)
            .register(VersionGroupApi::class.java,instance)
    }
}