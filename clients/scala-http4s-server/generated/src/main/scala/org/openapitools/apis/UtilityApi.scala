package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.LanguageDetail
import org.openapitools.models.PaginatedLanguageSummaryList


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class UtilityApiRoutes[
  F[_]: JsonDecoder: Monad, basicAuth, cookieAuth
](delegate: UtilityApiDelegate[F, basicAuth, cookieAuth]) extends Http4sDsl[F] {
  object languageList {
    import UtilityApiDelegate.languageListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "language" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.languageList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "language" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.languageList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: languageListResponses[F] = new languageListResponses[F] {
      def resp200(value: PaginatedLanguageSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object languageRetrieve {
    import UtilityApiDelegate.languageRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "language" / id) as auth =>
        delegate.languageRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "language" / id) as auth =>
        delegate.languageRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: languageRetrieveResponses[F] = new languageRetrieveResponses[F] {
      def resp200(value: LanguageDetail): F[Response[F]] = Ok(value)
    }
  }

  val routesbasicAuth =
    languageList.routebasicAuth <+>
    languageRetrieve.routebasicAuth
  val routescookieAuth =
    languageList.routecookieAuth <+>
    languageRetrieve.routecookieAuth
}

object UtilityApiDelegate {
  trait languageListResponses[F[_]] {
    def resp200(value: PaginatedLanguageSummaryList): F[Response[F]]
  }

  trait languageRetrieveResponses[F[_]] {
    def resp200(value: LanguageDetail): F[Response[F]]
  }

}

trait UtilityApiDelegate[F[_], basicAuth, cookieAuth] {

  trait languageList {
    import UtilityApiDelegate.languageListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: languageListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: languageListResponses[F]
    ): F[Response[F]]

  }
  def languageList: languageList


  trait languageRetrieve {
    import UtilityApiDelegate.languageRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: languageRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: languageRetrieveResponses[F]
    ): F[Response[F]]

  }
  def languageRetrieve: languageRetrieve

}