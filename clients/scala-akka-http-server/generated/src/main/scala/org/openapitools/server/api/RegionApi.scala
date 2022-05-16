package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class RegionApi(
    regionService: RegionApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "region") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            regionService.regionList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "region" / IntNumber) { (id) => 
      get {  
            regionService.regionRead(id = id)
      }
    }
}


trait RegionApiService {

  def regionListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def regionList(limit: Option[Int], offset: Option[Int]): Route

  def regionReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def regionRead(id: Int): Route

}


