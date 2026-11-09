package org.openapitools.server.api.model

import org.openapitools.server.api.model.EncounterConditionValueSummary
import org.openapitools.server.api.model.EncounterMethodSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonEncounterDetailResponse(
    /** Percent chance that this encounter will occur. */
    val chance: kotlin.Int,
    /** A list of condition values that must be in effect for this encounter to occur. */
    val conditionValues: kotlin.collections.List<EncounterConditionValueSummary>,
    /** The highest level the Pokémon could be encountered at. */
    val maxLevel: kotlin.Int,
    /** The method by which this encounter happens. */
    val method: EncounterMethodSummary,
    /** The lowest level the Pokémon could be encountered at. */
    val minLevel: kotlin.Int
)
