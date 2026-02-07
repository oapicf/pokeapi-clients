package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemCategoryName
import org.openapitools.models.ItemPocketSummary
import org.openapitools.models.ItemSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param items 
 * @param names 
 * @param pocket 
 */
case class ItemCategoryDetail(id: Int,
                name: String,
                items: Seq[ItemSummary],
                names: Seq[ItemCategoryName],
                pocket: ItemPocketSummary
                )

object ItemCategoryDetail {
    /**
     * Creates the codec for converting ItemCategoryDetail from and to JSON.
     */
    implicit val decoder: Decoder[ItemCategoryDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemCategoryDetail] = deriveEncoder
}
