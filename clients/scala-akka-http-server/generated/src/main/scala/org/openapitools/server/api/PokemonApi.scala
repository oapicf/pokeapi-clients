package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class PokemonApi(
    pokemonService: PokemonApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "pokemon") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            pokemonService.pokemonList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "pokemon" / IntNumber) { (id) => 
      get {  
            pokemonService.pokemonRead(id = id)
      }
    }
}


trait PokemonApiService {

  def pokemonListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonList(limit: Option[Int], offset: Option[Int]): Route

  def pokemonReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonRead(id: Int): Route

}


