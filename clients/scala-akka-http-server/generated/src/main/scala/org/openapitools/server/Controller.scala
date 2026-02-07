package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.BerriesApi
import org.openapitools.server.api.ContestsApi
import org.openapitools.server.api.EncountersApi
import org.openapitools.server.api.EvolutionApi
import org.openapitools.server.api.GamesApi
import org.openapitools.server.api.ItemsApi
import org.openapitools.server.api.LocationApi
import org.openapitools.server.api.MachinesApi
import org.openapitools.server.api.MovesApi
import org.openapitools.server.api.PokemonApi
import org.openapitools.server.api.UtilityApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.Materializer

class Controller(berries: BerriesApi, contests: ContestsApi, encounters: EncountersApi, evolution: EvolutionApi, games: GamesApi, items: ItemsApi, location: LocationApi, machines: MachinesApi, moves: MovesApi, pokemon: PokemonApi, utility: UtilityApi)(implicit system: ActorSystem, materializer: Materializer) {

    lazy val routes: Route = berries.route ~ contests.route ~ encounters.route ~ evolution.route ~ games.route ~ items.route ~ location.route ~ machines.route ~ moves.route ~ pokemon.route ~ utility.route 

    Http().newServerAt("0.0.0.0", 9000).bind(routes)
}
