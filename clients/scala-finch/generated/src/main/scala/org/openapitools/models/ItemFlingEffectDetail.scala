package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemFlingEffectEffectText
import org.openapitools.models.ItemSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param effectUnderscoreentries 
 * @param items 
 */
case class ItemFlingEffectDetail(id: Int,
                name: String,
                effectUnderscoreentries: Seq[ItemFlingEffectEffectText],
                items: Seq[ItemSummary]
                )

object ItemFlingEffectDetail {
    /**
     * Creates the codec for converting ItemFlingEffectDetail from and to JSON.
     */
    implicit val decoder: Decoder[ItemFlingEffectDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemFlingEffectDetail] = deriveEncoder
}
