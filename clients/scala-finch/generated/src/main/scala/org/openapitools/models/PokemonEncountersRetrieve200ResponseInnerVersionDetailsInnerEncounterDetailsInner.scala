package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner
import org.openapitools.models.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod
import scala.collection.immutable.Seq

/**
 * 
 * @param chance 
 * @param conditionUnderscorevalues 
 * @param maxUnderscorelevel 
 * @param method 
 * @param minUnderscorelevel 
 */
case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner(chance: BigDecimal,
                conditionUnderscorevalues: Seq[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner],
                maxUnderscorelevel: BigDecimal,
                method: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod,
                minUnderscorelevel: BigDecimal
                )

object PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner {
    /**
     * Creates the codec for converting PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner] = deriveEncoder
}
