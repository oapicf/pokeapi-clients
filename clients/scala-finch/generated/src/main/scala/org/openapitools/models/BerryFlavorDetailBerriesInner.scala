package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BerryFlavorDetailBerriesInnerBerry

/**
 * 
 * @param potency 
 * @param berry 
 */
case class BerryFlavorDetailBerriesInner(potency: Int,
                berry: BerryFlavorDetailBerriesInnerBerry
                )

object BerryFlavorDetailBerriesInner {
    /**
     * Creates the codec for converting BerryFlavorDetailBerriesInner from and to JSON.
     */
    implicit val decoder: Decoder[BerryFlavorDetailBerriesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[BerryFlavorDetailBerriesInner] = deriveEncoder
}
