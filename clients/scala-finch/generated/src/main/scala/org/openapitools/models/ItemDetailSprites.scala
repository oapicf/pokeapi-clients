package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param _default 
 */
case class ItemDetailSprites(_default: URI
                )

object ItemDetailSprites {
    /**
     * Creates the codec for converting ItemDetailSprites from and to JSON.
     */
    implicit val decoder: Decoder[ItemDetailSprites] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemDetailSprites] = deriveEncoder
}
