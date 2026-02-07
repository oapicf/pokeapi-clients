package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedBerryFirmnessSummaryList._

case class PaginatedBerryFirmnessSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[BerryFirmnessSummary]])

object PaginatedBerryFirmnessSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedBerryFirmnessSummaryListCodecJson: CodecJson[PaginatedBerryFirmnessSummaryList] = CodecJson.derive[PaginatedBerryFirmnessSummaryList]
  implicit val PaginatedBerryFirmnessSummaryListDecoder: EntityDecoder[PaginatedBerryFirmnessSummaryList] = jsonOf[PaginatedBerryFirmnessSummaryList]
  implicit val PaginatedBerryFirmnessSummaryListEncoder: EntityEncoder[PaginatedBerryFirmnessSummaryList] = jsonEncoderOf[PaginatedBerryFirmnessSummaryList]
}
