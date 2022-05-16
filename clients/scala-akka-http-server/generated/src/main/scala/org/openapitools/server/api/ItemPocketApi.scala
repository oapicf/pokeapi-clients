package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class ItemPocketApi(
    itemPocketService: ItemPocketApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "item-pocket") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            itemPocketService.itemPocketList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "item-pocket" / IntNumber) { (id) => 
      get {  
            itemPocketService.itemPocketRead(id = id)
      }
    }
}


trait ItemPocketApiService {

  def itemPocketListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def itemPocketList(limit: Option[Int], offset: Option[Int]): Route

  def itemPocketReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def itemPocketRead(id: Int): Route

}


