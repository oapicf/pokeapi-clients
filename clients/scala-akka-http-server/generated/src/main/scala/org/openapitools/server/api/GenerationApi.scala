package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class GenerationApi(
    generationService: GenerationApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "generation") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            generationService.generationList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "generation" / IntNumber) { (id) => 
      get {  
            generationService.generationRead(id = id)
      }
    }
}


trait GenerationApiService {

  def generationListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def generationList(limit: Option[Int], offset: Option[Int]): Route

  def generationReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def generationRead(id: Int): Route

}


