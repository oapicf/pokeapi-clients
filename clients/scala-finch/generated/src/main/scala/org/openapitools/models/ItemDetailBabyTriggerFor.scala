package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param url 
 */
case class ItemDetailBabyTriggerFor(url: URI
                )

object ItemDetailBabyTriggerFor {
    /**
     * Creates the codec for converting ItemDetailBabyTriggerFor from and to JSON.
     */
    implicit val decoder: Decoder[ItemDetailBabyTriggerFor] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemDetailBabyTriggerFor] = deriveEncoder
}
