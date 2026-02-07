package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param entryUnderscorenumber 
 * @param pokemonUnderscorespecies 
 */
case class PokedexDetailPokemonEntriesInner(entryUnderscorenumber: Int,
                pokemonUnderscorespecies: AbilityDetailPokemonInnerPokemon
                )

object PokedexDetailPokemonEntriesInner {
    /**
     * Creates the codec for converting PokedexDetailPokemonEntriesInner from and to JSON.
     */
    implicit val decoder: Decoder[PokedexDetailPokemonEntriesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokedexDetailPokemonEntriesInner] = deriveEncoder
}
