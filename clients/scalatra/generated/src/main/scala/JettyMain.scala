/**
 * OpenAPI Sample
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

import org.eclipse.jetty.server._
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener

object JettyMain {

  object conf {
    val port = sys.env.get("PORT") map (_.toInt) getOrElse (8080)
    val stopTimeout = sys.env.get("STOP_TIMEOUT") map (_.toInt) getOrElse (5000)
    val connectorIdleTimeout = sys.env.get("CONNECTOR_IDLE_TIMEOUT") map (_.toInt) getOrElse (90000)
    val webapp = sys.env.get("PUBLIC") getOrElse "webapp"
    val contextPath = sys.env.get("CONTEXT_PATH") getOrElse "/"
  }

  def main(args: Array[String]) = {
    val server: Server = new Server
    println("starting jetty")

    server setStopTimeout conf.stopTimeout
    //server setDumpAfterStart true
    server setStopAtShutdown true

    val httpConfig = new HttpConfiguration()
    httpConfig setSendDateHeader true
    httpConfig setSendServerVersion false

    val connector = new NetworkTrafficServerConnector(server, new HttpConnectionFactory(httpConfig))
    connector setPort conf.port
    connector setSoLingerTime 0
    connector setIdleTimeout conf.connectorIdleTimeout
    server addConnector connector

    val webapp = conf.webapp
    val webApp = new WebAppContext
    webApp setContextPath conf.contextPath
    webApp setResourceBase conf.webapp
    webApp setEventListeners Array(new ScalatraListener)

    server setHandler webApp

    server.start()
  }
}
