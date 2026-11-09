package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ContestEffectSummary;
import org.openapitools.model.ContestTypeSummary;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.ItemMachine;
import org.openapitools.model.MoveChange;
import org.openapitools.model.MoveCombos;
import org.openapitools.model.MoveDamageClassSummary;
import org.openapitools.model.MoveEffectChange;
import org.openapitools.model.MoveEffectEffectText;
import org.openapitools.model.MoveFlavorText;
import org.openapitools.model.MoveMeta;
import org.openapitools.model.MoveMetaStatChange;
import org.openapitools.model.MoveName;
import org.openapitools.model.MoveTargetSummary;
import org.openapitools.model.PokemonSummary;
import org.openapitools.model.SuperContestEffectSummary;
import org.openapitools.model.TypeSummary;

@Canonical
class MoveDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The percent value of how likely this move is to be successful. */
    Integer accuracy
    /* The percent value of how likely it is this moves effect will happen. */
    Integer effectChance
    /* Power points. The number of times this move can be used. */
    Integer pp
    /* A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. */
    Integer priority
    /* The base power of this move, or null if it has no fixed base power. */
    Integer power
    /* A detail of normal and super contest combos that require this move. */
    MoveCombos contestCombos
    /* The type of appeal this move gives a Pokémon when used in a contest. */
    ContestTypeSummary contestType
    /* The effect the move has when used in a contest. */
    ContestEffectSummary contestEffect
    /* The type of damage the move inflicts on the target, e.g. physical. */
    MoveDamageClassSummary damageClass
    /* The effect of this move listed in different languages. */
    List<MoveEffectEffectText> effectEntries = new ArrayList<>()
    /* The list of previous effects this move has had across version groups of the games. */
    List<MoveEffectChange> effectChanges = new ArrayList<>()
    /* The generation in which this move was introduced. */
    GenerationSummary generation
    /* Metadata about this move */
    MoveMeta meta
    /* The name of this resource listed in different languages. */
    List<MoveName> names = new ArrayList<>()
    /* A list of move resource value changes across version groups of the game. */
    List<MoveChange> pastValues = new ArrayList<>()
    /* A list of stats this moves effects and how much it effects them. */
    List<MoveMetaStatChange> statChanges = new ArrayList<>()
    /* The effect the move has when used in a super contest. */
    SuperContestEffectSummary superContestEffect
    /* The type of target that will receive the effects of the attack. */
    MoveTargetSummary target
    /* The elemental type of this move. */
    TypeSummary type
    /* A list of the machines that teach this move. */
    List<ItemMachine> machines = new ArrayList<>()
    /* The flavor text of this move listed in different languages. */
    List<MoveFlavorText> flavorTextEntries = new ArrayList<>()
    /* List of Pokemon that can learn the move */
    List<PokemonSummary> learnedByPokemon = new ArrayList<>()
}
