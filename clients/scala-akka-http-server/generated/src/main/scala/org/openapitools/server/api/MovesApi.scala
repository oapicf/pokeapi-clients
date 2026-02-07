package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.MoveBattleStyleDetail
import org.openapitools.server.model.MoveDetail
import org.openapitools.server.model.MoveLearnMethodDetail
import org.openapitools.server.model.MoveMetaAilmentDetail
import org.openapitools.server.model.MoveMetaCategoryDetail
import org.openapitools.server.model.MoveTargetDetail
import org.openapitools.server.model.PaginatedMoveBattleStyleSummaryList
import org.openapitools.server.model.PaginatedMoveLearnMethodSummaryList
import org.openapitools.server.model.PaginatedMoveMetaAilmentSummaryList
import org.openapitools.server.model.PaginatedMoveMetaCategorySummaryList
import org.openapitools.server.model.PaginatedMoveSummaryList
import org.openapitools.server.model.PaginatedMoveTargetSummaryList


class MovesApi(
    movesService: MovesApiService,
    movesMarshaller: MovesApiMarshaller
) {

  
  import movesMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "move-ailment") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            movesService.moveAilmentList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "move-ailment" / Segment) { (id) => 
      get {  
            movesService.moveAilmentRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "move-battle-style") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            movesService.moveBattleStyleList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "move-battle-style" / Segment) { (id) => 
      get {  
            movesService.moveBattleStyleRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "move-category") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            movesService.moveCategoryList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "move-category" / Segment) { (id) => 
      get {  
            movesService.moveCategoryRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "move-learn-method") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            movesService.moveLearnMethodList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "move-learn-method" / Segment) { (id) => 
      get {  
            movesService.moveLearnMethodRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "move") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            movesService.moveList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "move" / Segment) { (id) => 
      get {  
            movesService.moveRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "move-target") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            movesService.moveTargetList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "move-target" / Segment) { (id) => 
      get {  
            movesService.moveTargetRetrieve(id = id)
      }
    }
}


trait MovesApiService {

  def moveAilmentList200(responsePaginatedMoveMetaAilmentSummaryList: PaginatedMoveMetaAilmentSummaryList)(implicit toEntityMarshallerPaginatedMoveMetaAilmentSummaryList: ToEntityMarshaller[PaginatedMoveMetaAilmentSummaryList]): Route =
    complete((200, responsePaginatedMoveMetaAilmentSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedMoveMetaAilmentSummaryList
   */
  def moveAilmentList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedMoveMetaAilmentSummaryList: ToEntityMarshaller[PaginatedMoveMetaAilmentSummaryList]): Route

  def moveAilmentRetrieve200(responseMoveMetaAilmentDetail: MoveMetaAilmentDetail)(implicit toEntityMarshallerMoveMetaAilmentDetail: ToEntityMarshaller[MoveMetaAilmentDetail]): Route =
    complete((200, responseMoveMetaAilmentDetail))
  /**
   * Code: 200, Message: , DataType: MoveMetaAilmentDetail
   */
  def moveAilmentRetrieve(id: String)
      (implicit toEntityMarshallerMoveMetaAilmentDetail: ToEntityMarshaller[MoveMetaAilmentDetail]): Route

  def moveBattleStyleList200(responsePaginatedMoveBattleStyleSummaryList: PaginatedMoveBattleStyleSummaryList)(implicit toEntityMarshallerPaginatedMoveBattleStyleSummaryList: ToEntityMarshaller[PaginatedMoveBattleStyleSummaryList]): Route =
    complete((200, responsePaginatedMoveBattleStyleSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedMoveBattleStyleSummaryList
   */
  def moveBattleStyleList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedMoveBattleStyleSummaryList: ToEntityMarshaller[PaginatedMoveBattleStyleSummaryList]): Route

  def moveBattleStyleRetrieve200(responseMoveBattleStyleDetail: MoveBattleStyleDetail)(implicit toEntityMarshallerMoveBattleStyleDetail: ToEntityMarshaller[MoveBattleStyleDetail]): Route =
    complete((200, responseMoveBattleStyleDetail))
  /**
   * Code: 200, Message: , DataType: MoveBattleStyleDetail
   */
  def moveBattleStyleRetrieve(id: String)
      (implicit toEntityMarshallerMoveBattleStyleDetail: ToEntityMarshaller[MoveBattleStyleDetail]): Route

  def moveCategoryList200(responsePaginatedMoveMetaCategorySummaryList: PaginatedMoveMetaCategorySummaryList)(implicit toEntityMarshallerPaginatedMoveMetaCategorySummaryList: ToEntityMarshaller[PaginatedMoveMetaCategorySummaryList]): Route =
    complete((200, responsePaginatedMoveMetaCategorySummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedMoveMetaCategorySummaryList
   */
  def moveCategoryList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedMoveMetaCategorySummaryList: ToEntityMarshaller[PaginatedMoveMetaCategorySummaryList]): Route

  def moveCategoryRetrieve200(responseMoveMetaCategoryDetail: MoveMetaCategoryDetail)(implicit toEntityMarshallerMoveMetaCategoryDetail: ToEntityMarshaller[MoveMetaCategoryDetail]): Route =
    complete((200, responseMoveMetaCategoryDetail))
  /**
   * Code: 200, Message: , DataType: MoveMetaCategoryDetail
   */
  def moveCategoryRetrieve(id: String)
      (implicit toEntityMarshallerMoveMetaCategoryDetail: ToEntityMarshaller[MoveMetaCategoryDetail]): Route

  def moveLearnMethodList200(responsePaginatedMoveLearnMethodSummaryList: PaginatedMoveLearnMethodSummaryList)(implicit toEntityMarshallerPaginatedMoveLearnMethodSummaryList: ToEntityMarshaller[PaginatedMoveLearnMethodSummaryList]): Route =
    complete((200, responsePaginatedMoveLearnMethodSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedMoveLearnMethodSummaryList
   */
  def moveLearnMethodList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedMoveLearnMethodSummaryList: ToEntityMarshaller[PaginatedMoveLearnMethodSummaryList]): Route

  def moveLearnMethodRetrieve200(responseMoveLearnMethodDetail: MoveLearnMethodDetail)(implicit toEntityMarshallerMoveLearnMethodDetail: ToEntityMarshaller[MoveLearnMethodDetail]): Route =
    complete((200, responseMoveLearnMethodDetail))
  /**
   * Code: 200, Message: , DataType: MoveLearnMethodDetail
   */
  def moveLearnMethodRetrieve(id: String)
      (implicit toEntityMarshallerMoveLearnMethodDetail: ToEntityMarshaller[MoveLearnMethodDetail]): Route

  def moveList200(responsePaginatedMoveSummaryList: PaginatedMoveSummaryList)(implicit toEntityMarshallerPaginatedMoveSummaryList: ToEntityMarshaller[PaginatedMoveSummaryList]): Route =
    complete((200, responsePaginatedMoveSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedMoveSummaryList
   */
  def moveList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedMoveSummaryList: ToEntityMarshaller[PaginatedMoveSummaryList]): Route

  def moveRetrieve200(responseMoveDetail: MoveDetail)(implicit toEntityMarshallerMoveDetail: ToEntityMarshaller[MoveDetail]): Route =
    complete((200, responseMoveDetail))
  /**
   * Code: 200, Message: , DataType: MoveDetail
   */
  def moveRetrieve(id: String)
      (implicit toEntityMarshallerMoveDetail: ToEntityMarshaller[MoveDetail]): Route

  def moveTargetList200(responsePaginatedMoveTargetSummaryList: PaginatedMoveTargetSummaryList)(implicit toEntityMarshallerPaginatedMoveTargetSummaryList: ToEntityMarshaller[PaginatedMoveTargetSummaryList]): Route =
    complete((200, responsePaginatedMoveTargetSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedMoveTargetSummaryList
   */
  def moveTargetList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedMoveTargetSummaryList: ToEntityMarshaller[PaginatedMoveTargetSummaryList]): Route

  def moveTargetRetrieve200(responseMoveTargetDetail: MoveTargetDetail)(implicit toEntityMarshallerMoveTargetDetail: ToEntityMarshaller[MoveTargetDetail]): Route =
    complete((200, responseMoveTargetDetail))
  /**
   * Code: 200, Message: , DataType: MoveTargetDetail
   */
  def moveTargetRetrieve(id: String)
      (implicit toEntityMarshallerMoveTargetDetail: ToEntityMarshaller[MoveTargetDetail]): Route

}

trait MovesApiMarshaller {


  implicit def toEntityMarshallerPaginatedMoveLearnMethodSummaryList: ToEntityMarshaller[PaginatedMoveLearnMethodSummaryList]

  implicit def toEntityMarshallerMoveLearnMethodDetail: ToEntityMarshaller[MoveLearnMethodDetail]

  implicit def toEntityMarshallerPaginatedMoveSummaryList: ToEntityMarshaller[PaginatedMoveSummaryList]

  implicit def toEntityMarshallerPaginatedMoveTargetSummaryList: ToEntityMarshaller[PaginatedMoveTargetSummaryList]

  implicit def toEntityMarshallerMoveDetail: ToEntityMarshaller[MoveDetail]

  implicit def toEntityMarshallerMoveMetaCategoryDetail: ToEntityMarshaller[MoveMetaCategoryDetail]

  implicit def toEntityMarshallerPaginatedMoveMetaAilmentSummaryList: ToEntityMarshaller[PaginatedMoveMetaAilmentSummaryList]

  implicit def toEntityMarshallerMoveBattleStyleDetail: ToEntityMarshaller[MoveBattleStyleDetail]

  implicit def toEntityMarshallerPaginatedMoveMetaCategorySummaryList: ToEntityMarshaller[PaginatedMoveMetaCategorySummaryList]

  implicit def toEntityMarshallerMoveMetaAilmentDetail: ToEntityMarshaller[MoveMetaAilmentDetail]

  implicit def toEntityMarshallerMoveTargetDetail: ToEntityMarshaller[MoveTargetDetail]

  implicit def toEntityMarshallerPaginatedMoveBattleStyleSummaryList: ToEntityMarshaller[PaginatedMoveBattleStyleSummaryList]

}

