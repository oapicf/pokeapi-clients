package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class StatApi(
    statService: StatApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "stat") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            statService.statList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "stat" / IntNumber) { (id) => 
      get {  
            statService.statRead(id = id)
      }
    }
}


trait StatApiService {

  def statListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def statList(limit: Option[Int], offset: Option[Int]): Route

  def statReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def statRead(id: Int): Route

}


