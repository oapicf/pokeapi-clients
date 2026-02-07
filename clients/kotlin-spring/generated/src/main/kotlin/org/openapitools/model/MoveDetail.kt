package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.ContestEffectSummary
import org.openapitools.model.ContestTypeSummary
import org.openapitools.model.GenerationSummary
import org.openapitools.model.MoveChange
import org.openapitools.model.MoveChangeEffectEntriesInner
import org.openapitools.model.MoveDamageClassSummary
import org.openapitools.model.MoveDetailContestCombos
import org.openapitools.model.MoveDetailEffectChangesInner
import org.openapitools.model.MoveDetailMachinesInner
import org.openapitools.model.MoveDetailStatChangesInner
import org.openapitools.model.MoveFlavorText
import org.openapitools.model.MoveMeta
import org.openapitools.model.MoveName
import org.openapitools.model.MoveTargetSummary
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
 * @param id 
 * @param name 
 * @param effectChance 
 * @param contestCombos 
 * @param contestType 
 * @param contestEffect 
 * @param damageClass 
 * @param effectEntries 
 * @param effectChanges 
 * @param generation 
 * @param meta 
 * @param names 
 * @param pastValues 
 * @param statChanges 
 * @param superContestEffect 
 * @param target 
 * @param type 
 * @param machines 
 * @param flavorTextEntries 
 * @param learnedByPokemon 
 * @param accuracy 
 * @param pp 
 * @param priority 
 * @param power 
 */
data class MoveDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effect_chance", required = true) val effectChance: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("contest_combos", required = true) val contestCombos: MoveDetailContestCombos,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("contest_type", required = true) val contestType: ContestTypeSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("contest_effect", required = true) val contestEffect: ContestEffectSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("damage_class", required = true) val damageClass: MoveDamageClassSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<MoveChangeEffectEntriesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effect_changes", required = true) val effectChanges: kotlin.collections.List<MoveDetailEffectChangesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("meta", required = true) val meta: MoveMeta,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<MoveName>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("past_values", required = true) val pastValues: kotlin.collections.List<MoveChange>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("stat_changes", required = true) val statChanges: kotlin.collections.List<MoveDetailStatChangesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("super_contest_effect", required = true) val superContestEffect: SuperContestEffectSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("target", required = true) val target: MoveTargetSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: TypeSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("machines", required = true) val machines: kotlin.collections.List<MoveDetailMachinesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<MoveFlavorText>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("learned_by_pokemon", required = true) val learnedByPokemon: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accuracy") val accuracy: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pp") val pp: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("priority") val priority: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("power") val power: kotlin.Int? = null
) {

}

