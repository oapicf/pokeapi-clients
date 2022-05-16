package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class ItemAttributeApi(
    itemAttributeService: ItemAttributeApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "item-attribute") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            itemAttributeService.itemAttributeList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "item-attribute" / IntNumber) { (id) => 
      get {  
            itemAttributeService.itemAttributeRead(id = id)
      }
    }
}


trait ItemAttributeApiService {

  def itemAttributeListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def itemAttributeList(limit: Option[Int], offset: Option[Int]): Route

  def itemAttributeReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def itemAttributeRead(id: Int): Route

}


