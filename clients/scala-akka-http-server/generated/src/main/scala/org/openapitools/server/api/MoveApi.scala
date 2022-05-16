package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class MoveApi(
    moveService: MoveApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "move") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            moveService.moveList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "move" / IntNumber) { (id) => 
      get {  
            moveService.moveRead(id = id)
      }
    }
}


trait MoveApiService {

  def moveListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveList(limit: Option[Int], offset: Option[Int]): Route

  def moveReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveRead(id: Int): Route

}


