package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class MoveBattleStyleApi(
    moveBattleStyleService: MoveBattleStyleApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "move-battle-style") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            moveBattleStyleService.moveBattleStyleList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "move-battle-style" / IntNumber) { (id) => 
      get {  
            moveBattleStyleService.moveBattleStyleRead(id = id)
      }
    }
}


trait MoveBattleStyleApiService {

  def moveBattleStyleListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveBattleStyleList(limit: Option[Int], offset: Option[Int]): Route

  def moveBattleStyleReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveBattleStyleRead(id: Int): Route

}


