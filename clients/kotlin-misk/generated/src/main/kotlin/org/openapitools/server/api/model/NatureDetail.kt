package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFlavorSummary
import org.openapitools.server.api.model.BerrySummary
import org.openapitools.server.api.model.NatureBattleStylePreference
import org.openapitools.server.api.model.NatureDetailPokeathlonStatChangesInner
import org.openapitools.server.api.model.NatureName
import org.openapitools.server.api.model.StatSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NatureDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val decreasedStat: StatSummary,
    val increasedStat: StatSummary,
    val likesFlavor: BerryFlavorSummary,
    val hatesFlavor: BerryFlavorSummary,
    val berries: kotlin.collections.List<BerrySummary>,
    val pokeathlonStatChanges: kotlin.collections.List<NatureDetailPokeathlonStatChangesInner>,
    val moveBattleStylePreferences: kotlin.collections.List<NatureBattleStylePreference>,
    val names: kotlin.collections.List<NatureName>
)
