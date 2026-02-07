package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails

/**
 * 
 * @param version 
 * @param maxUnderscorechance 
 * @param encounterUnderscoredetails 
 */
case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner(version: AbilityDetailPokemonInnerPokemon,
                maxUnderscorechance: Int,
                encounterUnderscoredetails: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
                )

object LocationAreaDetailPokemonEncountersInnerVersionDetailsInner {
    /**
     * Creates the codec for converting LocationAreaDetailPokemonEncountersInnerVersionDetailsInner from and to JSON.
     */
    implicit val decoder: Decoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner] = deriveEncoder
}
