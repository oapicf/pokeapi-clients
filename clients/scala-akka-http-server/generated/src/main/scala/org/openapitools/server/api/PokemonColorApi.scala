package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class PokemonColorApi(
    pokemonColorService: PokemonColorApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "pokemon-color") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            pokemonColorService.pokemonColorList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "pokemon-color" / IntNumber) { (id) => 
      get {  
            pokemonColorService.pokemonColorRead(id = id)
      }
    }
}


trait PokemonColorApiService {

  def pokemonColorListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonColorList(limit: Option[Int], offset: Option[Int]): Route

  def pokemonColorReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonColorRead(id: Int): Route

}


