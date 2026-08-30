package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.LocationAreaDetail
import org.openapitools.models.LocationDetail
import org.openapitools.models.PaginatedLocationAreaSummaryList
import org.openapitools.models.PaginatedLocationSummaryList
import org.openapitools.models.PaginatedPalParkAreaSummaryList
import org.openapitools.models.PaginatedRegionSummaryList
import org.openapitools.models.PalParkAreaDetail
import org.openapitools.models.RegionDetail


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class LocationApiRoutes[
  F[_]: JsonDecoder: Monad, basicAuth, cookieAuth
](delegate: LocationApiDelegate[F, basicAuth, cookieAuth]) extends Http4sDsl[F] {
  object locationAreaList {
    import LocationApiDelegate.locationAreaListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "location-area" :? limitQueryParam(limit) +& offsetQueryParam(offset)) as auth =>
        delegate.locationAreaList.handle_basicAuth(auth, req, limit, offset, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "location-area" :? limitQueryParam(limit) +& offsetQueryParam(offset)) as auth =>
        delegate.locationAreaList.handle_cookieAuth(auth, req, limit, offset, responses)

    }

    val responses: locationAreaListResponses[F] = new locationAreaListResponses[F] {
      def resp200(value: PaginatedLocationAreaSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object locationAreaRetrieve {
    import LocationApiDelegate.locationAreaRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "location-area" / IntVarr(id)) as auth =>
        delegate.locationAreaRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "location-area" / IntVarr(id)) as auth =>
        delegate.locationAreaRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: locationAreaRetrieveResponses[F] = new locationAreaRetrieveResponses[F] {
      def resp200(value: LocationAreaDetail): F[Response[F]] = Ok(value)
    }
  }
  object locationList {
    import LocationApiDelegate.locationListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "location" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.locationList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "location" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.locationList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: locationListResponses[F] = new locationListResponses[F] {
      def resp200(value: PaginatedLocationSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object locationRetrieve {
    import LocationApiDelegate.locationRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "location" / id) as auth =>
        delegate.locationRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "location" / id) as auth =>
        delegate.locationRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: locationRetrieveResponses[F] = new locationRetrieveResponses[F] {
      def resp200(value: LocationDetail): F[Response[F]] = Ok(value)
    }
  }
  object palParkAreaList {
    import LocationApiDelegate.palParkAreaListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "pal-park-area" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.palParkAreaList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "pal-park-area" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.palParkAreaList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: palParkAreaListResponses[F] = new palParkAreaListResponses[F] {
      def resp200(value: PaginatedPalParkAreaSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object palParkAreaRetrieve {
    import LocationApiDelegate.palParkAreaRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "pal-park-area" / id) as auth =>
        delegate.palParkAreaRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "pal-park-area" / id) as auth =>
        delegate.palParkAreaRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: palParkAreaRetrieveResponses[F] = new palParkAreaRetrieveResponses[F] {
      def resp200(value: PalParkAreaDetail): F[Response[F]] = Ok(value)
    }
  }
  object regionList {
    import LocationApiDelegate.regionListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "region" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.regionList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "region" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.regionList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: regionListResponses[F] = new regionListResponses[F] {
      def resp200(value: PaginatedRegionSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object regionRetrieve {
    import LocationApiDelegate.regionRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "region" / id) as auth =>
        delegate.regionRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "region" / id) as auth =>
        delegate.regionRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: regionRetrieveResponses[F] = new regionRetrieveResponses[F] {
      def resp200(value: RegionDetail): F[Response[F]] = Ok(value)
    }
  }

  val routesbasicAuth =
    locationAreaList.routebasicAuth <+>
    locationAreaRetrieve.routebasicAuth <+>
    locationList.routebasicAuth <+>
    locationRetrieve.routebasicAuth <+>
    palParkAreaList.routebasicAuth <+>
    palParkAreaRetrieve.routebasicAuth <+>
    regionList.routebasicAuth <+>
    regionRetrieve.routebasicAuth
  val routescookieAuth =
    locationAreaList.routecookieAuth <+>
    locationAreaRetrieve.routecookieAuth <+>
    locationList.routecookieAuth <+>
    locationRetrieve.routecookieAuth <+>
    palParkAreaList.routecookieAuth <+>
    palParkAreaRetrieve.routecookieAuth <+>
    regionList.routecookieAuth <+>
    regionRetrieve.routecookieAuth
}

object LocationApiDelegate {
  trait locationAreaListResponses[F[_]] {
    def resp200(value: PaginatedLocationAreaSummaryList): F[Response[F]]
  }

  trait locationAreaRetrieveResponses[F[_]] {
    def resp200(value: LocationAreaDetail): F[Response[F]]
  }

  trait locationListResponses[F[_]] {
    def resp200(value: PaginatedLocationSummaryList): F[Response[F]]
  }

  trait locationRetrieveResponses[F[_]] {
    def resp200(value: LocationDetail): F[Response[F]]
  }

  trait palParkAreaListResponses[F[_]] {
    def resp200(value: PaginatedPalParkAreaSummaryList): F[Response[F]]
  }

  trait palParkAreaRetrieveResponses[F[_]] {
    def resp200(value: PalParkAreaDetail): F[Response[F]]
  }

  trait regionListResponses[F[_]] {
    def resp200(value: PaginatedRegionSummaryList): F[Response[F]]
  }

  trait regionRetrieveResponses[F[_]] {
    def resp200(value: RegionDetail): F[Response[F]]
  }

}

trait LocationApiDelegate[F[_], basicAuth, cookieAuth] {

  trait locationAreaList {
    import LocationApiDelegate.locationAreaListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      responses: locationAreaListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      responses: locationAreaListResponses[F]
    ): F[Response[F]]

  }
  def locationAreaList: locationAreaList


  trait locationAreaRetrieve {
    import LocationApiDelegate.locationAreaRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: Int,
      responses: locationAreaRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: Int,
      responses: locationAreaRetrieveResponses[F]
    ): F[Response[F]]

  }
  def locationAreaRetrieve: locationAreaRetrieve


  trait locationList {
    import LocationApiDelegate.locationListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: locationListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: locationListResponses[F]
    ): F[Response[F]]

  }
  def locationList: locationList


  trait locationRetrieve {
    import LocationApiDelegate.locationRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: locationRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: locationRetrieveResponses[F]
    ): F[Response[F]]

  }
  def locationRetrieve: locationRetrieve


  trait palParkAreaList {
    import LocationApiDelegate.palParkAreaListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: palParkAreaListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: palParkAreaListResponses[F]
    ): F[Response[F]]

  }
  def palParkAreaList: palParkAreaList


  trait palParkAreaRetrieve {
    import LocationApiDelegate.palParkAreaRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: palParkAreaRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: palParkAreaRetrieveResponses[F]
    ): F[Response[F]]

  }
  def palParkAreaRetrieve: palParkAreaRetrieve


  trait regionList {
    import LocationApiDelegate.regionListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: regionListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: regionListResponses[F]
    ): F[Response[F]]

  }
  def regionList: regionList


  trait regionRetrieve {
    import LocationApiDelegate.regionRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: regionRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: regionRetrieveResponses[F]
    ): F[Response[F]]

  }
  def regionRetrieve: regionRetrieve

}