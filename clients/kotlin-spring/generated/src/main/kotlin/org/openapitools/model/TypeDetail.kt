package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GenerationSummary
import org.openapitools.model.MoveDamageClassSummary
import org.openapitools.model.MoveSummary
import org.openapitools.model.TypeGameIndex
import org.openapitools.model.TypeGameSprite
import org.openapitools.model.TypeName
import org.openapitools.model.TypePastRelationships
import org.openapitools.model.TypePokemon
import org.openapitools.model.TypeRelationships
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
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param damageRelations A detail of how effective this type is toward others and vice versa.
 * @param pastDamageRelations A list of details of how effective this type was toward others and vice versa in previous generations
 * @param gameIndices A list of game indices relevent to this item by generation.
 * @param generation The generation this type was introduced in.
 * @param moveDamageClass The class of damage inflicted by this type.
 * @param names The name of this resource listed in different languages.
 * @param pokemon A list of details of Pokémon that have this type.
 * @param moves A list of moves that have this type.
 * @param sprites Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
 */
data class TypeDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A detail of how effective this type is toward others and vice versa.")
    @param:JsonProperty("damage_relations", required = true)
    @get:JsonProperty("damage_relations", required = true) val damageRelations: TypeRelationships,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of details of how effective this type was toward others and vice versa in previous generations")
    @param:JsonProperty("past_damage_relations", required = true)
    @get:JsonProperty("past_damage_relations", required = true) val pastDamageRelations: kotlin.collections.List<TypePastRelationships>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of game indices relevent to this item by generation.")
    @param:JsonProperty("game_indices", required = true)
    @get:JsonProperty("game_indices", required = true) val gameIndices: kotlin.collections.List<TypeGameIndex>,

    @field:Valid
    @Schema(required = true, description = "The generation this type was introduced in.")
    @param:JsonProperty("generation", required = true)
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(required = true, description = "The class of damage inflicted by this type.")
    @param:JsonProperty("move_damage_class", required = true)
    @get:JsonProperty("move_damage_class", required = true) val moveDamageClass: MoveDamageClassSummary?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<TypeName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of details of Pokémon that have this type.")
    @param:JsonProperty("pokemon", required = true)
    @get:JsonProperty("pokemon", required = true) val pokemon: kotlin.collections.List<TypePokemon>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of moves that have this type.")
    @param:JsonProperty("moves", required = true)
    @get:JsonProperty("moves", required = true) val moves: kotlin.collections.List<MoveSummary>,

    @Schema(required = true, readOnly = true, description = "Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.")
    @param:JsonProperty("sprites", required = true)
    @get:JsonProperty("sprites", required = true) val sprites: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, TypeGameSprite>>
) {

}

