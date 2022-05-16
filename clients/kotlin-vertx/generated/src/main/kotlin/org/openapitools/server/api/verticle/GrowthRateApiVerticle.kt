package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(GrowthRateApiVerticle())
}

class GrowthRateApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.GrowthRateApiImpl").newInstance() as GrowthRateApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(GrowthRateApi.address)
            .register(GrowthRateApi::class.java,instance)
    }
}