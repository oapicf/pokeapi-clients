package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedRegionSummaryList._

case class PaginatedRegionSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[RegionSummary]])

object PaginatedRegionSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedRegionSummaryListCodecJson: CodecJson[PaginatedRegionSummaryList] = CodecJson.derive[PaginatedRegionSummaryList]
  implicit val PaginatedRegionSummaryListDecoder: EntityDecoder[PaginatedRegionSummaryList] = jsonOf[PaginatedRegionSummaryList]
  implicit val PaginatedRegionSummaryListEncoder: EntityEncoder[PaginatedRegionSummaryList] = jsonEncoderOf[PaginatedRegionSummaryList]
}
