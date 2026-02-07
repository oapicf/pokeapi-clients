package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PokemonShapeDetailAwesomeNamesInner
import org.openapitools.models.PokemonShapeDetailNamesInner
import org.openapitools.models.PokemonSpeciesSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param awesomeUnderscorenames 
 * @param names 
 * @param pokemonUnderscorespecies 
 */
case class PokemonShapeDetail(id: Int,
                name: String,
                awesomeUnderscorenames: Seq[PokemonShapeDetailAwesomeNamesInner],
                names: Seq[PokemonShapeDetailNamesInner],
                pokemonUnderscorespecies: Seq[PokemonSpeciesSummary]
                )

object PokemonShapeDetail {
    /**
     * Creates the codec for converting PokemonShapeDetail from and to JSON.
     */
    implicit val decoder: Decoder[PokemonShapeDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonShapeDetail] = deriveEncoder
}
