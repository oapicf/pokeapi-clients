package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PokedexSummary

/**
 * 
 * @param entryUnderscorenumber 
 * @param pokedex 
 */
case class PokemonDexEntry(entryUnderscorenumber: Int,
                pokedex: PokedexSummary
                )

object PokemonDexEntry {
    /**
     * Creates the codec for converting PokemonDexEntry from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDexEntry] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDexEntry] = deriveEncoder
}
