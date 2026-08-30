package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.PokedexDescription
import org.openapitools.server.api.model.PokedexDetailPokemonEntriesInner
import org.openapitools.server.api.model.PokedexName
import org.openapitools.server.api.model.RegionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokedexDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val descriptions: kotlin.collections.List<PokedexDescription>,
    val names: kotlin.collections.List<PokedexName>,
    val pokemonEntries: kotlin.collections.List<PokedexDetailPokemonEntriesInner>,
    val region: RegionSummary,
    val versionGroups: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val isMainSeries: kotlin.Boolean? = null
)
