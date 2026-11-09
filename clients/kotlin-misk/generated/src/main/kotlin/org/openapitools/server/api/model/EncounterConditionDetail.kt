package org.openapitools.server.api.model

import org.openapitools.server.api.model.EncounterConditionName
import org.openapitools.server.api.model.EncounterConditionValueSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EncounterConditionDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A list of possible values for this encounter condition. */
    val propertyValues: kotlin.collections.List<EncounterConditionValueSummary>,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<EncounterConditionName>
)
