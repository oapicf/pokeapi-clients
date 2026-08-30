package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemSummary
import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MachineDetail(
    val id: kotlin.Int,
    val item: ItemSummary,
    val versionGroup: VersionGroupSummary,
    val move: MoveSummary
)
