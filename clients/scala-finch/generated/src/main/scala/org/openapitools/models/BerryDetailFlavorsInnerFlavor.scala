package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param name The name of the flavor
 * @param url The URL to get more information about the flavor
 */
case class BerryDetailFlavorsInnerFlavor(name: Option[String],
                url: Option[URI]
                )

object BerryDetailFlavorsInnerFlavor {
    /**
     * Creates the codec for converting BerryDetailFlavorsInnerFlavor from and to JSON.
     */
    implicit val decoder: Decoder[BerryDetailFlavorsInnerFlavor] = deriveDecoder
    implicit val encoder: ObjectEncoder[BerryDetailFlavorsInnerFlavor] = deriveEncoder
}
