package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonDetailAbilitiesInner
import org.openapitools.server.api.model.PokemonDetailCries
import org.openapitools.server.api.model.PokemonDetailHeldItems
import org.openapitools.server.api.model.PokemonDetailMovesInner
import org.openapitools.server.api.model.PokemonDetailPastAbilitiesInner
import org.openapitools.server.api.model.PokemonDetailPastTypesInner
import org.openapitools.server.api.model.PokemonDetailSprites
import org.openapitools.server.api.model.PokemonDetailTypesInner
import org.openapitools.server.api.model.PokemonFormSummary
import org.openapitools.server.api.model.PokemonGameIndex
import org.openapitools.server.api.model.PokemonSpeciesSummary
import org.openapitools.server.api.model.PokemonStat
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val abilities: kotlin.collections.List<PokemonDetailAbilitiesInner>,
    val pastAbilities: kotlin.collections.List<PokemonDetailPastAbilitiesInner>,
    val forms: kotlin.collections.List<PokemonFormSummary>,
    val gameIndices: kotlin.collections.List<PokemonGameIndex>,
    val heldItems: PokemonDetailHeldItems,
    val locationAreaEncounters: kotlin.String,
    val moves: kotlin.collections.List<PokemonDetailMovesInner>,
    val species: PokemonSpeciesSummary,
    val sprites: PokemonDetailSprites,
    val cries: PokemonDetailCries,
    val stats: kotlin.collections.List<PokemonStat>,
    val types: kotlin.collections.List<PokemonDetailTypesInner>,
    val pastTypes: kotlin.collections.List<PokemonDetailPastTypesInner>,
    val baseExperience: kotlin.Int? = null,
    val height: kotlin.Int? = null,
    val isDefault: kotlin.Boolean? = null,
    val order: kotlin.Int? = null,
    val weight: kotlin.Int? = null
)
