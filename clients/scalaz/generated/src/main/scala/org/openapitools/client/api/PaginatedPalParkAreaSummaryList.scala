package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedPalParkAreaSummaryList._

case class PaginatedPalParkAreaSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[PalParkAreaSummary]])

object PaginatedPalParkAreaSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedPalParkAreaSummaryListCodecJson: CodecJson[PaginatedPalParkAreaSummaryList] = CodecJson.derive[PaginatedPalParkAreaSummaryList]
  implicit val PaginatedPalParkAreaSummaryListDecoder: EntityDecoder[PaginatedPalParkAreaSummaryList] = jsonOf[PaginatedPalParkAreaSummaryList]
  implicit val PaginatedPalParkAreaSummaryListEncoder: EntityEncoder[PaginatedPalParkAreaSummaryList] = jsonEncoderOf[PaginatedPalParkAreaSummaryList]
}
