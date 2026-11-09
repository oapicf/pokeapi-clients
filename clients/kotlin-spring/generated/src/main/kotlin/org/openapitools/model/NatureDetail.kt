package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BerryFlavorSummary
import org.openapitools.model.NatureBattleStylePreference
import org.openapitools.model.NatureName
import org.openapitools.model.NaturePokeathlonStat
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
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param decreasedStat The stat decreased by 10% in Pokémon with this nature.
 * @param increasedStat The stat increased by 10% in Pokémon with this nature.
 * @param likesFlavor The flavor liked by Pokémon with this nature.
 * @param hatesFlavor The flavor hated by Pokémon with this nature.
 * @param pokeathlonStatChanges A list of Pokéathlon stats this nature effects and how much it effects them.
 * @param moveBattleStylePreferences A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
 * @param names The name of this resource listed in different languages.
 */
data class NatureDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The stat decreased by 10% in Pokémon with this nature.")
    @param:JsonProperty("decreased_stat", required = true)
    @get:JsonProperty("decreased_stat", required = true) val decreasedStat: StatSummary?,

    @field:Valid
    @Schema(required = true, description = "The stat increased by 10% in Pokémon with this nature.")
    @param:JsonProperty("increased_stat", required = true)
    @get:JsonProperty("increased_stat", required = true) val increasedStat: StatSummary?,

    @field:Valid
    @Schema(required = true, description = "The flavor liked by Pokémon with this nature.")
    @param:JsonProperty("likes_flavor", required = true)
    @get:JsonProperty("likes_flavor", required = true) val likesFlavor: BerryFlavorSummary?,

    @field:Valid
    @Schema(required = true, description = "The flavor hated by Pokémon with this nature.")
    @param:JsonProperty("hates_flavor", required = true)
    @get:JsonProperty("hates_flavor", required = true) val hatesFlavor: BerryFlavorSummary?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of Pokéathlon stats this nature effects and how much it effects them.")
    @param:JsonProperty("pokeathlon_stat_changes", required = true)
    @get:JsonProperty("pokeathlon_stat_changes", required = true) val pokeathlonStatChanges: kotlin.collections.List<NaturePokeathlonStat>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.")
    @param:JsonProperty("move_battle_style_preferences", required = true)
    @get:JsonProperty("move_battle_style_preferences", required = true) val moveBattleStylePreferences: kotlin.collections.List<NatureBattleStylePreference>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<NatureName>
) {

}

