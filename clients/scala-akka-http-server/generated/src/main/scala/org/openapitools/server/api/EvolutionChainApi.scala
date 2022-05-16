package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class EvolutionChainApi(
    evolutionChainService: EvolutionChainApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "evolution-chain") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            evolutionChainService.evolutionChainList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "evolution-chain" / IntNumber) { (id) => 
      get {  
            evolutionChainService.evolutionChainRead(id = id)
      }
    }
}


trait EvolutionChainApiService {

  def evolutionChainListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def evolutionChainList(limit: Option[Int], offset: Option[Int]): Route

  def evolutionChainReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def evolutionChainRead(id: Int): Route

}


