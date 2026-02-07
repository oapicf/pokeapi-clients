package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param language 
 * @param name 
 */
case class PokemonFormDetailFormNamesInner(language: AbilityDetailPokemonInnerPokemon,
                name: String
                )

object PokemonFormDetailFormNamesInner {
    /**
     * Creates the codec for converting PokemonFormDetailFormNamesInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonFormDetailFormNamesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonFormDetailFormNamesInner] = deriveEncoder
}
