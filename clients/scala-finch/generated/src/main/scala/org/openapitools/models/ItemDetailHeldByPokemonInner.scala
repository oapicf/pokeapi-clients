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
 * @param pokemon 
 * @param versionMinusdetails 
 */
case class ItemDetailHeldByPokemonInner(pokemon: AbilityDetailPokemonInnerPokemon,
                versionMinusdetails: Seq[ItemDetailHeldByPokemonInnerVersionDetailsInner]
                )

object ItemDetailHeldByPokemonInner {
    /**
     * Creates the codec for converting ItemDetailHeldByPokemonInner from and to JSON.
     */
    implicit val decoder: Decoder[ItemDetailHeldByPokemonInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemDetailHeldByPokemonInner] = deriveEncoder
}
