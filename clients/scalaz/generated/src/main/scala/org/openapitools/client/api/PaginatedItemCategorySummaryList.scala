package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedItemCategorySummaryList._

case class PaginatedItemCategorySummaryList (
  /* The total number of resources available from this API. */
  count: Integer,
/* The URL for the next page in the list, or null if there is no next page. */
  next: Option[URI],
/* The URL for the previous page in the list, or null if there is no previous page. */
  previous: Option[URI],
/* A list of API resources on this page. */
  results: List[ItemCategorySummary])

object PaginatedItemCategorySummaryList {
  import DateTimeCodecs._

  implicit val PaginatedItemCategorySummaryListCodecJson: CodecJson[PaginatedItemCategorySummaryList] = CodecJson.derive[PaginatedItemCategorySummaryList]
  implicit val PaginatedItemCategorySummaryListDecoder: EntityDecoder[PaginatedItemCategorySummaryList] = jsonOf[PaginatedItemCategorySummaryList]
  implicit val PaginatedItemCategorySummaryListEncoder: EntityEncoder[PaginatedItemCategorySummaryList] = jsonEncoderOf[PaginatedItemCategorySummaryList]
}
