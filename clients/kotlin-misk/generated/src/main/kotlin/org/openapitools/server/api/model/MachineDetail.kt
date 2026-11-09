package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemSummary
import org.openapitools.server.api.model.MoveSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MachineDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The TM or HM item that corresponds to this machine. */
    val item: ItemSummary,
    /** The version group that this machine applies to. */
    val versionGroup: VersionGroupSummary,
    /** The move that is taught by this machine. */
    val move: MoveSummary
)
