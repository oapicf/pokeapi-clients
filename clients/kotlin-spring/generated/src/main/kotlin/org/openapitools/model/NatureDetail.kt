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

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("decreased_stat")
    @get:JsonProperty("decreased_stat", required = true) val decreasedStat: StatSummary,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("increased_stat")
    @get:JsonProperty("increased_stat", required = true) val increasedStat: StatSummary,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("likes_flavor")
    @get:JsonProperty("likes_flavor", required = true) val likesFlavor: BerryFlavorSummary,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("hates_flavor")
    @get:JsonProperty("hates_flavor", required = true) val hatesFlavor: BerryFlavorSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("berries")
    @get:JsonProperty("berries", required = true) val berries: kotlin.collections.List<BerrySummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("pokeathlon_stat_changes")
    @get:JsonProperty("pokeathlon_stat_changes", required = true) val pokeathlonStatChanges: kotlin.collections.List<NatureDetailPokeathlonStatChangesInner>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("move_battle_style_preferences")
    @get:JsonProperty("move_battle_style_preferences", required = true) val moveBattleStylePreferences: kotlin.collections.List<NatureBattleStylePreference>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("names")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<NatureName>
) {

}

