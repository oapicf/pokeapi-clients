package org.openapitools.server

import com.codahale.metrics.Slf4jReporter
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.http.*
import io.ktor.locations.*
import io.ktor.metrics.dropwizard.*
import java.util.concurrent.TimeUnit
import io.ktor.routing.*
import io.ktor.util.*
import org.openapitools.server.apis.AbilityApi
import org.openapitools.server.apis.BerryApi
import org.openapitools.server.apis.BerryFirmnessApi
import org.openapitools.server.apis.BerryFlavorApi
import org.openapitools.server.apis.CharacteristicApi
import org.openapitools.server.apis.ContestEffectApi
import org.openapitools.server.apis.ContestTypeApi
import org.openapitools.server.apis.EggGroupApi
import org.openapitools.server.apis.EncounterConditionApi
import org.openapitools.server.apis.EncounterConditionValueApi
import org.openapitools.server.apis.EncounterMethodApi
import org.openapitools.server.apis.EvolutionChainApi
import org.openapitools.server.apis.EvolutionTriggerApi
import org.openapitools.server.apis.GenderApi
import org.openapitools.server.apis.GenerationApi
import org.openapitools.server.apis.GrowthRateApi
import org.openapitools.server.apis.ItemApi
import org.openapitools.server.apis.ItemAttributeApi
import org.openapitools.server.apis.ItemCategoryApi
import org.openapitools.server.apis.ItemFlingEffectApi
import org.openapitools.server.apis.ItemPocketApi
import org.openapitools.server.apis.LanguageApi
import org.openapitools.server.apis.LocationApi
import org.openapitools.server.apis.LocationAreaApi
import org.openapitools.server.apis.MachineApi
import org.openapitools.server.apis.MoveApi
import org.openapitools.server.apis.MoveAilmentApi
import org.openapitools.server.apis.MoveBattleStyleApi
import org.openapitools.server.apis.MoveCategoryApi
import org.openapitools.server.apis.MoveDamageClassApi
import org.openapitools.server.apis.MoveLearnMethodApi
import org.openapitools.server.apis.MoveTargetApi
import org.openapitools.server.apis.NatureApi
import org.openapitools.server.apis.PalParkAreaApi
import org.openapitools.server.apis.PokeathlonStatApi
import org.openapitools.server.apis.PokedexApi
import org.openapitools.server.apis.PokemonApi
import org.openapitools.server.apis.PokemonColorApi
import org.openapitools.server.apis.PokemonFormApi
import org.openapitools.server.apis.PokemonHabitatApi
import org.openapitools.server.apis.PokemonShapeApi
import org.openapitools.server.apis.PokemonSpeciesApi
import org.openapitools.server.apis.RegionApi
import org.openapitools.server.apis.StatApi
import org.openapitools.server.apis.SuperContestEffectApi
import org.openapitools.server.apis.TypeApi
import org.openapitools.server.apis.VersionApi
import org.openapitools.server.apis.VersionGroupApi



@KtorExperimentalAPI
@KtorExperimentalLocationsAPI
fun Application.main() {
    install(DefaultHeaders)
    install(DropwizardMetrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
            .outputTo(log)
            .convertRatesTo(TimeUnit.SECONDS)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        register(ContentType.Application.Json, GsonConverter())
    }
    install(AutoHeadResponse) // see https://ktor.io/docs/autoheadresponse.html
    install(Compression, ApplicationCompressionConfiguration()) // see https://ktor.io/docs/compression.html
    install(HSTS, ApplicationHstsConfiguration()) // see https://ktor.io/docs/hsts.html
    install(Locations) // see https://ktor.io/docs/features-locations.html
    install(Routing) {
        AbilityApi()
        BerryApi()
        BerryFirmnessApi()
        BerryFlavorApi()
        CharacteristicApi()
        ContestEffectApi()
        ContestTypeApi()
        EggGroupApi()
        EncounterConditionApi()
        EncounterConditionValueApi()
        EncounterMethodApi()
        EvolutionChainApi()
        EvolutionTriggerApi()
        GenderApi()
        GenerationApi()
        GrowthRateApi()
        ItemApi()
        ItemAttributeApi()
        ItemCategoryApi()
        ItemFlingEffectApi()
        ItemPocketApi()
        LanguageApi()
        LocationApi()
        LocationAreaApi()
        MachineApi()
        MoveApi()
        MoveAilmentApi()
        MoveBattleStyleApi()
        MoveCategoryApi()
        MoveDamageClassApi()
        MoveLearnMethodApi()
        MoveTargetApi()
        NatureApi()
        PalParkAreaApi()
        PokeathlonStatApi()
        PokedexApi()
        PokemonApi()
        PokemonColorApi()
        PokemonFormApi()
        PokemonHabitatApi()
        PokemonShapeApi()
        PokemonSpeciesApi()
        RegionApi()
        StatApi()
        SuperContestEffectApi()
        TypeApi()
        VersionApi()
        VersionGroupApi()
    }

}
