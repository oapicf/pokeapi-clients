package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param minUnderscorelevel 
 * @param maxUnderscorelevel 
 * @param conditionUnderscorevalues 
 * @param chance 
 * @param method 
 */
case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails(minUnderscorelevel: Int,
                maxUnderscorelevel: Int,
                conditionUnderscorevalues: Option[AbilityDetailPokemonInnerPokemon],
                chance: Int,
                method: AbilityDetailPokemonInnerPokemon
                )

object LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails {
    /**
     * Creates the codec for converting LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails from and to JSON.
     */
    implicit val decoder: Decoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails] = deriveEncoder
}
