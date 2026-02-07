package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param rate 
 * @param version 
 */
case class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner(rate: Int,
                version: AbilityDetailPokemonInnerPokemon
                )

object LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner {
    /**
     * Creates the codec for converting LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner from and to JSON.
     */
    implicit val decoder: Decoder[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner] = deriveEncoder
}
