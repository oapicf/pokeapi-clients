package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param pokemon 
 * @param versionUnderscoredetails 
 */
case class LocationAreaDetailPokemonEncountersInner(pokemon: AbilityDetailPokemonInnerPokemon,
                versionUnderscoredetails: Seq[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner]
                )

object LocationAreaDetailPokemonEncountersInner {
    /**
     * Creates the codec for converting LocationAreaDetailPokemonEncountersInner from and to JSON.
     */
    implicit val decoder: Decoder[LocationAreaDetailPokemonEncountersInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationAreaDetailPokemonEncountersInner] = deriveEncoder
}
