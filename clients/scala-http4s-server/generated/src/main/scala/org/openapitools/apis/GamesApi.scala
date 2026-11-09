package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.GenerationDetail
import org.openapitools.models.PaginatedGenerationSummaryList
import org.openapitools.models.PaginatedPokedexSummaryList
import org.openapitools.models.PaginatedVersionGroupSummaryList
import org.openapitools.models.PaginatedVersionSummaryList
import org.openapitools.models.PokedexDetail
import org.openapitools.models.VersionDetail
import org.openapitools.models.VersionGroupDetail


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class GamesApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: GamesApiDelegate[F]) extends Http4sDsl[F] {
  object generationList {
    import GamesApiDelegate.generationListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "generation" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.generationList.handle(req, limit, offset, q, responses)

    }


    val responses: generationListResponses[F] = new generationListResponses[F] {
      def resp200(value: PaginatedGenerationSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object generationRetrieve {
    import GamesApiDelegate.generationRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "generation" / id =>
        delegate.generationRetrieve.handle(req, id, responses)

    }


    val responses: generationRetrieveResponses[F] = new generationRetrieveResponses[F] {
      def resp200(value: GenerationDetail): F[Response[F]] = Ok(value)
    }
  }
  object pokedexList {
    import GamesApiDelegate.pokedexListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokedex" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.pokedexList.handle(req, limit, offset, q, responses)

    }


    val responses: pokedexListResponses[F] = new pokedexListResponses[F] {
      def resp200(value: PaginatedPokedexSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object pokedexRetrieve {
    import GamesApiDelegate.pokedexRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokedex" / id =>
        delegate.pokedexRetrieve.handle(req, id, responses)

    }


    val responses: pokedexRetrieveResponses[F] = new pokedexRetrieveResponses[F] {
      def resp200(value: PokedexDetail): F[Response[F]] = Ok(value)
    }
  }
  object versionGroupList {
    import GamesApiDelegate.versionGroupListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "version-group" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.versionGroupList.handle(req, limit, offset, q, responses)

    }


    val responses: versionGroupListResponses[F] = new versionGroupListResponses[F] {
      def resp200(value: PaginatedVersionGroupSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object versionGroupRetrieve {
    import GamesApiDelegate.versionGroupRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "version-group" / id =>
        delegate.versionGroupRetrieve.handle(req, id, responses)

    }


    val responses: versionGroupRetrieveResponses[F] = new versionGroupRetrieveResponses[F] {
      def resp200(value: VersionGroupDetail): F[Response[F]] = Ok(value)
    }
  }
  object versionList {
    import GamesApiDelegate.versionListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "version" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.versionList.handle(req, limit, offset, q, responses)

    }


    val responses: versionListResponses[F] = new versionListResponses[F] {
      def resp200(value: PaginatedVersionSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object versionRetrieve {
    import GamesApiDelegate.versionRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "version" / id =>
        delegate.versionRetrieve.handle(req, id, responses)

    }


    val responses: versionRetrieveResponses[F] = new versionRetrieveResponses[F] {
      def resp200(value: VersionDetail): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    generationList.route <+>
    generationRetrieve.route <+>
    pokedexList.route <+>
    pokedexRetrieve.route <+>
    versionGroupList.route <+>
    versionGroupRetrieve.route <+>
    versionList.route <+>
    versionRetrieve.route
}

object GamesApiDelegate {
  trait generationListResponses[F[_]] {
    def resp200(value: PaginatedGenerationSummaryList): F[Response[F]]
  }

  trait generationRetrieveResponses[F[_]] {
    def resp200(value: GenerationDetail): F[Response[F]]
  }

  trait pokedexListResponses[F[_]] {
    def resp200(value: PaginatedPokedexSummaryList): F[Response[F]]
  }

  trait pokedexRetrieveResponses[F[_]] {
    def resp200(value: PokedexDetail): F[Response[F]]
  }

  trait versionGroupListResponses[F[_]] {
    def resp200(value: PaginatedVersionGroupSummaryList): F[Response[F]]
  }

  trait versionGroupRetrieveResponses[F[_]] {
    def resp200(value: VersionGroupDetail): F[Response[F]]
  }

  trait versionListResponses[F[_]] {
    def resp200(value: PaginatedVersionSummaryList): F[Response[F]]
  }

  trait versionRetrieveResponses[F[_]] {
    def resp200(value: VersionDetail): F[Response[F]]
  }

}

trait GamesApiDelegate[F[_]] {

  trait generationList {
    import GamesApiDelegate.generationListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: generationListResponses[F]
    ): F[Response[F]]

  }
  def generationList: generationList


  trait generationRetrieve {
    import GamesApiDelegate.generationRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: generationRetrieveResponses[F]
    ): F[Response[F]]

  }
  def generationRetrieve: generationRetrieve


  trait pokedexList {
    import GamesApiDelegate.pokedexListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: pokedexListResponses[F]
    ): F[Response[F]]

  }
  def pokedexList: pokedexList


  trait pokedexRetrieve {
    import GamesApiDelegate.pokedexRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: pokedexRetrieveResponses[F]
    ): F[Response[F]]

  }
  def pokedexRetrieve: pokedexRetrieve


  trait versionGroupList {
    import GamesApiDelegate.versionGroupListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: versionGroupListResponses[F]
    ): F[Response[F]]

  }
  def versionGroupList: versionGroupList


  trait versionGroupRetrieve {
    import GamesApiDelegate.versionGroupRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: versionGroupRetrieveResponses[F]
    ): F[Response[F]]

  }
  def versionGroupRetrieve: versionGroupRetrieve


  trait versionList {
    import GamesApiDelegate.versionListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: versionListResponses[F]
    ): F[Response[F]]

  }
  def versionList: versionList


  trait versionRetrieve {
    import GamesApiDelegate.versionRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: versionRetrieveResponses[F]
    ): F[Response[F]]

  }
  def versionRetrieve: versionRetrieve

}