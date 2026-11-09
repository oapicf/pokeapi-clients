package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedPokedexSummaryList._

case class PaginatedPokedexSummaryList (
  /* The total number of resources available from this API. */
  count: Integer,
/* The URL for the next page in the list, or null if there is no next page. */
  next: Option[URI],
/* The URL for the previous page in the list, or null if there is no previous page. */
  previous: Option[URI],
/* A list of API resources on this page. */
  results: List[PokedexSummary])

object PaginatedPokedexSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedPokedexSummaryListCodecJson: CodecJson[PaginatedPokedexSummaryList] = CodecJson.derive[PaginatedPokedexSummaryList]
  implicit val PaginatedPokedexSummaryListDecoder: EntityDecoder[PaginatedPokedexSummaryList] = jsonOf[PaginatedPokedexSummaryList]
  implicit val PaginatedPokedexSummaryListEncoder: EntityEncoder[PaginatedPokedexSummaryList] = jsonEncoderOf[PaginatedPokedexSummaryList]
}
