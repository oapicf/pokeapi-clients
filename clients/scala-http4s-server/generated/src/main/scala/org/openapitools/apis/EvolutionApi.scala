package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.EvolutionChainDetail
import org.openapitools.models.EvolutionTriggerDetail
import org.openapitools.models.EvolutionVariableDetail
import org.openapitools.models.PaginatedEvolutionChainSummaryList
import org.openapitools.models.PaginatedEvolutionTriggerSummaryList
import org.openapitools.models.PaginatedEvolutionVariableSummaryList


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class EvolutionApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: EvolutionApiDelegate[F]) extends Http4sDsl[F] {
  object evolutionChainList {
    import EvolutionApiDelegate.evolutionChainListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "evolution-chain" :? limitQueryParam(limit) +& offsetQueryParam(offset) =>
        delegate.evolutionChainList.handle(req, limit, offset, responses)

    }


    val responses: evolutionChainListResponses[F] = new evolutionChainListResponses[F] {
      def resp200(value: PaginatedEvolutionChainSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object evolutionChainRetrieve {
    import EvolutionApiDelegate.evolutionChainRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "evolution-chain" / id =>
        delegate.evolutionChainRetrieve.handle(req, id, responses)

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

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "evolution-trigger" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.evolutionTriggerList.handle(req, limit, offset, q, responses)

    }


    val responses: evolutionTriggerListResponses[F] = new evolutionTriggerListResponses[F] {
      def resp200(value: PaginatedEvolutionTriggerSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object evolutionTriggerRetrieve {
    import EvolutionApiDelegate.evolutionTriggerRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "evolution-trigger" / id =>
        delegate.evolutionTriggerRetrieve.handle(req, id, responses)

    }


    val responses: evolutionTriggerRetrieveResponses[F] = new evolutionTriggerRetrieveResponses[F] {
      def resp200(value: EvolutionTriggerDetail): F[Response[F]] = Ok(value)
    }
  }
  object evolutionVariableList {
    import EvolutionApiDelegate.evolutionVariableListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "evolution-variable" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.evolutionVariableList.handle(req, limit, offset, q, responses)

    }


    val responses: evolutionVariableListResponses[F] = new evolutionVariableListResponses[F] {
      def resp200(value: PaginatedEvolutionVariableSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object evolutionVariableRetrieve {
    import EvolutionApiDelegate.evolutionVariableRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "evolution-variable" / id =>
        delegate.evolutionVariableRetrieve.handle(req, id, responses)

    }


    val responses: evolutionVariableRetrieveResponses[F] = new evolutionVariableRetrieveResponses[F] {
      def resp200(value: EvolutionVariableDetail): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    evolutionChainList.route <+>
    evolutionChainRetrieve.route <+>
    evolutionTriggerList.route <+>
    evolutionTriggerRetrieve.route <+>
    evolutionVariableList.route <+>
    evolutionVariableRetrieve.route
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

  trait evolutionVariableListResponses[F[_]] {
    def resp200(value: PaginatedEvolutionVariableSummaryList): F[Response[F]]
  }

  trait evolutionVariableRetrieveResponses[F[_]] {
    def resp200(value: EvolutionVariableDetail): F[Response[F]]
  }

}

trait EvolutionApiDelegate[F[_]] {

  trait evolutionChainList {
    import EvolutionApiDelegate.evolutionChainListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      responses: evolutionChainListResponses[F]
    ): F[Response[F]]

  }
  def evolutionChainList: evolutionChainList


  trait evolutionChainRetrieve {
    import EvolutionApiDelegate.evolutionChainRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: evolutionChainRetrieveResponses[F]
    ): F[Response[F]]

  }
  def evolutionChainRetrieve: evolutionChainRetrieve


  trait evolutionTriggerList {
    import EvolutionApiDelegate.evolutionTriggerListResponses

    def handle(
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

    def handle(
      req: Request[F],
      id: String,
      responses: evolutionTriggerRetrieveResponses[F]
    ): F[Response[F]]

  }
  def evolutionTriggerRetrieve: evolutionTriggerRetrieve


  trait evolutionVariableList {
    import EvolutionApiDelegate.evolutionVariableListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: evolutionVariableListResponses[F]
    ): F[Response[F]]

  }
  def evolutionVariableList: evolutionVariableList


  trait evolutionVariableRetrieve {
    import EvolutionApiDelegate.evolutionVariableRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: evolutionVariableRetrieveResponses[F]
    ): F[Response[F]]

  }
  def evolutionVariableRetrieve: evolutionVariableRetrieve

}