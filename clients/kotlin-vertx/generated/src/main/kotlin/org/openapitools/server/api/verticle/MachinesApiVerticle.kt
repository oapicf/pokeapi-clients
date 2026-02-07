package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MachinesApiVerticle())
}

class MachinesApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MachinesApiImpl").newInstance() as MachinesApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MachinesApi.address)
            .register(MachinesApi::class.java,instance)
    }
}