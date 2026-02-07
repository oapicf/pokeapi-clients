package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.StatSummary

/**
 * 
 * @param baseUnderscorestat 
 * @param effort 
 * @param stat 
 */
case class PokemonStat(baseUnderscorestat: Int,
                effort: Int,
                stat: StatSummary
                )

object PokemonStat {
    /**
     * Creates the codec for converting PokemonStat from and to JSON.
     */
    implicit val decoder: Decoder[PokemonStat] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonStat] = deriveEncoder
}
