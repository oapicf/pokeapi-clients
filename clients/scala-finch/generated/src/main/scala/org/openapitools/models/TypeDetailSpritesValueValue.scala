package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param nameMinusicon 
 */
case class TypeDetailSpritesValueValue(nameMinusicon: Option[URI]
                )

object TypeDetailSpritesValueValue {
    /**
     * Creates the codec for converting TypeDetailSpritesValueValue from and to JSON.
     */
    implicit val decoder: Decoder[TypeDetailSpritesValueValue] = deriveDecoder
    implicit val encoder: ObjectEncoder[TypeDetailSpritesValueValue] = deriveEncoder
}
