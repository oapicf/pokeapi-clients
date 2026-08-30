package org.openapitools

import org.http4s.circe._
import cats.Monad
import cats.syntax.all._
import cats.data.OptionT
import cats.data.Kleisli
import org.http4s._
import org.http4s.server._

import org.openapitools.apis._

final case class API [
  F[_]: JsonDecoder: Monad, basicAuth, cookieAuth
](
  basicAuth: Kleisli[OptionT[F, *], Request[F], basicAuth],
  cookieAuth: Kleisli[OptionT[F, *], Request[F], cookieAuth],
)(
  delegateBerriesApi: BerriesApiDelegate[F, basicAuth, cookieAuth],
  delegateContestsApi: ContestsApiDelegate[F, basicAuth, cookieAuth],
  delegateEncountersApi: EncountersApiDelegate[F, basicAuth, cookieAuth],
  delegateEvolutionApi: EvolutionApiDelegate[F, basicAuth, cookieAuth],
  delegateGamesApi: GamesApiDelegate[F, basicAuth, cookieAuth],
  delegateItemsApi: ItemsApiDelegate[F, basicAuth, cookieAuth],
  delegateLocationApi: LocationApiDelegate[F, basicAuth, cookieAuth],
  delegateMachinesApi: MachinesApiDelegate[F, basicAuth, cookieAuth],
  delegateMovesApi: MovesApiDelegate[F, basicAuth, cookieAuth],
  delegatePokemonApi: PokemonApiDelegate[F, basicAuth, cookieAuth],
  delegateUtilityApi: UtilityApiDelegate[F, basicAuth, cookieAuth],
){
  val basicAuthMiddleware = AuthMiddleware.withFallThrough(basicAuth)
  val cookieAuthMiddleware = AuthMiddleware(cookieAuth)

  val berriesApiRoutes = new BerriesApiRoutes(delegateBerriesApi)
  val contestsApiRoutes = new ContestsApiRoutes(delegateContestsApi)
  val encountersApiRoutes = new EncountersApiRoutes(delegateEncountersApi)
  val evolutionApiRoutes = new EvolutionApiRoutes(delegateEvolutionApi)
  val gamesApiRoutes = new GamesApiRoutes(delegateGamesApi)
  val itemsApiRoutes = new ItemsApiRoutes(delegateItemsApi)
  val locationApiRoutes = new LocationApiRoutes(delegateLocationApi)
  val machinesApiRoutes = new MachinesApiRoutes(delegateMachinesApi)
  val movesApiRoutes = new MovesApiRoutes(delegateMovesApi)
  val pokemonApiRoutes = new PokemonApiRoutes(delegatePokemonApi)
  val utilityApiRoutes = new UtilityApiRoutes(delegateUtilityApi)

  val routesbasicAuth = basicAuthMiddleware(
    berriesApiRoutes.routesbasicAuth <+>
      contestsApiRoutes.routesbasicAuth <+>
      encountersApiRoutes.routesbasicAuth <+>
      evolutionApiRoutes.routesbasicAuth <+>
      gamesApiRoutes.routesbasicAuth <+>
      itemsApiRoutes.routesbasicAuth <+>
      locationApiRoutes.routesbasicAuth <+>
      machinesApiRoutes.routesbasicAuth <+>
      movesApiRoutes.routesbasicAuth <+>
      pokemonApiRoutes.routesbasicAuth <+>
      utilityApiRoutes.routesbasicAuth
  )
  val routescookieAuth = cookieAuthMiddleware(
    berriesApiRoutes.routescookieAuth <+>
      contestsApiRoutes.routescookieAuth <+>
      encountersApiRoutes.routescookieAuth <+>
      evolutionApiRoutes.routescookieAuth <+>
      gamesApiRoutes.routescookieAuth <+>
      itemsApiRoutes.routescookieAuth <+>
      locationApiRoutes.routescookieAuth <+>
      machinesApiRoutes.routescookieAuth <+>
      movesApiRoutes.routescookieAuth <+>
      pokemonApiRoutes.routescookieAuth <+>
      utilityApiRoutes.routescookieAuth
  )

  val routesAll =
    routesbasicAuth <+>
    routescookieAuth
}
