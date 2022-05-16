package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(MoveDamageClassApiVerticle())
}

class MoveDamageClassApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.MoveDamageClassApiImpl").newInstance() as MoveDamageClassApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(MoveDamageClassApi.address)
            .register(MoveDamageClassApi::class.java,instance)
    }
}