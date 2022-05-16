package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class GrowthRateApi(
    growthRateService: GrowthRateApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "growth-rate") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            growthRateService.growthRateList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "growth-rate" / IntNumber) { (id) => 
      get {  
            growthRateService.growthRateRead(id = id)
      }
    }
}


trait GrowthRateApiService {

  def growthRateListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def growthRateList(limit: Option[Int], offset: Option[Int]): Route

  def growthRateReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def growthRateRead(id: Int): Route

}


