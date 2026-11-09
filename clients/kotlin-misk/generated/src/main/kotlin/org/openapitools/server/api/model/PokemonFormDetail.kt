package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonFormFlavorText
import org.openapitools.server.api.model.PokemonFormName
import org.openapitools.server.api.model.PokemonFormSprites
import org.openapitools.server.api.model.PokemonFormTriggerCondition
import org.openapitools.server.api.model.PokemonFormType
import org.openapitools.server.api.model.PokemonSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonFormDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The name of this form. */
    val formName: kotlin.String,
    /** The Pokémon that can take on this form. */
    val pokemon: PokemonSummary,
    /** A set of sprites used to depict this Pokémon form in the game. */
    val sprites: PokemonFormSprites,
    /** The version group this Pokémon form was introduced in. */
    val versionGroup: VersionGroupSummary,
    /** The form specific form name of this Pokémon form, or empty if the form does not have a specific name. */
    val formNames: kotlin.collections.List<PokemonFormName>,
    /** The form specific full name of this Pokémon form, or empty if the form does not have a specific name. */
    val names: kotlin.collections.List<PokemonFormName>,
    /** A list of details showing types this Pokémon form has. */
    val types: kotlin.collections.List<PokemonFormType>,
    /** The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. */
    val triggerConditions: kotlin.collections.List<PokemonFormTriggerCondition>,
    /** The flavor text of this form listed in different languages and versions. */
    val flavorTextEntries: kotlin.collections.List<PokemonFormFlavorText>,
    /** The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. */
    val order: kotlin.Int? = null,
    /** The order in which forms should be sorted within a species&#39; forms. */
    val formOrder: kotlin.Int? = null,
    /** True for exactly one form used as the default for each Pokémon. */
    val isDefault: kotlin.Boolean? = null,
    /** Whether or not this form can only happen during battle. */
    val isBattleOnly: kotlin.Boolean? = null,
    /** Whether or not this form requires mega evolution. */
    val isMega: kotlin.Boolean? = null
)
