package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class BerryFirmnessApi(
    berryFirmnessService: BerryFirmnessApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "berry-firmness") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            berryFirmnessService.berryFirmnessList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "berry-firmness" / IntNumber) { (id) => 
      get {  
            berryFirmnessService.berryFirmnessRead(id = id)
      }
    }
}


trait BerryFirmnessApiService {

  def berryFirmnessListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def berryFirmnessList(limit: Option[Int], offset: Option[Int]): Route

  def berryFirmnessReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def berryFirmnessRead(id: Int): Route

}


