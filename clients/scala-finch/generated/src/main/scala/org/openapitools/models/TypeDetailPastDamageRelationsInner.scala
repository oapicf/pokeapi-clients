package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.TypeDetailPastDamageRelationsInnerDamageRelations

/**
 * 
 * @param generation 
 * @param damageUnderscorerelations 
 */
case class TypeDetailPastDamageRelationsInner(generation: AbilityDetailPokemonInnerPokemon,
                damageUnderscorerelations: TypeDetailPastDamageRelationsInnerDamageRelations
                )

object TypeDetailPastDamageRelationsInner {
    /**
     * Creates the codec for converting TypeDetailPastDamageRelationsInner from and to JSON.
     */
    implicit val decoder: Decoder[TypeDetailPastDamageRelationsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[TypeDetailPastDamageRelationsInner] = deriveEncoder
}
