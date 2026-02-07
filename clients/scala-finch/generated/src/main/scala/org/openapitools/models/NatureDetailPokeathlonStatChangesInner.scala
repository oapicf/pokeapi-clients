package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param maxUnderscorechange 
 * @param pokeathlonUnderscorestat 
 */
case class NatureDetailPokeathlonStatChangesInner(maxUnderscorechange: Int,
                pokeathlonUnderscorestat: AbilityDetailPokemonInnerPokemon
                )

object NatureDetailPokeathlonStatChangesInner {
    /**
     * Creates the codec for converting NatureDetailPokeathlonStatChangesInner from and to JSON.
     */
    implicit val decoder: Decoder[NatureDetailPokeathlonStatChangesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[NatureDetailPokeathlonStatChangesInner] = deriveEncoder
}
