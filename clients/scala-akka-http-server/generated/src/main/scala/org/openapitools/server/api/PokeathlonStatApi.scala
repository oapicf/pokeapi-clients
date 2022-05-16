package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import org.openapitools.server.AkkaHttpHelper._


class PokeathlonStatApi(
    pokeathlonStatService: PokeathlonStatApiService
) {

  
  
  lazy val route: Route =
    path("api" / "v2" / "pokeathlon-stat") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) => 
            pokeathlonStatService.pokeathlonStatList(limit = limit, offset = offset)
        }
      }
    } ~
    path("api" / "v2" / "pokeathlon-stat" / IntNumber) { (id) => 
      get {  
            pokeathlonStatService.pokeathlonStatRead(id = id)
      }
    }
}


trait PokeathlonStatApiService {

  def pokeathlonStatListDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokeathlonStatList(limit: Option[Int], offset: Option[Int]): Route

  def pokeathlonStatReadDefault(statusCode: Int, responseString: String)(implicit toEntityMarshallerString: ToEntityMarshaller[String]): Route =
    complete((statusCode, responseString))
  /**
   * Code: 0, Message: Default response, DataType: String
   */
  def pokeathlonStatRead(id: Int): Route

}


