package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class CharacteristicApi(
    characteristicService: CharacteristicApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "characteristic") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            characteristicService.characteristicList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "characteristic" / IntNumber) { (id) => 
      get {  
            characteristicService.characteristicRead(id = id)
      }
    }
}


trait CharacteristicApiService {

  def characteristicListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def characteristicList(limit: Option[Int], offset: Option[Int]): Route

  def characteristicReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def characteristicRead(id: Int): Route

}


