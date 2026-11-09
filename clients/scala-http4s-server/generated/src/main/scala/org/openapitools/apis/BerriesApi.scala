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
  F[_]: JsonDecoder: Monad
](delegate: BerriesApiDelegate[F]) extends Http4sDsl[F] {
  object berryFirmnessList {
    import BerriesApiDelegate.berryFirmnessListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "berry-firmness" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.berryFirmnessList.handle(req, limit, offset, q, responses)

    }


    val responses: berryFirmnessListResponses[F] = new berryFirmnessListResponses[F] {
      def resp200(value: PaginatedBerryFirmnessSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object berryFirmnessRetrieve {
    import BerriesApiDelegate.berryFirmnessRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "berry-firmness" / id =>
        delegate.berryFirmnessRetrieve.handle(req, id, responses)

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

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "berry-flavor" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.berryFlavorList.handle(req, limit, offset, q, responses)

    }


    val responses: berryFlavorListResponses[F] = new berryFlavorListResponses[F] {
      def resp200(value: PaginatedBerryFlavorSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object berryFlavorRetrieve {
    import BerriesApiDelegate.berryFlavorRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "berry-flavor" / id =>
        delegate.berryFlavorRetrieve.handle(req, id, responses)

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

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "berry" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.berryList.handle(req, limit, offset, q, responses)

    }


    val responses: berryListResponses[F] = new berryListResponses[F] {
      def resp200(value: PaginatedBerrySummaryList): F[Response[F]] = Ok(value)
    }
  }
  object berryRetrieve {
    import BerriesApiDelegate.berryRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "berry" / id =>
        delegate.berryRetrieve.handle(req, id, responses)

    }


    val responses: berryRetrieveResponses[F] = new berryRetrieveResponses[F] {
      def resp200(value: BerryDetail): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    berryFirmnessList.route <+>
    berryFirmnessRetrieve.route <+>
    berryFlavorList.route <+>
    berryFlavorRetrieve.route <+>
    berryList.route <+>
    berryRetrieve.route
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

trait BerriesApiDelegate[F[_]] {

  trait berryFirmnessList {
    import BerriesApiDelegate.berryFirmnessListResponses

    def handle(
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

    def handle(
      req: Request[F],
      id: String,
      responses: berryFirmnessRetrieveResponses[F]
    ): F[Response[F]]

  }
  def berryFirmnessRetrieve: berryFirmnessRetrieve


  trait berryFlavorList {
    import BerriesApiDelegate.berryFlavorListResponses

    def handle(
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

    def handle(
      req: Request[F],
      id: String,
      responses: berryFlavorRetrieveResponses[F]
    ): F[Response[F]]

  }
  def berryFlavorRetrieve: berryFlavorRetrieve


  trait berryList {
    import BerriesApiDelegate.berryListResponses

    def handle(
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

    def handle(
      req: Request[F],
      id: String,
      responses: berryRetrieveResponses[F]
    ): F[Response[F]]

  }
  def berryRetrieve: berryRetrieve

}