package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedNatureSummaryList._

case class PaginatedNatureSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[NatureSummary]])

object PaginatedNatureSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedNatureSummaryListCodecJson: CodecJson[PaginatedNatureSummaryList] = CodecJson.derive[PaginatedNatureSummaryList]
  implicit val PaginatedNatureSummaryListDecoder: EntityDecoder[PaginatedNatureSummaryList] = jsonOf[PaginatedNatureSummaryList]
  implicit val PaginatedNatureSummaryListEncoder: EntityEncoder[PaginatedNatureSummaryList] = jsonEncoderOf[PaginatedNatureSummaryList]
}
