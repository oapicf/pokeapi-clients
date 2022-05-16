package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class EvolutionTriggerApi(
    evolutionTriggerService: EvolutionTriggerApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "evolution-trigger") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            evolutionTriggerService.evolutionTriggerList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "evolution-trigger" / IntNumber) { (id) => 
      get {  
            evolutionTriggerService.evolutionTriggerRead(id = id)
      }
    }
}


trait EvolutionTriggerApiService {

  def evolutionTriggerListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def evolutionTriggerList(limit: Option[Int], offset: Option[Int]): Route

  def evolutionTriggerReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def evolutionTriggerRead(id: Int): Route

}


