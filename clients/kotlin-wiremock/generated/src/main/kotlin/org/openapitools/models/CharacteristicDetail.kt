@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CharacteristicDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("gene_modulo")
    val geneModulo: kotlin.Int,

    @field:JsonProperty("possible_values")
    val possibleValues: kotlin.collections.List<kotlin.Int>,

    @field:JsonProperty("highest_stat")
    val highestStat: StatSummary,

    @field:JsonProperty("descriptions")
    val descriptions: kotlin.collections.List<CharacteristicDescription>,

)
