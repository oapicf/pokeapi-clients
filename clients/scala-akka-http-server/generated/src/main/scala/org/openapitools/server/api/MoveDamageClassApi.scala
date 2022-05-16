package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class MoveDamageClassApi(
    moveDamageClassService: MoveDamageClassApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "move-damage-class") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            moveDamageClassService.moveDamageClassList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "move-damage-class" / IntNumber) { (id) => 
      get {  
            moveDamageClassService.moveDamageClassRead(id = id)
      }
    }
}


trait MoveDamageClassApiService {

  def moveDamageClassListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveDamageClassList(limit: Option[Int], offset: Option[Int]): Route

  def moveDamageClassReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveDamageClassRead(id: Int): Route

}


