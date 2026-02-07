package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedMoveSummaryList._

case class PaginatedMoveSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[MoveSummary]])

object PaginatedMoveSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedMoveSummaryListCodecJson: CodecJson[PaginatedMoveSummaryList] = CodecJson.derive[PaginatedMoveSummaryList]
  implicit val PaginatedMoveSummaryListDecoder: EntityDecoder[PaginatedMoveSummaryList] = jsonOf[PaginatedMoveSummaryList]
  implicit val PaginatedMoveSummaryListEncoder: EntityEncoder[PaginatedMoveSummaryList] = jsonEncoderOf[PaginatedMoveSummaryList]
}
