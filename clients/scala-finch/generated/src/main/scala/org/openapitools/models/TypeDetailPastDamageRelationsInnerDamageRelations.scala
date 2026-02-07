package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import scala.collection.immutable.Seq

/**
 * 
 * @param noUnderscoredamageUnderscoreto 
 * @param halfUnderscoredamageUnderscoreto 
 * @param doubleUnderscoredamageUnderscoreto 
 * @param noUnderscoredamageUnderscorefrom 
 * @param halfUnderscoredamageUnderscorefrom 
 * @param doubleUnderscoredamageUnderscorefrom 
 */
case class TypeDetailPastDamageRelationsInnerDamageRelations(noUnderscoredamageUnderscoreto: Seq[AbilityDetailPokemonInnerPokemon],
                halfUnderscoredamageUnderscoreto: Seq[AbilityDetailPokemonInnerPokemon],
                doubleUnderscoredamageUnderscoreto: Seq[AbilityDetailPokemonInnerPokemon],
                noUnderscoredamageUnderscorefrom: Seq[AbilityDetailPokemonInnerPokemon],
                halfUnderscoredamageUnderscorefrom: Seq[AbilityDetailPokemonInnerPokemon],
                doubleUnderscoredamageUnderscorefrom: Seq[AbilityDetailPokemonInnerPokemon]
                )

object TypeDetailPastDamageRelationsInnerDamageRelations {
    /**
     * Creates the codec for converting TypeDetailPastDamageRelationsInnerDamageRelations from and to JSON.
     */
    implicit val decoder: Decoder[TypeDetailPastDamageRelationsInnerDamageRelations] = deriveDecoder
    implicit val encoder: ObjectEncoder[TypeDetailPastDamageRelationsInnerDamageRelations] = deriveEncoder
}
