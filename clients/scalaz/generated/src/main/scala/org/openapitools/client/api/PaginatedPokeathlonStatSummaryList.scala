package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedPokeathlonStatSummaryList._

case class PaginatedPokeathlonStatSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[PokeathlonStatSummary]])

object PaginatedPokeathlonStatSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedPokeathlonStatSummaryListCodecJson: CodecJson[PaginatedPokeathlonStatSummaryList] = CodecJson.derive[PaginatedPokeathlonStatSummaryList]
  implicit val PaginatedPokeathlonStatSummaryListDecoder: EntityDecoder[PaginatedPokeathlonStatSummaryList] = jsonOf[PaginatedPokeathlonStatSummaryList]
  implicit val PaginatedPokeathlonStatSummaryListEncoder: EntityEncoder[PaginatedPokeathlonStatSummaryList] = jsonEncoderOf[PaginatedPokeathlonStatSummaryList]
}
