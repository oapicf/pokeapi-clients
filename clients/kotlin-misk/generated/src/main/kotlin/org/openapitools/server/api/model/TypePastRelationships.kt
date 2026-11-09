package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.TypeRelationships
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypePastRelationships(
    /** The last generation in which the referenced type had the listed damage relations */
    val generation: GenerationSummary,
    /** The damage relations the referenced type had up to and including the listed generation */
    val damageRelations: TypeRelationships
)
