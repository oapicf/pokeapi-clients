package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI
import org.openapitools.models.VersionGroupSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param count 
 * @param next 
 * @param previous 
 * @param results 
 */
case class PaginatedVersionGroupSummaryList(count: Option[Int],
                next: Option[URI],
                previous: Option[URI],
                results: Option[Seq[VersionGroupSummary]]
                )

object PaginatedVersionGroupSummaryList {
    /**
     * Creates the codec for converting PaginatedVersionGroupSummaryList from and to JSON.
     */
    implicit val decoder: Decoder[PaginatedVersionGroupSummaryList] = deriveDecoder
    implicit val encoder: ObjectEncoder[PaginatedVersionGroupSummaryList] = deriveEncoder
}
