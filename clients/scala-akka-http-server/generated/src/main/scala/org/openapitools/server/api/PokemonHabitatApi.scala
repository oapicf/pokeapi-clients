package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class PokemonHabitatApi(
    pokemonHabitatService: PokemonHabitatApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "pokemon-habitat") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            pokemonHabitatService.pokemonHabitatList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "pokemon-habitat" / IntNumber) { (id) => 
      get {  
            pokemonHabitatService.pokemonHabitatRead(id = id)
      }
    }
}


trait PokemonHabitatApiService {

  def pokemonHabitatListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonHabitatList(limit: Option[Int], offset: Option[Int]): Route

  def pokemonHabitatReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonHabitatRead(id: Int): Route

}


