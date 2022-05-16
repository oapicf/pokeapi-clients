package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class EncounterConditionApi(
    encounterConditionService: EncounterConditionApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "encounter-condition") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            encounterConditionService.encounterConditionList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "encounter-condition" / IntNumber) { (id) => 
      get {  
            encounterConditionService.encounterConditionRead(id = id)
      }
    }
}


trait EncounterConditionApiService {

  def encounterConditionListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def encounterConditionList(limit: Option[Int], offset: Option[Int]): Route

  def encounterConditionReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def encounterConditionRead(id: Int): Route

}


