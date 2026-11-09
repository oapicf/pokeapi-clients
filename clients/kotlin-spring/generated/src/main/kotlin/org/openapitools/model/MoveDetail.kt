package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ContestEffectSummary
import org.openapitools.model.ContestTypeSummary
import org.openapitools.model.GenerationSummary
import org.openapitools.model.ItemMachine
import org.openapitools.model.MoveChange
import org.openapitools.model.MoveCombos
import org.openapitools.model.MoveDamageClassSummary
import org.openapitools.model.MoveEffectChange
import org.openapitools.model.MoveEffectEffectText
import org.openapitools.model.MoveFlavorText
import org.openapitools.model.MoveMeta
import org.openapitools.model.MoveMetaStatChange
import org.openapitools.model.MoveName
import org.openapitools.model.MoveTargetSummary
import org.openapitools.model.PokemonSummary
import org.openapitools.model.SuperContestEffectSummary
import org.openapitools.model.TypeSummary
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
 * @param effectChance The percent value of how likely it is this moves effect will happen.
 * @param contestCombos A detail of normal and super contest combos that require this move.
 * @param contestType The type of appeal this move gives a Pokémon when used in a contest.
 * @param contestEffect The effect the move has when used in a contest.
 * @param damageClass The type of damage the move inflicts on the target, e.g. physical.
 * @param effectEntries The effect of this move listed in different languages.
 * @param effectChanges The list of previous effects this move has had across version groups of the games.
 * @param generation The generation in which this move was introduced.
 * @param meta Metadata about this move
 * @param names The name of this resource listed in different languages.
 * @param pastValues A list of move resource value changes across version groups of the game.
 * @param statChanges A list of stats this moves effects and how much it effects them.
 * @param superContestEffect The effect the move has when used in a super contest.
 * @param target The type of target that will receive the effects of the attack.
 * @param type The elemental type of this move.
 * @param machines A list of the machines that teach this move.
 * @param flavorTextEntries The flavor text of this move listed in different languages.
 * @param learnedByPokemon List of Pokemon that can learn the move
 * @param accuracy The percent value of how likely this move is to be successful.
 * @param pp Power points. The number of times this move can be used.
 * @param priority A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
 * @param power The base power of this move, or null if it has no fixed base power.
 */
data class MoveDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(required = true, description = "The percent value of how likely it is this moves effect will happen.")
    @param:JsonProperty("effect_chance", required = true)
    @get:JsonProperty("effect_chance", required = true) val effectChance: kotlin.Int?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A detail of normal and super contest combos that require this move.")
    @param:JsonProperty("contest_combos", required = true)
    @get:JsonProperty("contest_combos", required = true) val contestCombos: MoveCombos?,

    @field:Valid
    @Schema(required = true, description = "The type of appeal this move gives a Pokémon when used in a contest.")
    @param:JsonProperty("contest_type", required = true)
    @get:JsonProperty("contest_type", required = true) val contestType: ContestTypeSummary?,

    @field:Valid
    @Schema(required = true, description = "The effect the move has when used in a contest.")
    @param:JsonProperty("contest_effect", required = true)
    @get:JsonProperty("contest_effect", required = true) val contestEffect: ContestEffectSummary?,

    @field:Valid
    @Schema(required = true, description = "The type of damage the move inflicts on the target, e.g. physical.")
    @param:JsonProperty("damage_class", required = true)
    @get:JsonProperty("damage_class", required = true) val damageClass: MoveDamageClassSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The effect of this move listed in different languages.")
    @param:JsonProperty("effect_entries", required = true)
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<MoveEffectEffectText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The list of previous effects this move has had across version groups of the games.")
    @param:JsonProperty("effect_changes", required = true)
    @get:JsonProperty("effect_changes", required = true) val effectChanges: kotlin.collections.List<MoveEffectChange>,

    @field:Valid
    @Schema(required = true, description = "The generation in which this move was introduced.")
    @param:JsonProperty("generation", required = true)
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Metadata about this move")
    @param:JsonProperty("meta", required = true)
    @get:JsonProperty("meta", required = true) val meta: MoveMeta?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<MoveName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of move resource value changes across version groups of the game.")
    @param:JsonProperty("past_values", required = true)
    @get:JsonProperty("past_values", required = true) val pastValues: kotlin.collections.List<MoveChange>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of stats this moves effects and how much it effects them.")
    @param:JsonProperty("stat_changes", required = true)
    @get:JsonProperty("stat_changes", required = true) val statChanges: kotlin.collections.List<MoveMetaStatChange>,

    @field:Valid
    @Schema(required = true, description = "The effect the move has when used in a super contest.")
    @param:JsonProperty("super_contest_effect", required = true)
    @get:JsonProperty("super_contest_effect", required = true) val superContestEffect: SuperContestEffectSummary?,

    @field:Valid
    @Schema(required = true, description = "The type of target that will receive the effects of the attack.")
    @param:JsonProperty("target", required = true)
    @get:JsonProperty("target", required = true) val target: MoveTargetSummary,

    @field:Valid
    @Schema(required = true, description = "The elemental type of this move.")
    @param:JsonProperty("type", required = true)
    @get:JsonProperty("type", required = true) val type: TypeSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of the machines that teach this move.")
    @param:JsonProperty("machines", required = true)
    @get:JsonProperty("machines", required = true) val machines: kotlin.collections.List<ItemMachine>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The flavor text of this move listed in different languages.")
    @param:JsonProperty("flavor_text_entries", required = true)
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<MoveFlavorText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "List of Pokemon that can learn the move")
    @param:JsonProperty("learned_by_pokemon", required = true)
    @get:JsonProperty("learned_by_pokemon", required = true) val learnedByPokemon: kotlin.collections.List<PokemonSummary>,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The percent value of how likely this move is to be successful.")
    @param:JsonProperty("accuracy")
    @get:JsonProperty("accuracy") val accuracy: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "Power points. The number of times this move can be used.")
    @param:JsonProperty("pp")
    @get:JsonProperty("pp") val pp: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.")
    @param:JsonProperty("priority")
    @get:JsonProperty("priority") val priority: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The base power of this move, or null if it has no fixed base power.")
    @param:JsonProperty("power")
    @get:JsonProperty("power") val power: kotlin.Int? = null
) {

}

