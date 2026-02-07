package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner
import org.openapitools.models.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
import scala.collection.immutable.Seq

/**
 * 
 * @param encounterUnderscoredetails 
 * @param maxUnderscorechance 
 * @param version 
 */
case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner(encounterUnderscoredetails: Seq[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner],
                maxUnderscorechance: BigDecimal,
                version: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
                )

object PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner {
    /**
     * Creates the codec for converting PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner] = deriveEncoder
}
