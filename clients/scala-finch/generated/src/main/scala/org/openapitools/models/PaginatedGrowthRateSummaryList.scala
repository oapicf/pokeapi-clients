package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI
import org.openapitools.models.GrowthRateSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param count 
 * @param next 
 * @param previous 
 * @param results 
 */
case class PaginatedGrowthRateSummaryList(count: Option[Int],
                next: Option[URI],
                previous: Option[URI],
                results: Option[Seq[GrowthRateSummary]]
                )

object PaginatedGrowthRateSummaryList {
    /**
     * Creates the codec for converting PaginatedGrowthRateSummaryList from and to JSON.
     */
    implicit val decoder: Decoder[PaginatedGrowthRateSummaryList] = deriveDecoder
    implicit val encoder: ObjectEncoder[PaginatedGrowthRateSummaryList] = deriveEncoder
}
