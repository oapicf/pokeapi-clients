package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedLocationAreaSummaryList._

case class PaginatedLocationAreaSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[LocationAreaSummary]])

object PaginatedLocationAreaSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedLocationAreaSummaryListCodecJson: CodecJson[PaginatedLocationAreaSummaryList] = CodecJson.derive[PaginatedLocationAreaSummaryList]
  implicit val PaginatedLocationAreaSummaryListDecoder: EntityDecoder[PaginatedLocationAreaSummaryList] = jsonOf[PaginatedLocationAreaSummaryList]
  implicit val PaginatedLocationAreaSummaryListEncoder: EntityEncoder[PaginatedLocationAreaSummaryList] = jsonEncoderOf[PaginatedLocationAreaSummaryList]
}
