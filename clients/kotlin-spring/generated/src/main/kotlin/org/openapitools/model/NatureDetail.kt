package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BerryFlavorSummary
import org.openapitools.model.BerrySummary
import org.openapitools.model.NatureBattleStylePreference
import org.openapitools.model.NatureDetailPokeathlonStatChangesInner
import org.openapitools.model.NatureName
import org.openapitools.model.StatSummary
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
 * @param decreasedStat 
 * @param increasedStat 
 * @param likesFlavor 
 * @param hatesFlavor 
 * @param berries 
 * @param pokeathlonStatChanges 
 * @param moveBattleStylePreferences 
 * @param names 
 */
data class NatureDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("decreased_stat", required = true) val decreasedStat: StatSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("increased_stat", required = true) val increasedStat: StatSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("likes_flavor", required = true) val likesFlavor: BerryFlavorSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("hates_flavor", required = true) val hatesFlavor: BerryFlavorSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("berries", required = true) val berries: kotlin.collections.List<BerrySummary>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pokeathlon_stat_changes", required = true) val pokeathlonStatChanges: kotlin.collections.List<NatureDetailPokeathlonStatChangesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("move_battle_style_preferences", required = true) val moveBattleStylePreferences: kotlin.collections.List<NatureBattleStylePreference>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<NatureName>
) {

}

