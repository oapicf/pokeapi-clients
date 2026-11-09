package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityChange
import org.openapitools.model.AbilityEffectText
import org.openapitools.model.AbilityFlavorText
import org.openapitools.model.AbilityName
import org.openapitools.model.AbilityPokemonDetail
import org.openapitools.model.GenerationSummary
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param generation The generation this ability originated in.
 * @param names The name of this resource listed in different languages.
 * @param effectEntries The effect of this ability listed in different languages.
 * @param effectChanges The list of previous effects this ability has had across version groups.
 * @param flavorTextEntries The flavor text of this ability listed in different languages.
 * @param pokemon A list of Pokémon that could potentially have this ability.
 * @param isMainSeries Whether or not this ability originated in the main series of the video games.
 */
data class AbilityDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The generation this ability originated in.")
    @param:JsonProperty("generation", required = true)
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<AbilityName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The effect of this ability listed in different languages.")
    @param:JsonProperty("effect_entries", required = true)
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<AbilityEffectText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The list of previous effects this ability has had across version groups.")
    @param:JsonProperty("effect_changes", required = true)
    @get:JsonProperty("effect_changes", required = true) val effectChanges: kotlin.collections.List<AbilityChange>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The flavor text of this ability listed in different languages.")
    @param:JsonProperty("flavor_text_entries", required = true)
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<AbilityFlavorText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of Pokémon that could potentially have this ability.")
    @param:JsonProperty("pokemon", required = true)
    @get:JsonProperty("pokemon", required = true) val pokemon: kotlin.collections.List<AbilityPokemonDetail>,

    @Schema(description = "Whether or not this ability originated in the main series of the video games.")
    @param:JsonProperty("is_main_series")
    @get:JsonProperty("is_main_series") val isMainSeries: kotlin.Boolean? = null
) {

}

