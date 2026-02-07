package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedLocationSummaryList._

case class PaginatedLocationSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[LocationSummary]])

object PaginatedLocationSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedLocationSummaryListCodecJson: CodecJson[PaginatedLocationSummaryList] = CodecJson.derive[PaginatedLocationSummaryList]
  implicit val PaginatedLocationSummaryListDecoder: EntityDecoder[PaginatedLocationSummaryList] = jsonOf[PaginatedLocationSummaryList]
  implicit val PaginatedLocationSummaryListEncoder: EntityEncoder[PaginatedLocationSummaryList] = jsonEncoderOf[PaginatedLocationSummaryList]
}
