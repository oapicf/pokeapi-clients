package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityName
import org.openapitools.model.GenerationSummary
import org.openapitools.model.MoveDamageClassSummary
import org.openapitools.model.MoveSummary
import org.openapitools.model.TypeDetailDamageRelations
import org.openapitools.model.TypeDetailPastDamageRelationsInner
import org.openapitools.model.TypeDetailPokemonInner
import org.openapitools.model.TypeDetailSpritesValueValue
import org.openapitools.model.TypeGameIndex
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
 * Serializer for the Type resource
 * @param id 
 * @param name 
 * @param damageRelations 
 * @param pastDamageRelations 
 * @param gameIndices 
 * @param generation 
 * @param moveDamageClass 
 * @param names 
 * @param pokemon 
 * @param moves 
 * @param sprites 
 */
data class TypeDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("damage_relations", required = true) val damageRelations: TypeDetailDamageRelations,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("past_damage_relations", required = true) val pastDamageRelations: kotlin.collections.List<TypeDetailPastDamageRelationsInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("game_indices", required = true) val gameIndices: kotlin.collections.List<TypeGameIndex>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("move_damage_class", required = true) val moveDamageClass: MoveDamageClassSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<AbilityName>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pokemon", required = true) val pokemon: kotlin.collections.List<TypeDetailPokemonInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("moves", required = true) val moves: kotlin.collections.List<MoveSummary>,

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("sprites", required = true) val sprites: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, TypeDetailSpritesValueValue>>
) {

}

