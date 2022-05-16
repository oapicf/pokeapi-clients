package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class ItemApi(
    itemService: ItemApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "item") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            itemService.itemList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "item" / IntNumber) { (id) => 
      get {  
            itemService.itemRead(id = id)
      }
    }
}


trait ItemApiService {

  def itemListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def itemList(limit: Option[Int], offset: Option[Int]): Route

  def itemReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def itemRead(id: Int): Route

}


