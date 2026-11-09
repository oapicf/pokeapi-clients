package org.openapitools.server.api.model

import org.openapitools.server.api.model.ContestEffectSummary
import org.openapitools.server.api.model.ContestTypeSummary
import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.ItemMachine
import org.openapitools.server.api.model.MoveChange
import org.openapitools.server.api.model.MoveCombos
import org.openapitools.server.api.model.MoveDamageClassSummary
import org.openapitools.server.api.model.MoveEffectChange
import org.openapitools.server.api.model.MoveEffectEffectText
import org.openapitools.server.api.model.MoveFlavorText
import org.openapitools.server.api.model.MoveMeta
import org.openapitools.server.api.model.MoveMetaStatChange
import org.openapitools.server.api.model.MoveName
import org.openapitools.server.api.model.MoveTargetSummary
import org.openapitools.server.api.model.PokemonSummary
import org.openapitools.server.api.model.SuperContestEffectSummary
import org.openapitools.server.api.model.TypeSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The percent value of how likely it is this moves effect will happen. */
    val effectChance: kotlin.Int,
    /** A detail of normal and super contest combos that require this move. */
    val contestCombos: MoveCombos,
    /** The type of appeal this move gives a Pokémon when used in a contest. */
    val contestType: ContestTypeSummary,
    /** The effect the move has when used in a contest. */
    val contestEffect: ContestEffectSummary,
    /** The type of damage the move inflicts on the target, e.g. physical. */
    val damageClass: MoveDamageClassSummary,
    /** The effect of this move listed in different languages. */
    val effectEntries: kotlin.collections.List<MoveEffectEffectText>,
    /** The list of previous effects this move has had across version groups of the games. */
    val effectChanges: kotlin.collections.List<MoveEffectChange>,
    /** The generation in which this move was introduced. */
    val generation: GenerationSummary,
    /** Metadata about this move */
    val meta: MoveMeta,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<MoveName>,
    /** A list of move resource value changes across version groups of the game. */
    val pastValues: kotlin.collections.List<MoveChange>,
    /** A list of stats this moves effects and how much it effects them. */
    val statChanges: kotlin.collections.List<MoveMetaStatChange>,
    /** The effect the move has when used in a super contest. */
    val superContestEffect: SuperContestEffectSummary,
    /** The type of target that will receive the effects of the attack. */
    val target: MoveTargetSummary,
    /** The elemental type of this move. */
    val type: TypeSummary,
    /** A list of the machines that teach this move. */
    val machines: kotlin.collections.List<ItemMachine>,
    /** The flavor text of this move listed in different languages. */
    val flavorTextEntries: kotlin.collections.List<MoveFlavorText>,
    /** List of Pokemon that can learn the move */
    val learnedByPokemon: kotlin.collections.List<PokemonSummary>,
    /** The percent value of how likely this move is to be successful. */
    val accuracy: kotlin.Int? = null,
    /** Power points. The number of times this move can be used. */
    val pp: kotlin.Int? = null,
    /** A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. */
    val priority: kotlin.Int? = null,
    /** The base power of this move, or null if it has no fixed base power. */
    val power: kotlin.Int? = null
)
