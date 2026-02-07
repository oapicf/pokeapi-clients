package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemCategorySummary
import org.openapitools.models.ItemPocketName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param categories 
 * @param names 
 */
case class ItemPocketDetail(id: Int,
                name: String,
                categories: Seq[ItemCategorySummary],
                names: Seq[ItemPocketName]
                )

object ItemPocketDetail {
    /**
     * Creates the codec for converting ItemPocketDetail from and to JSON.
     */
    implicit val decoder: Decoder[ItemPocketDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemPocketDetail] = deriveEncoder
}
