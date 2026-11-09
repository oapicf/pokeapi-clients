package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenerationSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemGameIndex(
    /** The internal id of an API resource within game data. */
    val gameIndex: kotlin.Int,
    /** The generation relevent to this game index. */
    val generation: GenerationSummary
)
