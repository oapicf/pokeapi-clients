package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.GenerationDetail
import org.openapitools.server.model.PaginatedGenerationSummaryList
import org.openapitools.server.model.PaginatedPokedexSummaryList
import org.openapitools.server.model.PaginatedVersionGroupSummaryList
import org.openapitools.server.model.PaginatedVersionSummaryList
import org.openapitools.server.model.PokedexDetail
import org.openapitools.server.model.VersionDetail
import org.openapitools.server.model.VersionGroupDetail


class GamesApi(
    gamesService: GamesApiService,
    gamesMarshaller: GamesApiMarshaller
) {

  
  import gamesMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "generation") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            gamesService.generationList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "generation" / Segment) { (id) => 
      get {  
            gamesService.generationRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "pokedex") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            gamesService.pokedexList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "pokedex" / Segment) { (id) => 
      get {  
            gamesService.pokedexRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "version-group") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            gamesService.versionGroupList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "version-group" / Segment) { (id) => 
      get {  
            gamesService.versionGroupRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "version") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            gamesService.versionList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "version" / Segment) { (id) => 
      get {  
            gamesService.versionRetrieve(id = id)
      }
    }
}


trait GamesApiService {

  def generationList200(responsePaginatedGenerationSummaryList: PaginatedGenerationSummaryList)(implicit toEntityMarshallerPaginatedGenerationSummaryList: ToEntityMarshaller[PaginatedGenerationSummaryList]): Route =
    complete((200, responsePaginatedGenerationSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedGenerationSummaryList
   */
  def generationList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedGenerationSummaryList: ToEntityMarshaller[PaginatedGenerationSummaryList]): Route

  def generationRetrieve200(responseGenerationDetail: GenerationDetail)(implicit toEntityMarshallerGenerationDetail: ToEntityMarshaller[GenerationDetail]): Route =
    complete((200, responseGenerationDetail))
  /**
   * Code: 200, Message: , DataType: GenerationDetail
   */
  def generationRetrieve(id: String)
      (implicit toEntityMarshallerGenerationDetail: ToEntityMarshaller[GenerationDetail]): Route

  def pokedexList200(responsePaginatedPokedexSummaryList: PaginatedPokedexSummaryList)(implicit toEntityMarshallerPaginatedPokedexSummaryList: ToEntityMarshaller[PaginatedPokedexSummaryList]): Route =
    complete((200, responsePaginatedPokedexSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedPokedexSummaryList
   */
  def pokedexList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedPokedexSummaryList: ToEntityMarshaller[PaginatedPokedexSummaryList]): Route

  def pokedexRetrieve200(responsePokedexDetail: PokedexDetail)(implicit toEntityMarshallerPokedexDetail: ToEntityMarshaller[PokedexDetail]): Route =
    complete((200, responsePokedexDetail))
  /**
   * Code: 200, Message: , DataType: PokedexDetail
   */
  def pokedexRetrieve(id: String)
      (implicit toEntityMarshallerPokedexDetail: ToEntityMarshaller[PokedexDetail]): Route

  def versionGroupList200(responsePaginatedVersionGroupSummaryList: PaginatedVersionGroupSummaryList)(implicit toEntityMarshallerPaginatedVersionGroupSummaryList: ToEntityMarshaller[PaginatedVersionGroupSummaryList]): Route =
    complete((200, responsePaginatedVersionGroupSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedVersionGroupSummaryList
   */
  def versionGroupList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedVersionGroupSummaryList: ToEntityMarshaller[PaginatedVersionGroupSummaryList]): Route

  def versionGroupRetrieve200(responseVersionGroupDetail: VersionGroupDetail)(implicit toEntityMarshallerVersionGroupDetail: ToEntityMarshaller[VersionGroupDetail]): Route =
    complete((200, responseVersionGroupDetail))
  /**
   * Code: 200, Message: , DataType: VersionGroupDetail
   */
  def versionGroupRetrieve(id: String)
      (implicit toEntityMarshallerVersionGroupDetail: ToEntityMarshaller[VersionGroupDetail]): Route

  def versionList200(responsePaginatedVersionSummaryList: PaginatedVersionSummaryList)(implicit toEntityMarshallerPaginatedVersionSummaryList: ToEntityMarshaller[PaginatedVersionSummaryList]): Route =
    complete((200, responsePaginatedVersionSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedVersionSummaryList
   */
  def versionList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedVersionSummaryList: ToEntityMarshaller[PaginatedVersionSummaryList]): Route

  def versionRetrieve200(responseVersionDetail: VersionDetail)(implicit toEntityMarshallerVersionDetail: ToEntityMarshaller[VersionDetail]): Route =
    complete((200, responseVersionDetail))
  /**
   * Code: 200, Message: , DataType: VersionDetail
   */
  def versionRetrieve(id: String)
      (implicit toEntityMarshallerVersionDetail: ToEntityMarshaller[VersionDetail]): Route

}

trait GamesApiMarshaller {


  implicit def toEntityMarshallerPaginatedVersionGroupSummaryList: ToEntityMarshaller[PaginatedVersionGroupSummaryList]

  implicit def toEntityMarshallerVersionGroupDetail: ToEntityMarshaller[VersionGroupDetail]

  implicit def toEntityMarshallerGenerationDetail: ToEntityMarshaller[GenerationDetail]

  implicit def toEntityMarshallerPaginatedVersionSummaryList: ToEntityMarshaller[PaginatedVersionSummaryList]

  implicit def toEntityMarshallerVersionDetail: ToEntityMarshaller[VersionDetail]

  implicit def toEntityMarshallerPaginatedGenerationSummaryList: ToEntityMarshaller[PaginatedGenerationSummaryList]

  implicit def toEntityMarshallerPokedexDetail: ToEntityMarshaller[PokedexDetail]

  implicit def toEntityMarshallerPaginatedPokedexSummaryList: ToEntityMarshaller[PaginatedPokedexSummaryList]

}

