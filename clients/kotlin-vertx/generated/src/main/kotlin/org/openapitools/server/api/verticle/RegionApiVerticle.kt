package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(RegionApiVerticle())
}

class RegionApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.RegionApiImpl").newInstance() as RegionApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(RegionApi.address)
            .register(RegionApi::class.java,instance)
    }
}