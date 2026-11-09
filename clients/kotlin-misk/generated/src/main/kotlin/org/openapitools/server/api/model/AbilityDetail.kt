package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityChange
import org.openapitools.server.api.model.AbilityEffectText
import org.openapitools.server.api.model.AbilityFlavorText
import org.openapitools.server.api.model.AbilityName
import org.openapitools.server.api.model.AbilityPokemonDetail
import org.openapitools.server.api.model.GenerationSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AbilityDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The generation this ability originated in. */
    val generation: GenerationSummary,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<AbilityName>,
    /** The effect of this ability listed in different languages. */
    val effectEntries: kotlin.collections.List<AbilityEffectText>,
    /** The list of previous effects this ability has had across version groups. */
    val effectChanges: kotlin.collections.List<AbilityChange>,
    /** The flavor text of this ability listed in different languages. */
    val flavorTextEntries: kotlin.collections.List<AbilityFlavorText>,
    /** A list of Pokémon that could potentially have this ability. */
    val pokemon: kotlin.collections.List<AbilityPokemonDetail>,
    /** Whether or not this ability originated in the main series of the video games. */
    val isMainSeries: kotlin.Boolean? = null
)
