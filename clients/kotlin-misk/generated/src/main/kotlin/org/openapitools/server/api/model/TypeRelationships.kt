package org.openapitools.server.api.model

import org.openapitools.server.api.model.TypeSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypeRelationships(
    /** A list of types this type has no effect on. */
    val noDamageTo: kotlin.collections.List<TypeSummary>,
    /** A list of types this type is not very effect against. */
    val halfDamageTo: kotlin.collections.List<TypeSummary>,
    /** A list of types this type is very effect against. */
    val doubleDamageTo: kotlin.collections.List<TypeSummary>,
    /** A list of types that have no effect on this type. */
    val noDamageFrom: kotlin.collections.List<TypeSummary>,
    /** A list of types that are not very effective against this type. */
    val halfDamageFrom: kotlin.collections.List<TypeSummary>,
    /** A list of types that are very effective against this type. */
    val doubleDamageFrom: kotlin.collections.List<TypeSummary>
)
