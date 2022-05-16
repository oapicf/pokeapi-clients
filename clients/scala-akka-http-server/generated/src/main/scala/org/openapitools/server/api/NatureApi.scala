package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class NatureApi(
    natureService: NatureApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "nature") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            natureService.natureList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "nature" / IntNumber) { (id) => 
      get {  
            natureService.natureRead(id = id)
      }
    }
}


trait NatureApiService {

  def natureListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def natureList(limit: Option[Int], offset: Option[Int]): Route

  def natureReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def natureRead(id: Int): Route

}


