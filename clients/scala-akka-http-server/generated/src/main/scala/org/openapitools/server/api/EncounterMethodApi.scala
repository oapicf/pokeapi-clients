package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class EncounterMethodApi(
    encounterMethodService: EncounterMethodApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "encounter-method") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            encounterMethodService.encounterMethodList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "encounter-method" / IntNumber) { (id) => 
      get {  
            encounterMethodService.encounterMethodRead(id = id)
      }
    }
}


trait EncounterMethodApiService {

  def encounterMethodListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def encounterMethodList(limit: Option[Int], offset: Option[Int]): Route

  def encounterMethodReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def encounterMethodRead(id: Int): Route

}


