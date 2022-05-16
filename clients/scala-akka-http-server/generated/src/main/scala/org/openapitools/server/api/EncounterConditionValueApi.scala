package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class EncounterConditionValueApi(
    encounterConditionValueService: EncounterConditionValueApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "encounter-condition-value") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            encounterConditionValueService.encounterConditionValueList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "encounter-condition-value" / IntNumber) { (id) => 
      get {  
            encounterConditionValueService.encounterConditionValueRead(id = id)
      }
    }
}


trait EncounterConditionValueApiService {

  def encounterConditionValueListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def encounterConditionValueList(limit: Option[Int], offset: Option[Int]): Route

  def encounterConditionValueReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def encounterConditionValueRead(id: Int): Route

}


