package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class MoveCategoryApi(
    moveCategoryService: MoveCategoryApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "move-category") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            moveCategoryService.moveCategoryList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "move-category" / IntNumber) { (id) => 
      get {  
            moveCategoryService.moveCategoryRead(id = id)
      }
    }
}


trait MoveCategoryApiService {

  def moveCategoryListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveCategoryList(limit: Option[Int], offset: Option[Int]): Route

  def moveCategoryReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def moveCategoryRead(id: Int): Route

}


