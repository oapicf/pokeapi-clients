package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.GenerationSummary
import org.openapitools.models.VersionSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param order 
 * @param generation 
 * @param moveUnderscorelearnUnderscoremethods 
 * @param pokedexes 
 * @param regions 
 * @param versions 
 */
case class VersionGroupDetail(id: Int,
                name: String,
                order: Option[Int],
                generation: GenerationSummary,
                moveUnderscorelearnUnderscoremethods: Seq[AbilityDetailPokemonInnerPokemon],
                pokedexes: Seq[AbilityDetailPokemonInnerPokemon],
                regions: Seq[AbilityDetailPokemonInnerPokemon],
                versions: Seq[VersionSummary]
                )

object VersionGroupDetail {
    /**
     * Creates the codec for converting VersionGroupDetail from and to JSON.
     */
    implicit val decoder: Decoder[VersionGroupDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[VersionGroupDetail] = deriveEncoder
}
