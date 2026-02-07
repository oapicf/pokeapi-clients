package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI
import org.openapitools.models.CharacteristicSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param count 
 * @param next 
 * @param previous 
 * @param results 
 */
case class PaginatedCharacteristicSummaryList(count: Option[Int],
                next: Option[URI],
                previous: Option[URI],
                results: Option[Seq[CharacteristicSummary]]
                )

object PaginatedCharacteristicSummaryList {
    /**
     * Creates the codec for converting PaginatedCharacteristicSummaryList from and to JSON.
     */
    implicit val decoder: Decoder[PaginatedCharacteristicSummaryList] = deriveDecoder
    implicit val encoder: ObjectEncoder[PaginatedCharacteristicSummaryList] = deriveEncoder
}
