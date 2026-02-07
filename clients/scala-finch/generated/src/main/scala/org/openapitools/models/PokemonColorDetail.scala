package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PokemonColorName
import org.openapitools.models.PokemonSpeciesSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param names 
 * @param pokemonUnderscorespecies 
 */
case class PokemonColorDetail(id: Int,
                name: String,
                names: Seq[PokemonColorName],
                pokemonUnderscorespecies: Seq[PokemonSpeciesSummary]
                )

object PokemonColorDetail {
    /**
     * Creates the codec for converting PokemonColorDetail from and to JSON.
     */
    implicit val decoder: Decoder[PokemonColorDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonColorDetail] = deriveEncoder
}
