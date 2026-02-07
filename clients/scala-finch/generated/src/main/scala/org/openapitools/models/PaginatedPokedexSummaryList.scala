package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI
import org.openapitools.models.PokedexSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param count 
 * @param next 
 * @param previous 
 * @param results 
 */
case class PaginatedPokedexSummaryList(count: Option[Int],
                next: Option[URI],
                previous: Option[URI],
                results: Option[Seq[PokedexSummary]]
                )

object PaginatedPokedexSummaryList {
    /**
     * Creates the codec for converting PaginatedPokedexSummaryList from and to JSON.
     */
    implicit val decoder: Decoder[PaginatedPokedexSummaryList] = deriveDecoder
    implicit val encoder: ObjectEncoder[PaginatedPokedexSummaryList] = deriveEncoder
}
