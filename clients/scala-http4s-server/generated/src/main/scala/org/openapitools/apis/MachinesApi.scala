package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.MachineDetail
import org.openapitools.models.PaginatedMachineSummaryList


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class MachinesApiRoutes[
  F[_]: JsonDecoder: Monad, basicAuth, cookieAuth
](delegate: MachinesApiDelegate[F, basicAuth, cookieAuth]) extends Http4sDsl[F] {
  object machineList {
    import MachinesApiDelegate.machineListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "machine" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.machineList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "machine" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.machineList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: machineListResponses[F] = new machineListResponses[F] {
      def resp200(value: PaginatedMachineSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object machineRetrieve {
    import MachinesApiDelegate.machineRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "machine" / id) as auth =>
        delegate.machineRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "machine" / id) as auth =>
        delegate.machineRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: machineRetrieveResponses[F] = new machineRetrieveResponses[F] {
      def resp200(value: MachineDetail): F[Response[F]] = Ok(value)
    }
  }

  val routesbasicAuth =
    machineList.routebasicAuth <+>
    machineRetrieve.routebasicAuth
  val routescookieAuth =
    machineList.routecookieAuth <+>
    machineRetrieve.routecookieAuth
}

object MachinesApiDelegate {
  trait machineListResponses[F[_]] {
    def resp200(value: PaginatedMachineSummaryList): F[Response[F]]
  }

  trait machineRetrieveResponses[F[_]] {
    def resp200(value: MachineDetail): F[Response[F]]
  }

}

trait MachinesApiDelegate[F[_], basicAuth, cookieAuth] {

  trait machineList {
    import MachinesApiDelegate.machineListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: machineListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: machineListResponses[F]
    ): F[Response[F]]

  }
  def machineList: machineList


  trait machineRetrieve {
    import MachinesApiDelegate.machineRetrieveResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: machineRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: machineRetrieveResponses[F]
    ): F[Response[F]]

  }
  def machineRetrieve: machineRetrieve

}