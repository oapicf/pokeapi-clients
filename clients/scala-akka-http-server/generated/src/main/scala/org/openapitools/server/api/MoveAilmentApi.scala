package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class MoveAilmentApi(
    moveAilmentService: MoveAilmentApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "move-ailment") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            moveAilmentService.moveAilmentList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "move-ailment" / IntNumber) { (id) => 
      get {  
            moveAilmentService.moveAilmentRead(id = id)
      }
    }
}


trait MoveAilmentApiService {

  def moveAilmentListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveAilmentList(limit: Option[Int], offset: Option[Int]): Route

  def moveAilmentReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveAilmentRead(id: Int): Route

}


