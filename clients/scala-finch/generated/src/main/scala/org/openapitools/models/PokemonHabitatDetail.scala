package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PokemonHabitatName
import org.openapitools.models.PokemonSpeciesSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param names 
 * @param pokemonUnderscorespecies 
 */
case class PokemonHabitatDetail(id: Int,
                name: String,
                names: Seq[PokemonHabitatName],
                pokemonUnderscorespecies: Seq[PokemonSpeciesSummary]
                )

object PokemonHabitatDetail {
    /**
     * Creates the codec for converting PokemonHabitatDetail from and to JSON.
     */
    implicit val decoder: Decoder[PokemonHabitatDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonHabitatDetail] = deriveEncoder
}
