package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CharacteristicSummary
import org.openapitools.model.ItemSummary
import org.openapitools.model.MoveDamageClassSummary
import org.openapitools.model.StatAffectingMoves
import org.openapitools.model.StatAffectingNatures
import org.openapitools.model.StatName
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
 * @param gameIndex ID the games use for this stat.
 * @param affectingMoves A detail of moves which affect this stat positively or negatively.
 * @param affectingNatures A detail of natures which affect this stat positively or negatively.
 * @param affectingItems Items that affect this stat, such as vitamins and battle items.
 * @param characteristics A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
 * @param moveDamageClass The class of damage this stat is directly related to.
 * @param names The name of this resource listed in different languages.
 * @param isBattleOnly Whether this stat only exists within a battle.
 */
data class StatDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "ID the games use for this stat.")
    @param:JsonProperty("game_index", required = true)
    @get:JsonProperty("game_index", required = true) val gameIndex: kotlin.Int,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A detail of moves which affect this stat positively or negatively.")
    @param:JsonProperty("affecting_moves", required = true)
    @get:JsonProperty("affecting_moves", required = true) val affectingMoves: StatAffectingMoves,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A detail of natures which affect this stat positively or negatively.")
    @param:JsonProperty("affecting_natures", required = true)
    @get:JsonProperty("affecting_natures", required = true) val affectingNatures: StatAffectingNatures,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Items that affect this stat, such as vitamins and battle items.")
    @param:JsonProperty("affecting_items", required = true)
    @get:JsonProperty("affecting_items", required = true) val affectingItems: kotlin.collections.List<ItemSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of characteristics that are set on a Pokémon when its highest base stat is this stat.")
    @param:JsonProperty("characteristics", required = true)
    @get:JsonProperty("characteristics", required = true) val characteristics: kotlin.collections.List<CharacteristicSummary>,

    @field:Valid
    @Schema(required = true, description = "The class of damage this stat is directly related to.")
    @param:JsonProperty("move_damage_class", required = true)
    @get:JsonProperty("move_damage_class", required = true) val moveDamageClass: MoveDamageClassSummary?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<StatName>,

    @Schema(description = "Whether this stat only exists within a battle.")
    @param:JsonProperty("is_battle_only")
    @get:JsonProperty("is_battle_only") val isBattleOnly: kotlin.Boolean? = null
) {

}

