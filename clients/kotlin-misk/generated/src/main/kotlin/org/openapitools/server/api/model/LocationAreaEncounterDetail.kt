package org.openapitools.server.api.model

import org.openapitools.server.api.model.EncounterConditionValueSummary
import org.openapitools.server.api.model.EncounterMethodSummary
import org.openapitools.server.api.model.EncounterPokemonDetail
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationAreaEncounterDetail(
    /** The lowest level the Pokémon could be encountered at. */
    val minLevel: kotlin.Int,
    /** The highest level the Pokémon could be encountered at. */
    val maxLevel: kotlin.Int,
    /** A list of condition values that must be in effect for this encounter to occur. */
    val conditionValues: kotlin.collections.List<EncounterConditionValueSummary>,
    /** Additional properties of the encountered Pokémon, or null if unspecified. */
    val pokemonDetails: EncounterPokemonDetail,
    /** Percent chance that this encounter will occur. */
    val chance: kotlin.Int? = 0,
    /** The method by which this encounter happens. */
    val method: EncounterMethodSummary? = null
)
