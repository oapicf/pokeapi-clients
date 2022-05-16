package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class PokemonSpeciesApi(
    pokemonSpeciesService: PokemonSpeciesApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "pokemon-species") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            pokemonSpeciesService.pokemonSpeciesList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "pokemon-species" / IntNumber) { (id) => 
      get {  
            pokemonSpeciesService.pokemonSpeciesRead(id = id)
      }
    }
}


trait PokemonSpeciesApiService {

  def pokemonSpeciesListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonSpeciesList(limit: Option[Int], offset: Option[Int]): Route

  def pokemonSpeciesReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonSpeciesRead(id: Int): Route

}


