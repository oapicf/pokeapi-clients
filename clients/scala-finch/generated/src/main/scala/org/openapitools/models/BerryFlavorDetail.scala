package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BerryFlavorDetailBerriesInner
import org.openapitools.models.BerryFlavorName
import org.openapitools.models.ContestTypeSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param berries 
 * @param contestUnderscoretype 
 * @param names 
 */
case class BerryFlavorDetail(id: Int,
                name: String,
                berries: Seq[BerryFlavorDetailBerriesInner],
                contestUnderscoretype: ContestTypeSummary,
                names: Seq[BerryFlavorName]
                )

object BerryFlavorDetail {
    /**
     * Creates the codec for converting BerryFlavorDetail from and to JSON.
     */
    implicit val decoder: Decoder[BerryFlavorDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[BerryFlavorDetail] = deriveEncoder
}
