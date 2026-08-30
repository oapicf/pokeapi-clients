package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.BerryDetail
import org.openapitools.models.BerryFirmnessDetail
import org.openapitools.models.BerryFlavorDetail
import org.openapitools.models.PaginatedBerryFirmnessSummaryList
import org.openapitools.models.PaginatedBerryFlavorSummaryList
import org.openapitools.models.PaginatedBerrySummaryList


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class BerriesApiRoutes[
  F[_]: JsonDecoder: Monad, basicAuth, cookieAuth
](delegate: BerriesApiDelegate[F, basicAuth, cookieAuth]) extends Http4sDsl[F] {
  object berryFirmnessList {
    import BerriesApiDelegate.berryFirmnessListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry-firmness" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.berryFirmnessList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry-firmness" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.berryFirmnessList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: berryFirmnessListResponses[F] = new berryFirmnessListResponses[F] {
      def resp200(value: PaginatedBerryFirmnessSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object berryFirmnessRetrieve {
    import BerriesApiDelegate.berryFirmnessRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry-firmness" / id) as auth =>
        delegate.berryFirmnessRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry-firmness" / id) as auth =>
        delegate.berryFirmnessRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: berryFirmnessRetrieveResponses[F] = new berryFirmnessRetrieveResponses[F] {
      def resp200(value: BerryFirmnessDetail): F[Response[F]] = Ok(value)
    }
  }
  object berryFlavorList {
    import BerriesApiDelegate.berryFlavorListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry-flavor" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.berryFlavorList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry-flavor" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.berryFlavorList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: berryFlavorListResponses[F] = new berryFlavorListResponses[F] {
      def resp200(value: PaginatedBerryFlavorSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object berryFlavorRetrieve {
    import BerriesApiDelegate.berryFlavorRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry-flavor" / id) as auth =>
        delegate.berryFlavorRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry-flavor" / id) as auth =>
        delegate.berryFlavorRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: berryFlavorRetrieveResponses[F] = new berryFlavorRetrieveResponses[F] {
      def resp200(value: BerryFlavorDetail): F[Response[F]] = Ok(value)
    }
  }
  object berryList {
    import BerriesApiDelegate.berryListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.berryList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.berryList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: berryListResponses[F] = new berryListResponses[F] {
      def resp200(value: PaginatedBerrySummaryList): F[Response[F]] = Ok(value)
    }
  }
  object berryRetrieve {
    import BerriesApiDelegate.berryRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry" / id) as auth =>
        delegate.berryRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "berry" / id) as auth =>
        delegate.berryRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: berryRetrieveResponses[F] = new berryRetrieveResponses[F] {
      def resp200(value: BerryDetail): F[Response[F]] = Ok(value)
    }
  }

  val routesbasicAuth =
    berryFirmnessList.routebasicAuth <+>
    berryFirmnessRetrieve.routebasicAuth <+>
    berryFlavorList.routebasicAuth <+>
    berryFlavorRetrieve.routebasicAuth <+>
    berryList.routebasicAuth <+>
    berryRetrieve.routebasicAuth
  val routescookieAuth =
    berryFirmnessList.routecookieAuth <+>
    berryFirmnessRetrieve.routecookieAuth <+>
    berryFlavorList.routecookieAuth <+>
    berryFlavorRetrieve.routecookieAuth <+>
    berryList.routecookieAuth <+>
    berryRetrieve.routecookieAuth
}

object BerriesApiDelegate {
  trait berryFirmnessListResponses[F[_]] {
    def resp200(value: PaginatedBerryFirmnessSummaryList): F[Response[F]]
  }

  trait berryFirmnessRetrieveResponses[F[_]] {
    def resp200(value: BerryFirmnessDetail): F[Response[F]]
  }

  trait berryFlavorListResponses[F[_]] {
    def resp200(value: PaginatedBerryFlavorSummaryList): F[Response[F]]
  }

  trait berryFlavorRetrieveResponses[F[_]] {
    def resp200(value: BerryFlavorDetail): F[Response[F]]
  }

  trait berryListResponses[F[_]] {
    def resp200(value: PaginatedBerrySummaryList): F[Response[F]]
  }

  trait berryRetrieveResponses[F[_]] {
    def resp200(value: BerryDetail): F[Response[F]]
  }

}

trait BerriesApiDelegate[F[_], basicAuth, cookieAuth] {

  trait berryFirmnessList {
    import BerriesApiDelegate.berryFirmnessListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: berryFirmnessListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: berryFirmnessListResponses[F]
    ): F[Response[F]]

  }
  def berryFirmnessList: berryFirmnessList


  trait berryFirmnessRetrieve {
    import BerriesApiDelegate.berryFirmnessRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: berryFirmnessRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: berryFirmnessRetrieveResponses[F]
    ): F[Response[F]]

  }
  def berryFirmnessRetrieve: berryFirmnessRetrieve


  trait berryFlavorList {
    import BerriesApiDelegate.berryFlavorListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: berryFlavorListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: berryFlavorListResponses[F]
    ): F[Response[F]]

  }
  def berryFlavorList: berryFlavorList


  trait berryFlavorRetrieve {
    import BerriesApiDelegate.berryFlavorRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: berryFlavorRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: berryFlavorRetrieveResponses[F]
    ): F[Response[F]]

  }
  def berryFlavorRetrieve: berryFlavorRetrieve


  trait berryList {
    import BerriesApiDelegate.berryListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: berryListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: berryListResponses[F]
    ): F[Response[F]]

  }
  def berryList: berryList


  trait berryRetrieve {
    import BerriesApiDelegate.berryRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: berryRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: berryRetrieveResponses[F]
    ): F[Response[F]]

  }
  def berryRetrieve: berryRetrieve

}