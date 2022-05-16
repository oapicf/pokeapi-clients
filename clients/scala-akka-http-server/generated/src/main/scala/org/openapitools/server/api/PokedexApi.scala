package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class PokedexApi(
    pokedexService: PokedexApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "pokedex") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            pokedexService.pokedexList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "pokedex" / IntNumber) { (id) => 
      get {  
            pokedexService.pokedexRead(id = id)
      }
    }
}


trait PokedexApiService {

  def pokedexListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokedexList(limit: Option[Int], offset: Option[Int]): Route

  def pokedexReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokedexRead(id: Int): Route

}


