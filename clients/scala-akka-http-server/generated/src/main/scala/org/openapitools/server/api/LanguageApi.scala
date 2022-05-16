package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class LanguageApi(
    languageService: LanguageApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "language") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            languageService.languageList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "language" / IntNumber) { (id) => 
      get {  
            languageService.languageRead(id = id)
      }
    }
}


trait LanguageApiService {

  def languageListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def languageList(limit: Option[Int], offset: Option[Int]): Route

  def languageReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def languageRead(id: Int): Route

}


