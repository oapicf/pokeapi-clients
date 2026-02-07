package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LocationAreaSummary
import org.openapitools.models.LocationGameIndex
import org.openapitools.models.LocationName
import org.openapitools.models.RegionSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param region 
 * @param names 
 * @param gameUnderscoreindices 
 * @param areas 
 */
case class LocationDetail(id: Int,
                name: String,
                region: RegionSummary,
                names: Seq[LocationName],
                gameUnderscoreindices: Seq[LocationGameIndex],
                areas: Seq[LocationAreaSummary]
                )

object LocationDetail {
    /**
     * Creates the codec for converting LocationDetail from and to JSON.
     */
    implicit val decoder: Decoder[LocationDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationDetail] = deriveEncoder
}
