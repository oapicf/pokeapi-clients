package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedBerrySummaryList._

case class PaginatedBerrySummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[BerrySummary]])

object PaginatedBerrySummaryList {
  import DateTimeCodecs._

  implicit val PaginatedBerrySummaryListCodecJson: CodecJson[PaginatedBerrySummaryList] = CodecJson.derive[PaginatedBerrySummaryList]
  implicit val PaginatedBerrySummaryListDecoder: EntityDecoder[PaginatedBerrySummaryList] = jsonOf[PaginatedBerrySummaryList]
  implicit val PaginatedBerrySummaryListEncoder: EntityEncoder[PaginatedBerrySummaryList] = jsonEncoderOf[PaginatedBerrySummaryList]
}
