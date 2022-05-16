package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class AbilityApi(
    abilityService: AbilityApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "ability") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            abilityService.abilityList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "ability" / IntNumber) { (id) => 
      get {  
            abilityService.abilityRead(id = id)
      }
    }
}


trait AbilityApiService {

  def abilityListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def abilityList(limit: Option[Int], offset: Option[Int]): Route

  def abilityReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def abilityRead(id: Int): Route

}


