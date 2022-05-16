package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class VersionApi(
    versionService: VersionApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "version") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            versionService.versionList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "version" / IntNumber) { (id) => 
      get {  
            versionService.versionRead(id = id)
      }
    }
}


trait VersionApiService {

  def versionListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def versionList(limit: Option[Int], offset: Option[Int]): Route

  def versionReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def versionRead(id: Int): Route

}


