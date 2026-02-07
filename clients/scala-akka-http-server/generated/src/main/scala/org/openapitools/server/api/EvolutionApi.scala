package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.EvolutionChainDetail
import org.openapitools.server.model.EvolutionTriggerDetail
import org.openapitools.server.model.PaginatedEvolutionChainSummaryList
import org.openapitools.server.model.PaginatedEvolutionTriggerSummaryList


class EvolutionApi(
    evolutionService: EvolutionApiService,
    evolutionMarshaller: EvolutionApiMarshaller
) {

  
  import evolutionMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "evolution-chain") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            evolutionService.evolutionChainList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "evolution-chain" / Segment) { (id) => 
      get {  
            evolutionService.evolutionChainRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "evolution-trigger") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            evolutionService.evolutionTriggerList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "evolution-trigger" / Segment) { (id) => 
      get {  
            evolutionService.evolutionTriggerRetrieve(id = id)
      }
    }
}


trait EvolutionApiService {

  def evolutionChainList200(responsePaginatedEvolutionChainSummaryList: PaginatedEvolutionChainSummaryList)(implicit toEntityMarshallerPaginatedEvolutionChainSummaryList: ToEntityMarshaller[PaginatedEvolutionChainSummaryList]): Route =
    complete((200, responsePaginatedEvolutionChainSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedEvolutionChainSummaryList
   */
  def evolutionChainList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedEvolutionChainSummaryList: ToEntityMarshaller[PaginatedEvolutionChainSummaryList]): Route

  def evolutionChainRetrieve200(responseEvolutionChainDetail: EvolutionChainDetail)(implicit toEntityMarshallerEvolutionChainDetail: ToEntityMarshaller[EvolutionChainDetail]): Route =
    complete((200, responseEvolutionChainDetail))
  /**
   * Code: 200, Message: , DataType: EvolutionChainDetail
   */
  def evolutionChainRetrieve(id: String)
      (implicit toEntityMarshallerEvolutionChainDetail: ToEntityMarshaller[EvolutionChainDetail]): Route

  def evolutionTriggerList200(responsePaginatedEvolutionTriggerSummaryList: PaginatedEvolutionTriggerSummaryList)(implicit toEntityMarshallerPaginatedEvolutionTriggerSummaryList: ToEntityMarshaller[PaginatedEvolutionTriggerSummaryList]): Route =
    complete((200, responsePaginatedEvolutionTriggerSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedEvolutionTriggerSummaryList
   */
  def evolutionTriggerList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedEvolutionTriggerSummaryList: ToEntityMarshaller[PaginatedEvolutionTriggerSummaryList]): Route

  def evolutionTriggerRetrieve200(responseEvolutionTriggerDetail: EvolutionTriggerDetail)(implicit toEntityMarshallerEvolutionTriggerDetail: ToEntityMarshaller[EvolutionTriggerDetail]): Route =
    complete((200, responseEvolutionTriggerDetail))
  /**
   * Code: 200, Message: , DataType: EvolutionTriggerDetail
   */
  def evolutionTriggerRetrieve(id: String)
      (implicit toEntityMarshallerEvolutionTriggerDetail: ToEntityMarshaller[EvolutionTriggerDetail]): Route

}

trait EvolutionApiMarshaller {


  implicit def toEntityMarshallerEvolutionTriggerDetail: ToEntityMarshaller[EvolutionTriggerDetail]

  implicit def toEntityMarshallerPaginatedEvolutionChainSummaryList: ToEntityMarshaller[PaginatedEvolutionChainSummaryList]

  implicit def toEntityMarshallerEvolutionChainDetail: ToEntityMarshaller[EvolutionChainDetail]

  implicit def toEntityMarshallerPaginatedEvolutionTriggerSummaryList: ToEntityMarshaller[PaginatedEvolutionTriggerSummaryList]

}

