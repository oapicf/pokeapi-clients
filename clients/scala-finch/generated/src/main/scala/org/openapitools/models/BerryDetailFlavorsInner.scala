package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BerryDetailFlavorsInnerFlavor

/**
 * 
 * @param potency 
 * @param flavor 
 */
case class BerryDetailFlavorsInner(potency: Int,
                flavor: BerryDetailFlavorsInnerFlavor
                )

object BerryDetailFlavorsInner {
    /**
     * Creates the codec for converting BerryDetailFlavorsInner from and to JSON.
     */
    implicit val decoder: Decoder[BerryDetailFlavorsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[BerryDetailFlavorsInner] = deriveEncoder
}
