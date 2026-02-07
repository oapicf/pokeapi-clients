package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PokeathlonStatDetailAffectingNaturesDecreaseInner
import org.openapitools.models.PokeathlonStatDetailAffectingNaturesIncreaseInner
import scala.collection.immutable.Seq

/**
 * 
 * @param decrease 
 * @param increase 
 */
case class PokeathlonStatDetailAffectingNatures(decrease: Seq[PokeathlonStatDetailAffectingNaturesDecreaseInner],
                increase: Seq[PokeathlonStatDetailAffectingNaturesIncreaseInner]
                )

object PokeathlonStatDetailAffectingNatures {
    /**
     * Creates the codec for converting PokeathlonStatDetailAffectingNatures from and to JSON.
     */
    implicit val decoder: Decoder[PokeathlonStatDetailAffectingNatures] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokeathlonStatDetailAffectingNatures] = deriveEncoder
}
