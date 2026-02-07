package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Experience
import org.openapitools.models.GrowthRateDescription
import org.openapitools.models.PokemonSpeciesSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param formula 
 * @param descriptions 
 * @param levels 
 * @param pokemonUnderscorespecies 
 */
case class GrowthRateDetail(id: Int,
                name: String,
                formula: String,
                descriptions: Seq[GrowthRateDescription],
                levels: Seq[Experience],
                pokemonUnderscorespecies: Seq[PokemonSpeciesSummary]
                )

object GrowthRateDetail {
    /**
     * Creates the codec for converting GrowthRateDetail from and to JSON.
     */
    implicit val decoder: Decoder[GrowthRateDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[GrowthRateDetail] = deriveEncoder
}
