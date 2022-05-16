package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MachineApiVerticle())
}

class MachineApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MachineApiImpl").newInstance() as MachineApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MachineApi.address)
            .register(MachineApi::class.java,instance)
    }
}