@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EvolutionVariableDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("symbol")
    val symbol: kotlin.String,

    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<EvolutionVariableName>,

    @field:JsonProperty("descriptions")
    val descriptions: kotlin.collections.List<EvolutionVariableDescription>,

    @field:JsonProperty("data_type")
    val dataType: kotlin.String? = null,

    @field:JsonProperty("source")
    val source: kotlin.String? = null,

)
