package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param genus 
 * @param language 
 */
case class PokemonSpeciesDetailGeneraInner(genus: String,
                language: AbilityDetailPokemonInnerPokemon
                )

object PokemonSpeciesDetailGeneraInner {
    /**
     * Creates the codec for converting PokemonSpeciesDetailGeneraInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonSpeciesDetailGeneraInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonSpeciesDetailGeneraInner] = deriveEncoder
}
