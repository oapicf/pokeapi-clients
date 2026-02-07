package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.ItemAttributeDescription
import org.openapitools.models.ItemAttributeName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param descriptions 
 * @param items 
 * @param names 
 */
case class ItemAttributeDetail(id: Int,
                name: String,
                descriptions: Seq[ItemAttributeDescription],
                items: Seq[AbilityDetailPokemonInnerPokemon],
                names: Seq[ItemAttributeName]
                )

object ItemAttributeDetail {
    /**
     * Creates the codec for converting ItemAttributeDetail from and to JSON.
     */
    implicit val decoder: Decoder[ItemAttributeDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemAttributeDetail] = deriveEncoder
}
