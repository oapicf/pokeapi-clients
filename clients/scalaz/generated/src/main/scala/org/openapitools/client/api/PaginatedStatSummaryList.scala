package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedStatSummaryList._

case class PaginatedStatSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[StatSummary]])

object PaginatedStatSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedStatSummaryListCodecJson: CodecJson[PaginatedStatSummaryList] = CodecJson.derive[PaginatedStatSummaryList]
  implicit val PaginatedStatSummaryListDecoder: EntityDecoder[PaginatedStatSummaryList] = jsonOf[PaginatedStatSummaryList]
  implicit val PaginatedStatSummaryListEncoder: EntityEncoder[PaginatedStatSummaryList] = jsonEncoderOf[PaginatedStatSummaryList]
}
