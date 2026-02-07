package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedGrowthRateSummaryList._

case class PaginatedGrowthRateSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[GrowthRateSummary]])

object PaginatedGrowthRateSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedGrowthRateSummaryListCodecJson: CodecJson[PaginatedGrowthRateSummaryList] = CodecJson.derive[PaginatedGrowthRateSummaryList]
  implicit val PaginatedGrowthRateSummaryListDecoder: EntityDecoder[PaginatedGrowthRateSummaryList] = jsonOf[PaginatedGrowthRateSummaryList]
  implicit val PaginatedGrowthRateSummaryListEncoder: EntityEncoder[PaginatedGrowthRateSummaryList] = jsonEncoderOf[PaginatedGrowthRateSummaryList]
}
