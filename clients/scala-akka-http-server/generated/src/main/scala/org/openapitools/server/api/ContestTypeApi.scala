package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class ContestTypeApi(
    contestTypeService: ContestTypeApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "contest-type") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            contestTypeService.contestTypeList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "contest-type" / IntNumber) { (id) => 
      get {  
            contestTypeService.contestTypeRead(id = id)
      }
    }
}


trait ContestTypeApiService {

  def contestTypeListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def contestTypeList(limit: Option[Int], offset: Option[Int]): Route

  def contestTypeReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def contestTypeRead(id: Int): Route

}


