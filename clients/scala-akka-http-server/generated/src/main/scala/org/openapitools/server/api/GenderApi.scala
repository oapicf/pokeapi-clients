package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class GenderApi(
    genderService: GenderApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "gender") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            genderService.genderList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "gender" / IntNumber) { (id) => 
      get {  
            genderService.genderRead(id = id)
      }
    }
}


trait GenderApiService {

  def genderListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def genderList(limit: Option[Int], offset: Option[Int]): Route

  def genderReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def genderRead(id: Int): Route

}


