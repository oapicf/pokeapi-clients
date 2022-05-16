package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class BerryFlavorApi(
    berryFlavorService: BerryFlavorApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "berry-flavor") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            berryFlavorService.berryFlavorList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "berry-flavor" / IntNumber) { (id) => 
      get {  
            berryFlavorService.berryFlavorRead(id = id)
      }
    }
}


trait BerryFlavorApiService {

  def berryFlavorListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def berryFlavorList(limit: Option[Int], offset: Option[Int]): Route

  def berryFlavorReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def berryFlavorRead(id: Int): Route

}


