package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI
import org.openapitools.models.GenderSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param count 
 * @param next 
 * @param previous 
 * @param results 
 */
case class PaginatedGenderSummaryList(count: Option[Int],
                next: Option[URI],
                previous: Option[URI],
                results: Option[Seq[GenderSummary]]
                )

object PaginatedGenderSummaryList {
    /**
     * Creates the codec for converting PaginatedGenderSummaryList from and to JSON.
     */
    implicit val decoder: Decoder[PaginatedGenderSummaryList] = deriveDecoder
    implicit val encoder: ObjectEncoder[PaginatedGenderSummaryList] = deriveEncoder
}
