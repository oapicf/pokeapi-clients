package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonDetailTypesInner
import org.openapitools.model.PokemonFormDetailFormNamesInner
import org.openapitools.model.PokemonFormDetailSprites
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
 * @param id 
 * @param name 
 * @param formName 
 * @param pokemon 
 * @param sprites 
 * @param versionGroup 
 * @param formNames 
 * @param names 
 * @param types 
 * @param order 
 * @param formOrder 
 * @param isDefault 
 * @param isBattleOnly 
 * @param isMega 
 */
data class PokemonFormDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Size(max=30)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("form_name", required = true) val formName: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pokemon", required = true) val pokemon: PokemonSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sprites", required = true) val sprites: PokemonFormDetailSprites,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("form_names", required = true) val formNames: kotlin.collections.List<PokemonFormDetailFormNamesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<PokemonFormDetailFormNamesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("types", required = true) val types: kotlin.collections.List<PokemonDetailTypesInner>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("order") val order: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("form_order") val formOrder: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("is_default") val isDefault: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("is_battle_only") val isBattleOnly: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("is_mega") val isMega: kotlin.Boolean? = null
) {

}

