package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PokemonEncountersRetrieve200ResponseInnerLocationArea
import org.openapitools.models.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param locationUnderscorearea 
 * @param versionUnderscoredetails 
 */
case class PokemonEncountersRetrieve200ResponseInner(locationUnderscorearea: PokemonEncountersRetrieve200ResponseInnerLocationArea,
                versionUnderscoredetails: Seq[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner]
                )

object PokemonEncountersRetrieve200ResponseInner {
    /**
     * Creates the codec for converting PokemonEncountersRetrieve200ResponseInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonEncountersRetrieve200ResponseInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonEncountersRetrieve200ResponseInner] = deriveEncoder
}
