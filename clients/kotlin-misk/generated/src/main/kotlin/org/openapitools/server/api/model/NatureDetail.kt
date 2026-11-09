package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFlavorSummary
import org.openapitools.server.api.model.NatureBattleStylePreference
import org.openapitools.server.api.model.NatureName
import org.openapitools.server.api.model.NaturePokeathlonStat
import org.openapitools.server.api.model.StatSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NatureDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The stat decreased by 10% in Pokémon with this nature. */
    val decreasedStat: StatSummary,
    /** The stat increased by 10% in Pokémon with this nature. */
    val increasedStat: StatSummary,
    /** The flavor liked by Pokémon with this nature. */
    val likesFlavor: BerryFlavorSummary,
    /** The flavor hated by Pokémon with this nature. */
    val hatesFlavor: BerryFlavorSummary,
    /** A list of Pokéathlon stats this nature effects and how much it effects them. */
    val pokeathlonStatChanges: kotlin.collections.List<NaturePokeathlonStat>,
    /** A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. */
    val moveBattleStylePreferences: kotlin.collections.List<NatureBattleStylePreference>,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<NatureName>
)
