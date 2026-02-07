package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TypeDetailPokemonInnerPokemon

/**
 * 
 * @param slot 
 * @param pokemon 
 */
case class TypeDetailPokemonInner(slot: Option[Int],
                pokemon: Option[TypeDetailPokemonInnerPokemon]
                )

object TypeDetailPokemonInner {
    /**
     * Creates the codec for converting TypeDetailPokemonInner from and to JSON.
     */
    implicit val decoder: Decoder[TypeDetailPokemonInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[TypeDetailPokemonInner] = deriveEncoder
}
