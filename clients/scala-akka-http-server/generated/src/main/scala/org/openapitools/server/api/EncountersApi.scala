package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.EncounterConditionDetail
import org.openapitools.server.model.EncounterConditionValueDetail
import org.openapitools.server.model.EncounterMethodDetail
import org.openapitools.server.model.PaginatedEncounterConditionSummaryList
import org.openapitools.server.model.PaginatedEncounterConditionValueSummaryList
import org.openapitools.server.model.PaginatedEncounterMethodSummaryList
import org.openapitools.server.model.PokemonEncountersRetrieve200ResponseInner


class EncountersApi(
    encountersService: EncountersApiService,
    encountersMarshaller: EncountersApiMarshaller
) {

  import EncountersApiPatterns.pokemonIdPattern

  import encountersMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "encounter-condition") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            encountersService.encounterConditionList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "encounter-condition" / Segment) { (id) => 
      get {  
            encountersService.encounterConditionRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "encounter-condition-value") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            encountersService.encounterConditionValueList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "encounter-condition-value" / Segment) { (id) => 
      get {  
            encountersService.encounterConditionValueRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "encounter-method") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            encountersService.encounterMethodList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "encounter-method" / Segment) { (id) => 
      get {  
            encountersService.encounterMethodRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "pokemon" / pokemonIdPattern / "encounters") { (pokemonId) => 
      get {  
            encountersService.pokemonEncountersRetrieve(pokemonId = pokemonId)
      }
    }
}

object EncountersApiPatterns {

    val pokemonIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait EncountersApiService {

  def encounterConditionList200(responsePaginatedEncounterConditionSummaryList: PaginatedEncounterConditionSummaryList)(implicit toEntityMarshallerPaginatedEncounterConditionSummaryList: ToEntityMarshaller[PaginatedEncounterConditionSummaryList]): Route =
    complete((200, responsePaginatedEncounterConditionSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedEncounterConditionSummaryList
   */
  def encounterConditionList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedEncounterConditionSummaryList: ToEntityMarshaller[PaginatedEncounterConditionSummaryList]): Route

  def encounterConditionRetrieve200(responseEncounterConditionDetail: EncounterConditionDetail)(implicit toEntityMarshallerEncounterConditionDetail: ToEntityMarshaller[EncounterConditionDetail]): Route =
    complete((200, responseEncounterConditionDetail))
  /**
   * Code: 200, Message: , DataType: EncounterConditionDetail
   */
  def encounterConditionRetrieve(id: String)
      (implicit toEntityMarshallerEncounterConditionDetail: ToEntityMarshaller[EncounterConditionDetail]): Route

  def encounterConditionValueList200(responsePaginatedEncounterConditionValueSummaryList: PaginatedEncounterConditionValueSummaryList)(implicit toEntityMarshallerPaginatedEncounterConditionValueSummaryList: ToEntityMarshaller[PaginatedEncounterConditionValueSummaryList]): Route =
    complete((200, responsePaginatedEncounterConditionValueSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedEncounterConditionValueSummaryList
   */
  def encounterConditionValueList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedEncounterConditionValueSummaryList: ToEntityMarshaller[PaginatedEncounterConditionValueSummaryList]): Route

  def encounterConditionValueRetrieve200(responseEncounterConditionValueDetail: EncounterConditionValueDetail)(implicit toEntityMarshallerEncounterConditionValueDetail: ToEntityMarshaller[EncounterConditionValueDetail]): Route =
    complete((200, responseEncounterConditionValueDetail))
  /**
   * Code: 200, Message: , DataType: EncounterConditionValueDetail
   */
  def encounterConditionValueRetrieve(id: String)
      (implicit toEntityMarshallerEncounterConditionValueDetail: ToEntityMarshaller[EncounterConditionValueDetail]): Route

  def encounterMethodList200(responsePaginatedEncounterMethodSummaryList: PaginatedEncounterMethodSummaryList)(implicit toEntityMarshallerPaginatedEncounterMethodSummaryList: ToEntityMarshaller[PaginatedEncounterMethodSummaryList]): Route =
    complete((200, responsePaginatedEncounterMethodSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedEncounterMethodSummaryList
   */
  def encounterMethodList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedEncounterMethodSummaryList: ToEntityMarshaller[PaginatedEncounterMethodSummaryList]): Route

  def encounterMethodRetrieve200(responseEncounterMethodDetail: EncounterMethodDetail)(implicit toEntityMarshallerEncounterMethodDetail: ToEntityMarshaller[EncounterMethodDetail]): Route =
    complete((200, responseEncounterMethodDetail))
  /**
   * Code: 200, Message: , DataType: EncounterMethodDetail
   */
  def encounterMethodRetrieve(id: String)
      (implicit toEntityMarshallerEncounterMethodDetail: ToEntityMarshaller[EncounterMethodDetail]): Route

  def pokemonEncountersRetrieve200(responsePokemonEncountersRetrieve200ResponseInnerarray: Seq[PokemonEncountersRetrieve200ResponseInner])(implicit toEntityMarshallerPokemonEncountersRetrieve200ResponseInnerarray: ToEntityMarshaller[Seq[PokemonEncountersRetrieve200ResponseInner]]): Route =
    complete((200, responsePokemonEncountersRetrieve200ResponseInnerarray))
  /**
   * Code: 200, Message: , DataType: Seq[PokemonEncountersRetrieve200ResponseInner]
   */
  def pokemonEncountersRetrieve(pokemonId: String)
      (implicit toEntityMarshallerPokemonEncountersRetrieve200ResponseInnerarray: ToEntityMarshaller[Seq[PokemonEncountersRetrieve200ResponseInner]]): Route

}

trait EncountersApiMarshaller {


  implicit def toEntityMarshallerPaginatedEncounterConditionValueSummaryList: ToEntityMarshaller[PaginatedEncounterConditionValueSummaryList]

  implicit def toEntityMarshallerEncounterMethodDetail: ToEntityMarshaller[EncounterMethodDetail]

  implicit def toEntityMarshallerPokemonEncountersRetrieve200ResponseInnerarray: ToEntityMarshaller[Seq[PokemonEncountersRetrieve200ResponseInner]]

  implicit def toEntityMarshallerEncounterConditionValueDetail: ToEntityMarshaller[EncounterConditionValueDetail]

  implicit def toEntityMarshallerPaginatedEncounterMethodSummaryList: ToEntityMarshaller[PaginatedEncounterMethodSummaryList]

  implicit def toEntityMarshallerPaginatedEncounterConditionSummaryList: ToEntityMarshaller[PaginatedEncounterConditionSummaryList]

  implicit def toEntityMarshallerEncounterConditionDetail: ToEntityMarshaller[EncounterConditionDetail]

}

