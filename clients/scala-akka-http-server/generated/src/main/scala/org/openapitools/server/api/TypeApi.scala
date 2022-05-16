package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class TypeApi(
    typeService: TypeApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "type") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            typeService.typeList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "type" / IntNumber) { (id) => 
      get {  
            typeService.typeRead(id = id)
      }
    }
}


trait TypeApiService {

  def typeListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def typeList(limit: Option[Int], offset: Option[Int]): Route

  def typeReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def typeRead(id: Int): Route

}


