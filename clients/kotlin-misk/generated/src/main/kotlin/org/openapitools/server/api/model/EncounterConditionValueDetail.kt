package org.openapitools.server.api.model

import org.openapitools.server.api.model.EncounterConditionSummary
import org.openapitools.server.api.model.EncounterConditionValueName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EncounterConditionValueDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The condition this encounter condition value pertains to. */
    val condition: EncounterConditionSummary,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<EncounterConditionValueName>
)
