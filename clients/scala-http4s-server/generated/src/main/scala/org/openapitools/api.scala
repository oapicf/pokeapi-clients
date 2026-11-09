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
  F[_]: JsonDecoder: Monad
](
)(
  delegateBerriesApi: BerriesApiDelegate[F],
  delegateContestsApi: ContestsApiDelegate[F],
  delegateEncountersApi: EncountersApiDelegate[F],
  delegateEvolutionApi: EvolutionApiDelegate[F],
  delegateGamesApi: GamesApiDelegate[F],
  delegateItemsApi: ItemsApiDelegate[F],
  delegateLocationApi: LocationApiDelegate[F],
  delegateMachinesApi: MachinesApiDelegate[F],
  delegateMovesApi: MovesApiDelegate[F],
  delegatePokemonApi: PokemonApiDelegate[F],
  delegateUtilityApi: UtilityApiDelegate[F],
){

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

  val routes = 
    berriesApiRoutes.routes <+>
      contestsApiRoutes.routes <+>
      encountersApiRoutes.routes <+>
      evolutionApiRoutes.routes <+>
      gamesApiRoutes.routes <+>
      itemsApiRoutes.routes <+>
      locationApiRoutes.routes <+>
      machinesApiRoutes.routes <+>
      movesApiRoutes.routes <+>
      pokemonApiRoutes.routes <+>
      utilityApiRoutes.routes
  

  val routesAll =
    routes
}
