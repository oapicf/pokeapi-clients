package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param rarity 
 * @param version 
 */
case class ItemDetailHeldByPokemonInnerVersionDetailsInner(rarity: Int,
                version: AbilityDetailPokemonInnerPokemon
                )

object ItemDetailHeldByPokemonInnerVersionDetailsInner {
    /**
     * Creates the codec for converting ItemDetailHeldByPokemonInnerVersionDetailsInner from and to JSON.
     */
    implicit val decoder: Decoder[ItemDetailHeldByPokemonInnerVersionDetailsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemDetailHeldByPokemonInnerVersionDetailsInner] = deriveEncoder
}
