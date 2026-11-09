package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TypeSummary
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param noDamageTo A list of types this type has no effect on.
 * @param halfDamageTo A list of types this type is not very effect against.
 * @param doubleDamageTo A list of types this type is very effect against.
 * @param noDamageFrom A list of types that have no effect on this type.
 * @param halfDamageFrom A list of types that are not very effective against this type.
 * @param doubleDamageFrom A list of types that are very effective against this type.
 */
data class TypeRelationships(

    @field:Valid
    @Schema(required = true, description = "A list of types this type has no effect on.")
    @param:JsonProperty("no_damage_to", required = true)
    @get:JsonProperty("no_damage_to", required = true) val noDamageTo: kotlin.collections.List<TypeSummary>,

    @field:Valid
    @Schema(required = true, description = "A list of types this type is not very effect against.")
    @param:JsonProperty("half_damage_to", required = true)
    @get:JsonProperty("half_damage_to", required = true) val halfDamageTo: kotlin.collections.List<TypeSummary>,

    @field:Valid
    @Schema(required = true, description = "A list of types this type is very effect against.")
    @param:JsonProperty("double_damage_to", required = true)
    @get:JsonProperty("double_damage_to", required = true) val doubleDamageTo: kotlin.collections.List<TypeSummary>,

    @field:Valid
    @Schema(required = true, description = "A list of types that have no effect on this type.")
    @param:JsonProperty("no_damage_from", required = true)
    @get:JsonProperty("no_damage_from", required = true) val noDamageFrom: kotlin.collections.List<TypeSummary>,

    @field:Valid
    @Schema(required = true, description = "A list of types that are not very effective against this type.")
    @param:JsonProperty("half_damage_from", required = true)
    @get:JsonProperty("half_damage_from", required = true) val halfDamageFrom: kotlin.collections.List<TypeSummary>,

    @field:Valid
    @Schema(required = true, description = "A list of types that are very effective against this type.")
    @param:JsonProperty("double_damage_from", required = true)
    @get:JsonProperty("double_damage_from", required = true) val doubleDamageFrom: kotlin.collections.List<TypeSummary>
) {

}

