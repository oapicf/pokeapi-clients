package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param encounterUnderscoremethod 
 * @param versionUnderscoredetails 
 */
case class LocationAreaDetailEncounterMethodRatesInner(encounterUnderscoremethod: AbilityDetailPokemonInnerPokemon,
                versionUnderscoredetails: Seq[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]
                )

object LocationAreaDetailEncounterMethodRatesInner {
    /**
     * Creates the codec for converting LocationAreaDetailEncounterMethodRatesInner from and to JSON.
     */
    implicit val decoder: Decoder[LocationAreaDetailEncounterMethodRatesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationAreaDetailEncounterMethodRatesInner] = deriveEncoder
}
