package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.ContestEffectDetail
import org.openapitools.server.model.ContestTypeDetail
import org.openapitools.server.model.PaginatedContestEffectSummaryList
import org.openapitools.server.model.PaginatedContestTypeSummaryList
import org.openapitools.server.model.PaginatedSuperContestEffectSummaryList
import org.openapitools.server.model.SuperContestEffectDetail


class ContestsApi(
    contestsService: ContestsApiService,
    contestsMarshaller: ContestsApiMarshaller
) {

  
  import contestsMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "contest-effect") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            contestsService.contestEffectList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "contest-effect" / Segment) { (id) => 
      get {  
            contestsService.contestEffectRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "contest-type") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            contestsService.contestTypeList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "contest-type" / Segment) { (id) => 
      get {  
            contestsService.contestTypeRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "super-contest-effect") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            contestsService.superContestEffectList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "super-contest-effect" / Segment) { (id) => 
      get {  
            contestsService.superContestEffectRetrieve(id = id)
      }
    }
}


trait ContestsApiService {

  def contestEffectList200(responsePaginatedContestEffectSummaryList: PaginatedContestEffectSummaryList)(implicit toEntityMarshallerPaginatedContestEffectSummaryList: ToEntityMarshaller[PaginatedContestEffectSummaryList]): Route =
    complete((200, responsePaginatedContestEffectSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedContestEffectSummaryList
   */
  def contestEffectList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedContestEffectSummaryList: ToEntityMarshaller[PaginatedContestEffectSummaryList]): Route

  def contestEffectRetrieve200(responseContestEffectDetail: ContestEffectDetail)(implicit toEntityMarshallerContestEffectDetail: ToEntityMarshaller[ContestEffectDetail]): Route =
    complete((200, responseContestEffectDetail))
  /**
   * Code: 200, Message: , DataType: ContestEffectDetail
   */
  def contestEffectRetrieve(id: String)
      (implicit toEntityMarshallerContestEffectDetail: ToEntityMarshaller[ContestEffectDetail]): Route

  def contestTypeList200(responsePaginatedContestTypeSummaryList: PaginatedContestTypeSummaryList)(implicit toEntityMarshallerPaginatedContestTypeSummaryList: ToEntityMarshaller[PaginatedContestTypeSummaryList]): Route =
    complete((200, responsePaginatedContestTypeSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedContestTypeSummaryList
   */
  def contestTypeList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedContestTypeSummaryList: ToEntityMarshaller[PaginatedContestTypeSummaryList]): Route

  def contestTypeRetrieve200(responseContestTypeDetail: ContestTypeDetail)(implicit toEntityMarshallerContestTypeDetail: ToEntityMarshaller[ContestTypeDetail]): Route =
    complete((200, responseContestTypeDetail))
  /**
   * Code: 200, Message: , DataType: ContestTypeDetail
   */
  def contestTypeRetrieve(id: String)
      (implicit toEntityMarshallerContestTypeDetail: ToEntityMarshaller[ContestTypeDetail]): Route

  def superContestEffectList200(responsePaginatedSuperContestEffectSummaryList: PaginatedSuperContestEffectSummaryList)(implicit toEntityMarshallerPaginatedSuperContestEffectSummaryList: ToEntityMarshaller[PaginatedSuperContestEffectSummaryList]): Route =
    complete((200, responsePaginatedSuperContestEffectSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedSuperContestEffectSummaryList
   */
  def superContestEffectList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedSuperContestEffectSummaryList: ToEntityMarshaller[PaginatedSuperContestEffectSummaryList]): Route

  def superContestEffectRetrieve200(responseSuperContestEffectDetail: SuperContestEffectDetail)(implicit toEntityMarshallerSuperContestEffectDetail: ToEntityMarshaller[SuperContestEffectDetail]): Route =
    complete((200, responseSuperContestEffectDetail))
  /**
   * Code: 200, Message: , DataType: SuperContestEffectDetail
   */
  def superContestEffectRetrieve(id: String)
      (implicit toEntityMarshallerSuperContestEffectDetail: ToEntityMarshaller[SuperContestEffectDetail]): Route

}

trait ContestsApiMarshaller {


  implicit def toEntityMarshallerPaginatedContestTypeSummaryList: ToEntityMarshaller[PaginatedContestTypeSummaryList]

  implicit def toEntityMarshallerSuperContestEffectDetail: ToEntityMarshaller[SuperContestEffectDetail]

  implicit def toEntityMarshallerContestTypeDetail: ToEntityMarshaller[ContestTypeDetail]

  implicit def toEntityMarshallerPaginatedSuperContestEffectSummaryList: ToEntityMarshaller[PaginatedSuperContestEffectSummaryList]

  implicit def toEntityMarshallerPaginatedContestEffectSummaryList: ToEntityMarshaller[PaginatedContestEffectSummaryList]

  implicit def toEntityMarshallerContestEffectDetail: ToEntityMarshaller[ContestEffectDetail]

}

