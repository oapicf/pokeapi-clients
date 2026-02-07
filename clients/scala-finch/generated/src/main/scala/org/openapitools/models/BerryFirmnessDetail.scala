package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BerryFirmnessName
import org.openapitools.models.BerrySummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param berries 
 * @param names 
 */
case class BerryFirmnessDetail(id: Int,
                name: String,
                berries: Seq[BerrySummary],
                names: Seq[BerryFirmnessName]
                )

object BerryFirmnessDetail {
    /**
     * Creates the codec for converting BerryFirmnessDetail from and to JSON.
     */
    implicit val decoder: Decoder[BerryFirmnessDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[BerryFirmnessDetail] = deriveEncoder
}
