package org.openapitools.server

import io.ktor.server.routing.*
import org.openapitools.server.apis.BerriesApi
import org.openapitools.server.apis.ContestsApi
import org.openapitools.server.apis.EncountersApi
import org.openapitools.server.apis.EvolutionApi
import org.openapitools.server.apis.GamesApi
import org.openapitools.server.apis.ItemsApi
import org.openapitools.server.apis.LocationApi
import org.openapitools.server.apis.MachinesApi
import org.openapitools.server.apis.MovesApi
import org.openapitools.server.apis.PokemonApi
import org.openapitools.server.apis.UtilityApi



fun Route.AllApis() {
    BerriesApi()
    ContestsApi()
    EncountersApi()
    EvolutionApi()
    GamesApi()
    ItemsApi()
    LocationApi()
    MachinesApi()
    MovesApi()
    PokemonApi()
    UtilityApi()
}
