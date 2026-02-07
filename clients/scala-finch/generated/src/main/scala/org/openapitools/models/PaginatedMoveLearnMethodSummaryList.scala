package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI
import org.openapitools.models.MoveLearnMethodSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param count 
 * @param next 
 * @param previous 
 * @param results 
 */
case class PaginatedMoveLearnMethodSummaryList(count: Option[Int],
                next: Option[URI],
                previous: Option[URI],
                results: Option[Seq[MoveLearnMethodSummary]]
                )

object PaginatedMoveLearnMethodSummaryList {
    /**
     * Creates the codec for converting PaginatedMoveLearnMethodSummaryList from and to JSON.
     */
    implicit val decoder: Decoder[PaginatedMoveLearnMethodSummaryList] = deriveDecoder
    implicit val encoder: ObjectEncoder[PaginatedMoveLearnMethodSummaryList] = deriveEncoder
}
