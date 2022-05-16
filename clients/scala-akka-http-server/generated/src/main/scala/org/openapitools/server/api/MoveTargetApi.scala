package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class MoveTargetApi(
    moveTargetService: MoveTargetApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "move-target") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            moveTargetService.moveTargetList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "move-target" / IntNumber) { (id) => 
      get {  
            moveTargetService.moveTargetRead(id = id)
      }
    }
}


trait MoveTargetApiService {

  def moveTargetListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveTargetList(limit: Option[Int], offset: Option[Int]): Route

  def moveTargetReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveTargetRead(id: Int): Route

}


