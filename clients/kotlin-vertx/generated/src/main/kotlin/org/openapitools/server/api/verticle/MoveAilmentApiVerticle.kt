package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MoveAilmentApiVerticle())
}

class MoveAilmentApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MoveAilmentApiImpl").newInstance() as MoveAilmentApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MoveAilmentApi.address)
            .register(MoveAilmentApi::class.java,instance)
    }
}