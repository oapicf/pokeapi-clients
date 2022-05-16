package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class BerryApi(
    berryService: BerryApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "berry") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            berryService.berryList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "berry" / IntNumber) { (id) => 
      get {  
            berryService.berryRead(id = id)
      }
    }
}


trait BerryApiService {

  def berryListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def berryList(limit: Option[Int], offset: Option[Int]): Route

  def berryReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def berryRead(id: Int): Route

}


