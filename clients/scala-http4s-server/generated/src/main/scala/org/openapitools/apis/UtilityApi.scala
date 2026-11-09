package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.LanguageDetail
import org.openapitools.models.PaginatedLanguageSummaryList
import org.openapitools.models.PokeapiMetaResponse


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class UtilityApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: UtilityApiDelegate[F]) extends Http4sDsl[F] {
  object languageList {
    import UtilityApiDelegate.languageListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "language" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.languageList.handle(req, limit, offset, q, responses)

    }


    val responses: languageListResponses[F] = new languageListResponses[F] {
      def resp200(value: PaginatedLanguageSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object languageRetrieve {
    import UtilityApiDelegate.languageRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "language" / id =>
        delegate.languageRetrieve.handle(req, id, responses)

    }


    val responses: languageRetrieveResponses[F] = new languageRetrieveResponses[F] {
      def resp200(value: LanguageDetail): F[Response[F]] = Ok(value)
    }
  }
  object metaRetrieve {
    import UtilityApiDelegate.metaRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "meta" =>
        delegate.metaRetrieve.handle(req, responses)

    }


    val responses: metaRetrieveResponses[F] = new metaRetrieveResponses[F] {
      def resp200(value: PokeapiMetaResponse): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    languageList.route <+>
    languageRetrieve.route <+>
    metaRetrieve.route
}

object UtilityApiDelegate {
  trait languageListResponses[F[_]] {
    def resp200(value: PaginatedLanguageSummaryList): F[Response[F]]
  }

  trait languageRetrieveResponses[F[_]] {
    def resp200(value: LanguageDetail): F[Response[F]]
  }

  trait metaRetrieveResponses[F[_]] {
    def resp200(value: PokeapiMetaResponse): F[Response[F]]
  }

}

trait UtilityApiDelegate[F[_]] {

  trait languageList {
    import UtilityApiDelegate.languageListResponses

    def handle(
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

    def handle(
      req: Request[F],
      id: String,
      responses: languageRetrieveResponses[F]
    ): F[Response[F]]

  }
  def languageRetrieve: languageRetrieve


  trait metaRetrieve {
    import UtilityApiDelegate.metaRetrieveResponses

    def handle(
      req: Request[F],
      responses: metaRetrieveResponses[F]
    ): F[Response[F]]

  }
  def metaRetrieve: metaRetrieve

}