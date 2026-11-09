package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.MoveBattleStyleDetail
import org.openapitools.models.MoveDetail
import org.openapitools.models.MoveLearnMethodDetail
import org.openapitools.models.MoveMetaAilmentDetail
import org.openapitools.models.MoveMetaCategoryDetail
import org.openapitools.models.MoveTargetDetail
import org.openapitools.models.PaginatedMoveBattleStyleSummaryList
import org.openapitools.models.PaginatedMoveLearnMethodSummaryList
import org.openapitools.models.PaginatedMoveMetaAilmentSummaryList
import org.openapitools.models.PaginatedMoveMetaCategorySummaryList
import org.openapitools.models.PaginatedMoveSummaryList
import org.openapitools.models.PaginatedMoveTargetSummaryList


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class MovesApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: MovesApiDelegate[F]) extends Http4sDsl[F] {
  object moveAilmentList {
    import MovesApiDelegate.moveAilmentListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-ailment" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.moveAilmentList.handle(req, limit, offset, q, responses)

    }


    val responses: moveAilmentListResponses[F] = new moveAilmentListResponses[F] {
      def resp200(value: PaginatedMoveMetaAilmentSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object moveAilmentRetrieve {
    import MovesApiDelegate.moveAilmentRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-ailment" / id =>
        delegate.moveAilmentRetrieve.handle(req, id, responses)

    }


    val responses: moveAilmentRetrieveResponses[F] = new moveAilmentRetrieveResponses[F] {
      def resp200(value: MoveMetaAilmentDetail): F[Response[F]] = Ok(value)
    }
  }
  object moveBattleStyleList {
    import MovesApiDelegate.moveBattleStyleListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-battle-style" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.moveBattleStyleList.handle(req, limit, offset, q, responses)

    }


    val responses: moveBattleStyleListResponses[F] = new moveBattleStyleListResponses[F] {
      def resp200(value: PaginatedMoveBattleStyleSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object moveBattleStyleRetrieve {
    import MovesApiDelegate.moveBattleStyleRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-battle-style" / id =>
        delegate.moveBattleStyleRetrieve.handle(req, id, responses)

    }


    val responses: moveBattleStyleRetrieveResponses[F] = new moveBattleStyleRetrieveResponses[F] {
      def resp200(value: MoveBattleStyleDetail): F[Response[F]] = Ok(value)
    }
  }
  object moveCategoryList {
    import MovesApiDelegate.moveCategoryListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-category" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.moveCategoryList.handle(req, limit, offset, q, responses)

    }


    val responses: moveCategoryListResponses[F] = new moveCategoryListResponses[F] {
      def resp200(value: PaginatedMoveMetaCategorySummaryList): F[Response[F]] = Ok(value)
    }
  }
  object moveCategoryRetrieve {
    import MovesApiDelegate.moveCategoryRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-category" / id =>
        delegate.moveCategoryRetrieve.handle(req, id, responses)

    }


    val responses: moveCategoryRetrieveResponses[F] = new moveCategoryRetrieveResponses[F] {
      def resp200(value: MoveMetaCategoryDetail): F[Response[F]] = Ok(value)
    }
  }
  object moveLearnMethodList {
    import MovesApiDelegate.moveLearnMethodListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-learn-method" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.moveLearnMethodList.handle(req, limit, offset, q, responses)

    }


    val responses: moveLearnMethodListResponses[F] = new moveLearnMethodListResponses[F] {
      def resp200(value: PaginatedMoveLearnMethodSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object moveLearnMethodRetrieve {
    import MovesApiDelegate.moveLearnMethodRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-learn-method" / id =>
        delegate.moveLearnMethodRetrieve.handle(req, id, responses)

    }


    val responses: moveLearnMethodRetrieveResponses[F] = new moveLearnMethodRetrieveResponses[F] {
      def resp200(value: MoveLearnMethodDetail): F[Response[F]] = Ok(value)
    }
  }
  object moveList {
    import MovesApiDelegate.moveListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.moveList.handle(req, limit, offset, q, responses)

    }


    val responses: moveListResponses[F] = new moveListResponses[F] {
      def resp200(value: PaginatedMoveSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object moveRetrieve {
    import MovesApiDelegate.moveRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move" / id =>
        delegate.moveRetrieve.handle(req, id, responses)

    }


    val responses: moveRetrieveResponses[F] = new moveRetrieveResponses[F] {
      def resp200(value: MoveDetail): F[Response[F]] = Ok(value)
    }
  }
  object moveTargetList {
    import MovesApiDelegate.moveTargetListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-target" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.moveTargetList.handle(req, limit, offset, q, responses)

    }


    val responses: moveTargetListResponses[F] = new moveTargetListResponses[F] {
      def resp200(value: PaginatedMoveTargetSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object moveTargetRetrieve {
    import MovesApiDelegate.moveTargetRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-target" / id =>
        delegate.moveTargetRetrieve.handle(req, id, responses)

    }


    val responses: moveTargetRetrieveResponses[F] = new moveTargetRetrieveResponses[F] {
      def resp200(value: MoveTargetDetail): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    moveAilmentList.route <+>
    moveAilmentRetrieve.route <+>
    moveBattleStyleList.route <+>
    moveBattleStyleRetrieve.route <+>
    moveCategoryList.route <+>
    moveCategoryRetrieve.route <+>
    moveLearnMethodList.route <+>
    moveLearnMethodRetrieve.route <+>
    moveList.route <+>
    moveRetrieve.route <+>
    moveTargetList.route <+>
    moveTargetRetrieve.route
}

object MovesApiDelegate {
  trait moveAilmentListResponses[F[_]] {
    def resp200(value: PaginatedMoveMetaAilmentSummaryList): F[Response[F]]
  }

  trait moveAilmentRetrieveResponses[F[_]] {
    def resp200(value: MoveMetaAilmentDetail): F[Response[F]]
  }

  trait moveBattleStyleListResponses[F[_]] {
    def resp200(value: PaginatedMoveBattleStyleSummaryList): F[Response[F]]
  }

  trait moveBattleStyleRetrieveResponses[F[_]] {
    def resp200(value: MoveBattleStyleDetail): F[Response[F]]
  }

  trait moveCategoryListResponses[F[_]] {
    def resp200(value: PaginatedMoveMetaCategorySummaryList): F[Response[F]]
  }

  trait moveCategoryRetrieveResponses[F[_]] {
    def resp200(value: MoveMetaCategoryDetail): F[Response[F]]
  }

  trait moveLearnMethodListResponses[F[_]] {
    def resp200(value: PaginatedMoveLearnMethodSummaryList): F[Response[F]]
  }

  trait moveLearnMethodRetrieveResponses[F[_]] {
    def resp200(value: MoveLearnMethodDetail): F[Response[F]]
  }

  trait moveListResponses[F[_]] {
    def resp200(value: PaginatedMoveSummaryList): F[Response[F]]
  }

  trait moveRetrieveResponses[F[_]] {
    def resp200(value: MoveDetail): F[Response[F]]
  }

  trait moveTargetListResponses[F[_]] {
    def resp200(value: PaginatedMoveTargetSummaryList): F[Response[F]]
  }

  trait moveTargetRetrieveResponses[F[_]] {
    def resp200(value: MoveTargetDetail): F[Response[F]]
  }

}

trait MovesApiDelegate[F[_]] {

  trait moveAilmentList {
    import MovesApiDelegate.moveAilmentListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: moveAilmentListResponses[F]
    ): F[Response[F]]

  }
  def moveAilmentList: moveAilmentList


  trait moveAilmentRetrieve {
    import MovesApiDelegate.moveAilmentRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: moveAilmentRetrieveResponses[F]
    ): F[Response[F]]

  }
  def moveAilmentRetrieve: moveAilmentRetrieve


  trait moveBattleStyleList {
    import MovesApiDelegate.moveBattleStyleListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: moveBattleStyleListResponses[F]
    ): F[Response[F]]

  }
  def moveBattleStyleList: moveBattleStyleList


  trait moveBattleStyleRetrieve {
    import MovesApiDelegate.moveBattleStyleRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: moveBattleStyleRetrieveResponses[F]
    ): F[Response[F]]

  }
  def moveBattleStyleRetrieve: moveBattleStyleRetrieve


  trait moveCategoryList {
    import MovesApiDelegate.moveCategoryListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: moveCategoryListResponses[F]
    ): F[Response[F]]

  }
  def moveCategoryList: moveCategoryList


  trait moveCategoryRetrieve {
    import MovesApiDelegate.moveCategoryRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: moveCategoryRetrieveResponses[F]
    ): F[Response[F]]

  }
  def moveCategoryRetrieve: moveCategoryRetrieve


  trait moveLearnMethodList {
    import MovesApiDelegate.moveLearnMethodListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: moveLearnMethodListResponses[F]
    ): F[Response[F]]

  }
  def moveLearnMethodList: moveLearnMethodList


  trait moveLearnMethodRetrieve {
    import MovesApiDelegate.moveLearnMethodRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: moveLearnMethodRetrieveResponses[F]
    ): F[Response[F]]

  }
  def moveLearnMethodRetrieve: moveLearnMethodRetrieve


  trait moveList {
    import MovesApiDelegate.moveListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: moveListResponses[F]
    ): F[Response[F]]

  }
  def moveList: moveList


  trait moveRetrieve {
    import MovesApiDelegate.moveRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: moveRetrieveResponses[F]
    ): F[Response[F]]

  }
  def moveRetrieve: moveRetrieve


  trait moveTargetList {
    import MovesApiDelegate.moveTargetListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: moveTargetListResponses[F]
    ): F[Response[F]]

  }
  def moveTargetList: moveTargetList


  trait moveTargetRetrieve {
    import MovesApiDelegate.moveTargetRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: moveTargetRetrieveResponses[F]
    ): F[Response[F]]

  }
  def moveTargetRetrieve: moveTargetRetrieve

}