package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param name The name of the berry
 * @param url The URL to get more information about the berry
 */
case class BerryFlavorDetailBerriesInnerBerry(name: Option[String],
                url: Option[URI]
                )

object BerryFlavorDetailBerriesInnerBerry {
    /**
     * Creates the codec for converting BerryFlavorDetailBerriesInnerBerry from and to JSON.
     */
    implicit val decoder: Decoder[BerryFlavorDetailBerriesInnerBerry] = deriveDecoder
    implicit val encoder: ObjectEncoder[BerryFlavorDetailBerriesInnerBerry] = deriveEncoder
}
