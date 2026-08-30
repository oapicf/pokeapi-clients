package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.EvolutionChainDetail
import org.openapitools.models.EvolutionTriggerDetail
import org.openapitools.models.PaginatedEvolutionChainSummaryList
import org.openapitools.models.PaginatedEvolutionTriggerSummaryList


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class EvolutionApiRoutes[
  F[_]: JsonDecoder: Monad, basicAuth, cookieAuth
](delegate: EvolutionApiDelegate[F, basicAuth, cookieAuth]) extends Http4sDsl[F] {
  object evolutionChainList {
    import EvolutionApiDelegate.evolutionChainListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "evolution-chain" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.evolutionChainList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "evolution-chain" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.evolutionChainList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: evolutionChainListResponses[F] = new evolutionChainListResponses[F] {
      def resp200(value: PaginatedEvolutionChainSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object evolutionChainRetrieve {
    import EvolutionApiDelegate.evolutionChainRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "evolution-chain" / id) as auth =>
        delegate.evolutionChainRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "evolution-chain" / id) as auth =>
        delegate.evolutionChainRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: evolutionChainRetrieveResponses[F] = new evolutionChainRetrieveResponses[F] {
      def resp200(value: EvolutionChainDetail): F[Response[F]] = Ok(value)
    }
  }
  object evolutionTriggerList {
    import EvolutionApiDelegate.evolutionTriggerListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "evolution-trigger" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.evolutionTriggerList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "evolution-trigger" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.evolutionTriggerList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: evolutionTriggerListResponses[F] = new evolutionTriggerListResponses[F] {
      def resp200(value: PaginatedEvolutionTriggerSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object evolutionTriggerRetrieve {
    import EvolutionApiDelegate.evolutionTriggerRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "evolution-trigger" / id) as auth =>
        delegate.evolutionTriggerRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "evolution-trigger" / id) as auth =>
        delegate.evolutionTriggerRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: evolutionTriggerRetrieveResponses[F] = new evolutionTriggerRetrieveResponses[F] {
      def resp200(value: EvolutionTriggerDetail): F[Response[F]] = Ok(value)
    }
  }

  val routesbasicAuth =
    evolutionChainList.routebasicAuth <+>
    evolutionChainRetrieve.routebasicAuth <+>
    evolutionTriggerList.routebasicAuth <+>
    evolutionTriggerRetrieve.routebasicAuth
  val routescookieAuth =
    evolutionChainList.routecookieAuth <+>
    evolutionChainRetrieve.routecookieAuth <+>
    evolutionTriggerList.routecookieAuth <+>
    evolutionTriggerRetrieve.routecookieAuth
}

object EvolutionApiDelegate {
  trait evolutionChainListResponses[F[_]] {
    def resp200(value: PaginatedEvolutionChainSummaryList): F[Response[F]]
  }

  trait evolutionChainRetrieveResponses[F[_]] {
    def resp200(value: EvolutionChainDetail): F[Response[F]]
  }

  trait evolutionTriggerListResponses[F[_]] {
    def resp200(value: PaginatedEvolutionTriggerSummaryList): F[Response[F]]
  }

  trait evolutionTriggerRetrieveResponses[F[_]] {
    def resp200(value: EvolutionTriggerDetail): F[Response[F]]
  }

}

trait EvolutionApiDelegate[F[_], basicAuth, cookieAuth] {

  trait evolutionChainList {
    import EvolutionApiDelegate.evolutionChainListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: evolutionChainListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: evolutionChainListResponses[F]
    ): F[Response[F]]

  }
  def evolutionChainList: evolutionChainList


  trait evolutionChainRetrieve {
    import EvolutionApiDelegate.evolutionChainRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: evolutionChainRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: evolutionChainRetrieveResponses[F]
    ): F[Response[F]]

  }
  def evolutionChainRetrieve: evolutionChainRetrieve


  trait evolutionTriggerList {
    import EvolutionApiDelegate.evolutionTriggerListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: evolutionTriggerListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: evolutionTriggerListResponses[F]
    ): F[Response[F]]

  }
  def evolutionTriggerList: evolutionTriggerList


  trait evolutionTriggerRetrieve {
    import EvolutionApiDelegate.evolutionTriggerRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: evolutionTriggerRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: evolutionTriggerRetrieveResponses[F]
    ): F[Response[F]]

  }
  def evolutionTriggerRetrieve: evolutionTriggerRetrieve

}