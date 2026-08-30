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
  F[_]: JsonDecoder: Monad, basicAuth, cookieAuth
](delegate: EncountersApiDelegate[F, basicAuth, cookieAuth]) extends Http4sDsl[F] {
  object encounterConditionList {
    import EncountersApiDelegate.encounterConditionListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-condition" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.encounterConditionList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-condition" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.encounterConditionList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: encounterConditionListResponses[F] = new encounterConditionListResponses[F] {
      def resp200(value: PaginatedEncounterConditionSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object encounterConditionRetrieve {
    import EncountersApiDelegate.encounterConditionRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-condition" / id) as auth =>
        delegate.encounterConditionRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-condition" / id) as auth =>
        delegate.encounterConditionRetrieve.handle_cookieAuth(auth, req, id, responses)

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

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-condition-value" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.encounterConditionValueList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-condition-value" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.encounterConditionValueList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: encounterConditionValueListResponses[F] = new encounterConditionValueListResponses[F] {
      def resp200(value: PaginatedEncounterConditionValueSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object encounterConditionValueRetrieve {
    import EncountersApiDelegate.encounterConditionValueRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-condition-value" / id) as auth =>
        delegate.encounterConditionValueRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-condition-value" / id) as auth =>
        delegate.encounterConditionValueRetrieve.handle_cookieAuth(auth, req, id, responses)

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

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-method" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.encounterMethodList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-method" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.encounterMethodList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: encounterMethodListResponses[F] = new encounterMethodListResponses[F] {
      def resp200(value: PaginatedEncounterMethodSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object encounterMethodRetrieve {
    import EncountersApiDelegate.encounterMethodRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-method" / id) as auth =>
        delegate.encounterMethodRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "encounter-method" / id) as auth =>
        delegate.encounterMethodRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: encounterMethodRetrieveResponses[F] = new encounterMethodRetrieveResponses[F] {
      def resp200(value: EncounterMethodDetail): F[Response[F]] = Ok(value)
    }
  }

  val routesbasicAuth =
    encounterConditionList.routebasicAuth <+>
    encounterConditionRetrieve.routebasicAuth <+>
    encounterConditionValueList.routebasicAuth <+>
    encounterConditionValueRetrieve.routebasicAuth <+>
    encounterMethodList.routebasicAuth <+>
    encounterMethodRetrieve.routebasicAuth
  val routescookieAuth =
    encounterConditionList.routecookieAuth <+>
    encounterConditionRetrieve.routecookieAuth <+>
    encounterConditionValueList.routecookieAuth <+>
    encounterConditionValueRetrieve.routecookieAuth <+>
    encounterMethodList.routecookieAuth <+>
    encounterMethodRetrieve.routecookieAuth
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

trait EncountersApiDelegate[F[_], basicAuth, cookieAuth] {

  trait encounterConditionList {
    import EncountersApiDelegate.encounterConditionListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: encounterConditionListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: encounterConditionRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: encounterConditionRetrieveResponses[F]
    ): F[Response[F]]

  }
  def encounterConditionRetrieve: encounterConditionRetrieve


  trait encounterConditionValueList {
    import EncountersApiDelegate.encounterConditionValueListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: encounterConditionValueListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: encounterConditionValueRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: encounterConditionValueRetrieveResponses[F]
    ): F[Response[F]]

  }
  def encounterConditionValueRetrieve: encounterConditionValueRetrieve


  trait encounterMethodList {
    import EncountersApiDelegate.encounterMethodListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: encounterMethodListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: encounterMethodRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: encounterMethodRetrieveResponses[F]
    ): F[Response[F]]

  }
  def encounterMethodRetrieve: encounterMethodRetrieve

}