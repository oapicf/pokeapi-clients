package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class LocationAreaApi(
    locationAreaService: LocationAreaApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "location-area") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            locationAreaService.locationAreaList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "location-area" / IntNumber) { (id) => 
      get {  
            locationAreaService.locationAreaRead(id = id)
      }
    }
}


trait LocationAreaApiService {

  def locationAreaListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def locationAreaList(limit: Option[Int], offset: Option[Int]): Route

  def locationAreaReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def locationAreaRead(id: Int): Route

}


