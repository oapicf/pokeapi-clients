package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.MoveMetaAilmentName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param moves 
 * @param names 
 */
case class MoveMetaAilmentDetail(id: Int,
                name: String,
                moves: Seq[AbilityDetailPokemonInnerPokemon],
                names: Seq[MoveMetaAilmentName]
                )

object MoveMetaAilmentDetail {
    /**
     * Creates the codec for converting MoveMetaAilmentDetail from and to JSON.
     */
    implicit val decoder: Decoder[MoveMetaAilmentDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveMetaAilmentDetail] = deriveEncoder
}
