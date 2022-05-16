package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class PalParkAreaApi(
    palParkAreaService: PalParkAreaApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "pal-park-area") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            palParkAreaService.palParkAreaList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "pal-park-area" / IntNumber) { (id) => 
      get {  
            palParkAreaService.palParkAreaRead(id = id)
      }
    }
}


trait PalParkAreaApiService {

  def palParkAreaListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def palParkAreaList(limit: Option[Int], offset: Option[Int]): Route

  def palParkAreaReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def palParkAreaRead(id: Int): Route

}


