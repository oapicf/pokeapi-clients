package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonFormFlavorText
import org.openapitools.model.PokemonFormName
import org.openapitools.model.PokemonFormSprites
import org.openapitools.model.PokemonFormTriggerCondition
import org.openapitools.model.PokemonFormType
import org.openapitools.model.PokemonSummary
import org.openapitools.model.VersionGroupSummary
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
 * @param formName The name of this form.
 * @param pokemon The Pokémon that can take on this form.
 * @param sprites A set of sprites used to depict this Pokémon form in the game.
 * @param versionGroup The version group this Pokémon form was introduced in.
 * @param formNames The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
 * @param names The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
 * @param types A list of details showing types this Pokémon form has.
 * @param triggerConditions The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
 * @param flavorTextEntries The flavor text of this form listed in different languages and versions.
 * @param order The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
 * @param formOrder The order in which forms should be sorted within a species' forms.
 * @param isDefault True for exactly one form used as the default for each Pokémon.
 * @param isBattleOnly Whether or not this form can only happen during battle.
 * @param isMega Whether or not this form requires mega evolution.
 */
data class PokemonFormDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Size(max=30)
    @Schema(required = true, description = "The name of this form.")
    @param:JsonProperty("form_name", required = true)
    @get:JsonProperty("form_name", required = true) val formName: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The Pokémon that can take on this form.")
    @param:JsonProperty("pokemon", required = true)
    @get:JsonProperty("pokemon", required = true) val pokemon: PokemonSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A set of sprites used to depict this Pokémon form in the game.")
    @param:JsonProperty("sprites", required = true)
    @get:JsonProperty("sprites", required = true) val sprites: PokemonFormSprites,

    @field:Valid
    @Schema(required = true, description = "The version group this Pokémon form was introduced in.")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The form specific form name of this Pokémon form, or empty if the form does not have a specific name.")
    @param:JsonProperty("form_names", required = true)
    @get:JsonProperty("form_names", required = true) val formNames: kotlin.collections.List<PokemonFormName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The form specific full name of this Pokémon form, or empty if the form does not have a specific name.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<PokemonFormName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of details showing types this Pokémon form has.")
    @param:JsonProperty("types", required = true)
    @get:JsonProperty("types", required = true) val types: kotlin.collections.List<PokemonFormType>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.")
    @param:JsonProperty("trigger_conditions", required = true)
    @get:JsonProperty("trigger_conditions", required = true) val triggerConditions: kotlin.collections.List<PokemonFormTriggerCondition>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The flavor text of this form listed in different languages and versions.")
    @param:JsonProperty("flavor_text_entries", required = true)
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<PokemonFormFlavorText>,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.")
    @param:JsonProperty("order")
    @get:JsonProperty("order") val order: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The order in which forms should be sorted within a species' forms.")
    @param:JsonProperty("form_order")
    @get:JsonProperty("form_order") val formOrder: kotlin.Int? = null,

    @Schema(description = "True for exactly one form used as the default for each Pokémon.")
    @param:JsonProperty("is_default")
    @get:JsonProperty("is_default") val isDefault: kotlin.Boolean? = null,

    @Schema(description = "Whether or not this form can only happen during battle.")
    @param:JsonProperty("is_battle_only")
    @get:JsonProperty("is_battle_only") val isBattleOnly: kotlin.Boolean? = null,

    @Schema(description = "Whether or not this form requires mega evolution.")
    @param:JsonProperty("is_mega")
    @get:JsonProperty("is_mega") val isMega: kotlin.Boolean? = null
) {

}

