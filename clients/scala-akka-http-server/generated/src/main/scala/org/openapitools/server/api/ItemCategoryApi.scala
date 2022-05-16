package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class ItemCategoryApi(
    itemCategoryService: ItemCategoryApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "item-category") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            itemCategoryService.itemCategoryList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "item-category" / IntNumber) { (id) => 
      get {  
            itemCategoryService.itemCategoryRead(id = id)
      }
    }
}


trait ItemCategoryApiService {

  def itemCategoryListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def itemCategoryList(limit: Option[Int], offset: Option[Int]): Route

  def itemCategoryReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def itemCategoryRead(id: Int): Route

}


