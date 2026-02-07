package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PokeathlonStatDetailAffectingNatures
import org.openapitools.models.PokeathlonStatName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param affectingUnderscorenatures 
 * @param names 
 */
case class PokeathlonStatDetail(id: Int,
                name: String,
                affectingUnderscorenatures: PokeathlonStatDetailAffectingNatures,
                names: Seq[PokeathlonStatName]
                )

object PokeathlonStatDetail {
    /**
     * Creates the codec for converting PokeathlonStatDetail from and to JSON.
     */
    implicit val decoder: Decoder[PokeathlonStatDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokeathlonStatDetail] = deriveEncoder
}
