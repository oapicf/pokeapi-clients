package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class LocationApi(
    locationService: LocationApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "location") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            locationService.locationList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "location" / IntNumber) { (id) => 
      get {  
            locationService.locationRead(id = id)
      }
    }
}


trait LocationApiService {

  def locationListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def locationList(limit: Option[Int], offset: Option[Int]): Route

  def locationReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def locationRead(id: Int): Route

}


