package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedGenderSummaryList._

case class PaginatedGenderSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[GenderSummary]])

object PaginatedGenderSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedGenderSummaryListCodecJson: CodecJson[PaginatedGenderSummaryList] = CodecJson.derive[PaginatedGenderSummaryList]
  implicit val PaginatedGenderSummaryListDecoder: EntityDecoder[PaginatedGenderSummaryList] = jsonOf[PaginatedGenderSummaryList]
  implicit val PaginatedGenderSummaryListEncoder: EntityEncoder[PaginatedGenderSummaryList] = jsonEncoderOf[PaginatedGenderSummaryList]
}
