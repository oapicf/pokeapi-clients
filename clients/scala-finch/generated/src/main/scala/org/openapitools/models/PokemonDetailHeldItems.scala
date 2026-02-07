package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.ItemDetailHeldByPokemonInnerVersionDetailsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param item 
 * @param versionUnderscoredetails 
 */
case class PokemonDetailHeldItems(item: AbilityDetailPokemonInnerPokemon,
                versionUnderscoredetails: Seq[ItemDetailHeldByPokemonInnerVersionDetailsInner]
                )

object PokemonDetailHeldItems {
    /**
     * Creates the codec for converting PokemonDetailHeldItems from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDetailHeldItems] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDetailHeldItems] = deriveEncoder
}
