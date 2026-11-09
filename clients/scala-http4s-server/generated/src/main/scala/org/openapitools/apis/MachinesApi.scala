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
  F[_]: JsonDecoder: Monad
](delegate: MachinesApiDelegate[F]) extends Http4sDsl[F] {
  object machineList {
    import MachinesApiDelegate.machineListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "machine" :? limitQueryParam(limit) +& offsetQueryParam(offset) =>
        delegate.machineList.handle(req, limit, offset, responses)

    }


    val responses: machineListResponses[F] = new machineListResponses[F] {
      def resp200(value: PaginatedMachineSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object machineRetrieve {
    import MachinesApiDelegate.machineRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "machine" / id =>
        delegate.machineRetrieve.handle(req, id, responses)

    }


    val responses: machineRetrieveResponses[F] = new machineRetrieveResponses[F] {
      def resp200(value: MachineDetail): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    machineList.route <+>
    machineRetrieve.route
}

object MachinesApiDelegate {
  trait machineListResponses[F[_]] {
    def resp200(value: PaginatedMachineSummaryList): F[Response[F]]
  }

  trait machineRetrieveResponses[F[_]] {
    def resp200(value: MachineDetail): F[Response[F]]
  }

}

trait MachinesApiDelegate[F[_]] {

  trait machineList {
    import MachinesApiDelegate.machineListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      responses: machineListResponses[F]
    ): F[Response[F]]

  }
  def machineList: machineList


  trait machineRetrieve {
    import MachinesApiDelegate.machineRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: machineRetrieveResponses[F]
    ): F[Response[F]]

  }
  def machineRetrieve: machineRetrieve

}