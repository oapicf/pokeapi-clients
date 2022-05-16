package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class PokemonFormApi(
    pokemonFormService: PokemonFormApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "pokemon-form") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            pokemonFormService.pokemonFormList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "pokemon-form" / IntNumber) { (id) => 
      get {  
            pokemonFormService.pokemonFormRead(id = id)
      }
    }
}


trait PokemonFormApiService {

  def pokemonFormListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonFormList(limit: Option[Int], offset: Option[Int]): Route

  def pokemonFormReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokemonFormRead(id: Int): Route

}


