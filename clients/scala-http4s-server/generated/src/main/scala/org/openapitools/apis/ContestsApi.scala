package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.ContestEffectDetail
import org.openapitools.models.ContestTypeDetail
import org.openapitools.models.PaginatedContestEffectSummaryList
import org.openapitools.models.PaginatedContestTypeSummaryList
import org.openapitools.models.PaginatedSuperContestEffectSummaryList
import org.openapitools.models.SuperContestEffectDetail


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class ContestsApiRoutes[
  F[_]: JsonDecoder: Monad, basicAuth, cookieAuth
](delegate: ContestsApiDelegate[F, basicAuth, cookieAuth]) extends Http4sDsl[F] {
  object contestEffectList {
    import ContestsApiDelegate.contestEffectListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "contest-effect" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.contestEffectList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "contest-effect" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.contestEffectList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: contestEffectListResponses[F] = new contestEffectListResponses[F] {
      def resp200(value: PaginatedContestEffectSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object contestEffectRetrieve {
    import ContestsApiDelegate.contestEffectRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "contest-effect" / id) as auth =>
        delegate.contestEffectRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "contest-effect" / id) as auth =>
        delegate.contestEffectRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: contestEffectRetrieveResponses[F] = new contestEffectRetrieveResponses[F] {
      def resp200(value: ContestEffectDetail): F[Response[F]] = Ok(value)
    }
  }
  object contestTypeList {
    import ContestsApiDelegate.contestTypeListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "contest-type" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.contestTypeList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "contest-type" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.contestTypeList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: contestTypeListResponses[F] = new contestTypeListResponses[F] {
      def resp200(value: PaginatedContestTypeSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object contestTypeRetrieve {
    import ContestsApiDelegate.contestTypeRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "contest-type" / id) as auth =>
        delegate.contestTypeRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "contest-type" / id) as auth =>
        delegate.contestTypeRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: contestTypeRetrieveResponses[F] = new contestTypeRetrieveResponses[F] {
      def resp200(value: ContestTypeDetail): F[Response[F]] = Ok(value)
    }
  }
  object superContestEffectList {
    import ContestsApiDelegate.superContestEffectListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "super-contest-effect" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.superContestEffectList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "super-contest-effect" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.superContestEffectList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: superContestEffectListResponses[F] = new superContestEffectListResponses[F] {
      def resp200(value: PaginatedSuperContestEffectSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object superContestEffectRetrieve {
    import ContestsApiDelegate.superContestEffectRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "super-contest-effect" / id) as auth =>
        delegate.superContestEffectRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "super-contest-effect" / id) as auth =>
        delegate.superContestEffectRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: superContestEffectRetrieveResponses[F] = new superContestEffectRetrieveResponses[F] {
      def resp200(value: SuperContestEffectDetail): F[Response[F]] = Ok(value)
    }
  }

  val routesbasicAuth =
    contestEffectList.routebasicAuth <+>
    contestEffectRetrieve.routebasicAuth <+>
    contestTypeList.routebasicAuth <+>
    contestTypeRetrieve.routebasicAuth <+>
    superContestEffectList.routebasicAuth <+>
    superContestEffectRetrieve.routebasicAuth
  val routescookieAuth =
    contestEffectList.routecookieAuth <+>
    contestEffectRetrieve.routecookieAuth <+>
    contestTypeList.routecookieAuth <+>
    contestTypeRetrieve.routecookieAuth <+>
    superContestEffectList.routecookieAuth <+>
    superContestEffectRetrieve.routecookieAuth
}

object ContestsApiDelegate {
  trait contestEffectListResponses[F[_]] {
    def resp200(value: PaginatedContestEffectSummaryList): F[Response[F]]
  }

  trait contestEffectRetrieveResponses[F[_]] {
    def resp200(value: ContestEffectDetail): F[Response[F]]
  }

  trait contestTypeListResponses[F[_]] {
    def resp200(value: PaginatedContestTypeSummaryList): F[Response[F]]
  }

  trait contestTypeRetrieveResponses[F[_]] {
    def resp200(value: ContestTypeDetail): F[Response[F]]
  }

  trait superContestEffectListResponses[F[_]] {
    def resp200(value: PaginatedSuperContestEffectSummaryList): F[Response[F]]
  }

  trait superContestEffectRetrieveResponses[F[_]] {
    def resp200(value: SuperContestEffectDetail): F[Response[F]]
  }

}

trait ContestsApiDelegate[F[_], basicAuth, cookieAuth] {

  trait contestEffectList {
    import ContestsApiDelegate.contestEffectListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: contestEffectListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: contestEffectListResponses[F]
    ): F[Response[F]]

  }
  def contestEffectList: contestEffectList


  trait contestEffectRetrieve {
    import ContestsApiDelegate.contestEffectRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: contestEffectRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: contestEffectRetrieveResponses[F]
    ): F[Response[F]]

  }
  def contestEffectRetrieve: contestEffectRetrieve


  trait contestTypeList {
    import ContestsApiDelegate.contestTypeListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: contestTypeListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: contestTypeListResponses[F]
    ): F[Response[F]]

  }
  def contestTypeList: contestTypeList


  trait contestTypeRetrieve {
    import ContestsApiDelegate.contestTypeRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: contestTypeRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: contestTypeRetrieveResponses[F]
    ): F[Response[F]]

  }
  def contestTypeRetrieve: contestTypeRetrieve


  trait superContestEffectList {
    import ContestsApiDelegate.superContestEffectListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: superContestEffectListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: superContestEffectListResponses[F]
    ): F[Response[F]]

  }
  def superContestEffectList: superContestEffectList


  trait superContestEffectRetrieve {
    import ContestsApiDelegate.superContestEffectRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: superContestEffectRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: superContestEffectRetrieveResponses[F]
    ): F[Response[F]]

  }
  def superContestEffectRetrieve: superContestEffectRetrieve

}