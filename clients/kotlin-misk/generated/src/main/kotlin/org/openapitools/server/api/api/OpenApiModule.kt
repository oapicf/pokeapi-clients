package org.openapitools.server.api.api

import misk.inject.KAbstractModule
import misk.web.WebActionModule
import jakarta.inject.Singleton
import org.openapitools.server.api.api.BerriesApiAction
import org.openapitools.server.api.api.ContestsApiAction
import org.openapitools.server.api.api.EncountersApiAction
import org.openapitools.server.api.api.EvolutionApiAction
import org.openapitools.server.api.api.GamesApiAction
import org.openapitools.server.api.api.ItemsApiAction
import org.openapitools.server.api.api.LocationApiAction
import org.openapitools.server.api.api.MachinesApiAction
import org.openapitools.server.api.api.MovesApiAction
import org.openapitools.server.api.api.PokemonApiAction
import org.openapitools.server.api.api.UtilityApiAction

@Singleton
class OpenApiModule : KAbstractModule() {
    override fun configure() {
        install(WebActionModule.create<BerriesApiAction>())
        install(WebActionModule.create<ContestsApiAction>())
        install(WebActionModule.create<EncountersApiAction>())
        install(WebActionModule.create<EvolutionApiAction>())
        install(WebActionModule.create<GamesApiAction>())
        install(WebActionModule.create<ItemsApiAction>())
        install(WebActionModule.create<LocationApiAction>())
        install(WebActionModule.create<MachinesApiAction>())
        install(WebActionModule.create<MovesApiAction>())
        install(WebActionModule.create<PokemonApiAction>())
        install(WebActionModule.create<UtilityApiAction>())
    }
}