@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TypeRelationships(
    @field:JsonProperty("no_damage_to")
    val noDamageTo: kotlin.collections.List<TypeSummary>,

    @field:JsonProperty("half_damage_to")
    val halfDamageTo: kotlin.collections.List<TypeSummary>,

    @field:JsonProperty("double_damage_to")
    val doubleDamageTo: kotlin.collections.List<TypeSummary>,

    @field:JsonProperty("no_damage_from")
    val noDamageFrom: kotlin.collections.List<TypeSummary>,

    @field:JsonProperty("half_damage_from")
    val halfDamageFrom: kotlin.collections.List<TypeSummary>,

    @field:JsonProperty("double_damage_from")
    val doubleDamageFrom: kotlin.collections.List<TypeSummary>,

)
