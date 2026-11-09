package org.openapitools.server.api.model

import org.openapitools.server.api.model.MachineSummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemMachine(
    /** The machine that teaches a move from an item. */
    val machine: MachineSummary,
    /** The version group of this specific machine. */
    val versionGroup: VersionGroupSummary
)
