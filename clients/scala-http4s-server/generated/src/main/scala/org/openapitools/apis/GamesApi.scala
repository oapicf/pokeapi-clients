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
  F[_]: JsonDecoder: Monad, basicAuth, cookieAuth
](delegate: GamesApiDelegate[F, basicAuth, cookieAuth]) extends Http4sDsl[F] {
  object generationList {
    import GamesApiDelegate.generationListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "generation" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.generationList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "generation" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.generationList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: generationListResponses[F] = new generationListResponses[F] {
      def resp200(value: PaginatedGenerationSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object generationRetrieve {
    import GamesApiDelegate.generationRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "generation" / id) as auth =>
        delegate.generationRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "generation" / id) as auth =>
        delegate.generationRetrieve.handle_cookieAuth(auth, req, id, responses)

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

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "pokedex" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.pokedexList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "pokedex" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.pokedexList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: pokedexListResponses[F] = new pokedexListResponses[F] {
      def resp200(value: PaginatedPokedexSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object pokedexRetrieve {
    import GamesApiDelegate.pokedexRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "pokedex" / id) as auth =>
        delegate.pokedexRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "pokedex" / id) as auth =>
        delegate.pokedexRetrieve.handle_cookieAuth(auth, req, id, responses)

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

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "version-group" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.versionGroupList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "version-group" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.versionGroupList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: versionGroupListResponses[F] = new versionGroupListResponses[F] {
      def resp200(value: PaginatedVersionGroupSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object versionGroupRetrieve {
    import GamesApiDelegate.versionGroupRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "version-group" / id) as auth =>
        delegate.versionGroupRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "version-group" / id) as auth =>
        delegate.versionGroupRetrieve.handle_cookieAuth(auth, req, id, responses)

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

    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "version" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.versionList.handle_basicAuth(auth, req, limit, offset, q, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "version" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q)) as auth =>
        delegate.versionList.handle_cookieAuth(auth, req, limit, offset, q, responses)

    }

    val responses: versionListResponses[F] = new versionListResponses[F] {
      def resp200(value: PaginatedVersionSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object versionRetrieve {
    import GamesApiDelegate.versionRetrieveResponses


    val routebasicAuth = AuthedRoutes.of[basicAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "version" / id) as auth =>
        delegate.versionRetrieve.handle_basicAuth(auth, req, id, responses)

    }
    val routecookieAuth = AuthedRoutes.of[cookieAuth, F] {
      case (req @ GET -> Root / "api" / "v2" / "version" / id) as auth =>
        delegate.versionRetrieve.handle_cookieAuth(auth, req, id, responses)

    }

    val responses: versionRetrieveResponses[F] = new versionRetrieveResponses[F] {
      def resp200(value: VersionDetail): F[Response[F]] = Ok(value)
    }
  }

  val routesbasicAuth =
    generationList.routebasicAuth <+>
    generationRetrieve.routebasicAuth <+>
    pokedexList.routebasicAuth <+>
    pokedexRetrieve.routebasicAuth <+>
    versionGroupList.routebasicAuth <+>
    versionGroupRetrieve.routebasicAuth <+>
    versionList.routebasicAuth <+>
    versionRetrieve.routebasicAuth
  val routescookieAuth =
    generationList.routecookieAuth <+>
    generationRetrieve.routecookieAuth <+>
    pokedexList.routecookieAuth <+>
    pokedexRetrieve.routecookieAuth <+>
    versionGroupList.routecookieAuth <+>
    versionGroupRetrieve.routecookieAuth <+>
    versionList.routecookieAuth <+>
    versionRetrieve.routecookieAuth
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

trait GamesApiDelegate[F[_], basicAuth, cookieAuth] {

  trait generationList {
    import GamesApiDelegate.generationListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: generationListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: generationRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: generationRetrieveResponses[F]
    ): F[Response[F]]

  }
  def generationRetrieve: generationRetrieve


  trait pokedexList {
    import GamesApiDelegate.pokedexListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: pokedexListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: pokedexRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: pokedexRetrieveResponses[F]
    ): F[Response[F]]

  }
  def pokedexRetrieve: pokedexRetrieve


  trait versionGroupList {
    import GamesApiDelegate.versionGroupListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: versionGroupListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: versionGroupRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: versionGroupRetrieveResponses[F]
    ): F[Response[F]]

  }
  def versionGroupRetrieve: versionGroupRetrieve


  trait versionList {
    import GamesApiDelegate.versionListResponses


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: versionListResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
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


    def handle_basicAuth(
      auth: basicAuth,
      req: Request[F],
      id: String,
      responses: versionRetrieveResponses[F]
    ): F[Response[F]]

    def handle_cookieAuth(
      auth: cookieAuth,
      req: Request[F],
      id: String,
      responses: versionRetrieveResponses[F]
    ): F[Response[F]]

  }
  def versionRetrieve: versionRetrieve

}