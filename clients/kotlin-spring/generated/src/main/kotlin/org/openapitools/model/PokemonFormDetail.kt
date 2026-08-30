package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Size(max=30)
    @Schema(required = true, description = "")
    @param:JsonProperty("form_name")
    @get:JsonProperty("form_name", required = true) val formName: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("pokemon")
    @get:JsonProperty("pokemon", required = true) val pokemon: PokemonSummary,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("sprites")
    @get:JsonProperty("sprites", required = true) val sprites: PokemonFormDetailSprites,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("version_group")
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("form_names")
    @get:JsonProperty("form_names", required = true) val formNames: kotlin.collections.List<PokemonFormDetailFormNamesInner>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("names")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<PokemonFormDetailFormNamesInner>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("types")
    @get:JsonProperty("types", required = true) val types: kotlin.collections.List<PokemonDetailTypesInner>,

    @Schema(description = "")
    @param:JsonProperty("order")
    @get:JsonProperty("order") val order: kotlin.Int? = null,

    @Schema(description = "")
    @param:JsonProperty("form_order")
    @get:JsonProperty("form_order") val formOrder: kotlin.Int? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_default")
    @get:JsonProperty("is_default") val isDefault: kotlin.Boolean? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_battle_only")
    @get:JsonProperty("is_battle_only") val isBattleOnly: kotlin.Boolean? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_mega")
    @get:JsonProperty("is_mega") val isMega: kotlin.Boolean? = null
) {

}

