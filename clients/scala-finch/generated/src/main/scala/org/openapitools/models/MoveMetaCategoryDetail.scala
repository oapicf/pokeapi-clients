package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.MoveMetaCategoryDescription
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param descriptions 
 * @param moves 
 */
case class MoveMetaCategoryDetail(id: Int,
                name: String,
                descriptions: Seq[MoveMetaCategoryDescription],
                moves: Seq[AbilityDetailPokemonInnerPokemon]
                )

object MoveMetaCategoryDetail {
    /**
     * Creates the codec for converting MoveMetaCategoryDetail from and to JSON.
     */
    implicit val decoder: Decoder[MoveMetaCategoryDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveMetaCategoryDetail] = deriveEncoder
}
