package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LocationAreaDetailEncounterMethodRatesInner
import org.openapitools.models.LocationAreaDetailPokemonEncountersInner
import org.openapitools.models.LocationAreaName
import org.openapitools.models.LocationSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param gameUnderscoreindex 
 * @param encounterUnderscoremethodUnderscorerates 
 * @param location 
 * @param names 
 * @param pokemonUnderscoreencounters 
 */
case class LocationAreaDetail(id: Int,
                name: String,
                gameUnderscoreindex: Int,
                encounterUnderscoremethodUnderscorerates: Seq[LocationAreaDetailEncounterMethodRatesInner],
                location: LocationSummary,
                names: Seq[LocationAreaName],
                pokemonUnderscoreencounters: Seq[LocationAreaDetailPokemonEncountersInner]
                )

object LocationAreaDetail {
    /**
     * Creates the codec for converting LocationAreaDetail from and to JSON.
     */
    implicit val decoder: Decoder[LocationAreaDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationAreaDetail] = deriveEncoder
}
