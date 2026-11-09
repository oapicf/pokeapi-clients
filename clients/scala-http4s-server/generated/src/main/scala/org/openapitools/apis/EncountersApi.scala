package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.EncounterConditionDetail
import org.openapitools.models.EncounterConditionValueDetail
import org.openapitools.models.EncounterMethodDetail
import org.openapitools.models.PaginatedEncounterConditionSummaryList
import org.openapitools.models.PaginatedEncounterConditionValueSummaryList
import org.openapitools.models.PaginatedEncounterMethodSummaryList


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class EncountersApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: EncountersApiDelegate[F]) extends Http4sDsl[F] {
  object encounterConditionList {
    import EncountersApiDelegate.encounterConditionListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "encounter-condition" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.encounterConditionList.handle(req, limit, offset, q, responses)

    }


    val responses: encounterConditionListResponses[F] = new encounterConditionListResponses[F] {
      def resp200(value: PaginatedEncounterConditionSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object encounterConditionRetrieve {
    import EncountersApiDelegate.encounterConditionRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "encounter-condition" / id =>
        delegate.encounterConditionRetrieve.handle(req, id, responses)

    }


    val responses: encounterConditionRetrieveResponses[F] = new encounterConditionRetrieveResponses[F] {
      def resp200(value: EncounterConditionDetail): F[Response[F]] = Ok(value)
    }
  }
  object encounterConditionValueList {
    import EncountersApiDelegate.encounterConditionValueListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "encounter-condition-value" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.encounterConditionValueList.handle(req, limit, offset, q, responses)

    }


    val responses: encounterConditionValueListResponses[F] = new encounterConditionValueListResponses[F] {
      def resp200(value: PaginatedEncounterConditionValueSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object encounterConditionValueRetrieve {
    import EncountersApiDelegate.encounterConditionValueRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "encounter-condition-value" / id =>
        delegate.encounterConditionValueRetrieve.handle(req, id, responses)

    }


    val responses: encounterConditionValueRetrieveResponses[F] = new encounterConditionValueRetrieveResponses[F] {
      def resp200(value: EncounterConditionValueDetail): F[Response[F]] = Ok(value)
    }
  }
  object encounterMethodList {
    import EncountersApiDelegate.encounterMethodListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "encounter-method" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.encounterMethodList.handle(req, limit, offset, q, responses)

    }


    val responses: encounterMethodListResponses[F] = new encounterMethodListResponses[F] {
      def resp200(value: PaginatedEncounterMethodSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object encounterMethodRetrieve {
    import EncountersApiDelegate.encounterMethodRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "encounter-method" / id =>
        delegate.encounterMethodRetrieve.handle(req, id, responses)

    }


    val responses: encounterMethodRetrieveResponses[F] = new encounterMethodRetrieveResponses[F] {
      def resp200(value: EncounterMethodDetail): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    encounterConditionList.route <+>
    encounterConditionRetrieve.route <+>
    encounterConditionValueList.route <+>
    encounterConditionValueRetrieve.route <+>
    encounterMethodList.route <+>
    encounterMethodRetrieve.route
}

object EncountersApiDelegate {
  trait encounterConditionListResponses[F[_]] {
    def resp200(value: PaginatedEncounterConditionSummaryList): F[Response[F]]
  }

  trait encounterConditionRetrieveResponses[F[_]] {
    def resp200(value: EncounterConditionDetail): F[Response[F]]
  }

  trait encounterConditionValueListResponses[F[_]] {
    def resp200(value: PaginatedEncounterConditionValueSummaryList): F[Response[F]]
  }

  trait encounterConditionValueRetrieveResponses[F[_]] {
    def resp200(value: EncounterConditionValueDetail): F[Response[F]]
  }

  trait encounterMethodListResponses[F[_]] {
    def resp200(value: PaginatedEncounterMethodSummaryList): F[Response[F]]
  }

  trait encounterMethodRetrieveResponses[F[_]] {
    def resp200(value: EncounterMethodDetail): F[Response[F]]
  }

}

trait EncountersApiDelegate[F[_]] {

  trait encounterConditionList {
    import EncountersApiDelegate.encounterConditionListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: encounterConditionListResponses[F]
    ): F[Response[F]]

  }
  def encounterConditionList: encounterConditionList


  trait encounterConditionRetrieve {
    import EncountersApiDelegate.encounterConditionRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: encounterConditionRetrieveResponses[F]
    ): F[Response[F]]

  }
  def encounterConditionRetrieve: encounterConditionRetrieve


  trait encounterConditionValueList {
    import EncountersApiDelegate.encounterConditionValueListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: encounterConditionValueListResponses[F]
    ): F[Response[F]]

  }
  def encounterConditionValueList: encounterConditionValueList


  trait encounterConditionValueRetrieve {
    import EncountersApiDelegate.encounterConditionValueRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: encounterConditionValueRetrieveResponses[F]
    ): F[Response[F]]

  }
  def encounterConditionValueRetrieve: encounterConditionValueRetrieve


  trait encounterMethodList {
    import EncountersApiDelegate.encounterMethodListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: encounterMethodListResponses[F]
    ): F[Response[F]]

  }
  def encounterMethodList: encounterMethodList


  trait encounterMethodRetrieve {
    import EncountersApiDelegate.encounterMethodRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: encounterMethodRetrieveResponses[F]
    ): F[Response[F]]

  }
  def encounterMethodRetrieve: encounterMethodRetrieve

}