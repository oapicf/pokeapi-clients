package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.PokemonDetailMovesInnerVersionGroupDetailsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param move 
 * @param versionUnderscoregroupUnderscoredetails 
 */
case class PokemonDetailMovesInner(move: AbilityDetailPokemonInnerPokemon,
                versionUnderscoregroupUnderscoredetails: Seq[PokemonDetailMovesInnerVersionGroupDetailsInner]
                )

object PokemonDetailMovesInner {
    /**
     * Creates the codec for converting PokemonDetailMovesInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDetailMovesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDetailMovesInner] = deriveEncoder
}
