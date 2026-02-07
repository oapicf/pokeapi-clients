package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.MoveDetailEffectChangesInnerEffectEntriesInner
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
 * @param effectEntries 
 * @param versionGroup 
 */
data class MoveDetailEffectChangesInner(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<MoveDetailEffectChangesInnerEffectEntriesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("version_group", required = true) val versionGroup: AbilityDetailPokemonInnerPokemon
) {

}

