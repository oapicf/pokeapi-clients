@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TypePastRelationships(
    @field:JsonProperty("generation")
    val generation: GenerationSummary,

    @field:JsonProperty("damage_relations")
    val damageRelations: TypeRelationships,

)
