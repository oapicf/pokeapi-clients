package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class MoveLearnMethodApi(
    moveLearnMethodService: MoveLearnMethodApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "move-learn-method") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            moveLearnMethodService.moveLearnMethodList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "move-learn-method" / IntNumber) { (id) => 
      get {  
            moveLearnMethodService.moveLearnMethodRead(id = id)
      }
    }
}


trait MoveLearnMethodApiService {

  def moveLearnMethodListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveLearnMethodList(limit: Option[Int], offset: Option[Int]): Route

  def moveLearnMethodReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveLearnMethodRead(id: Int): Route

}


