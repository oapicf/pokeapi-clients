package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class PokemonShapeApi(
    pokemonShapeService: PokemonShapeApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "pokemon-shape") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            pokemonShapeService.pokemonShapeList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "pokemon-shape" / IntNumber) { (id) => 
      get {  
            pokemonShapeService.pokemonShapeRead(id = id)
      }
    }
}


trait PokemonShapeApiService {

  def pokemonShapeListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonShapeList(limit: Option[Int], offset: Option[Int]): Route

  def pokemonShapeReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonShapeRead(id: Int): Route

}


