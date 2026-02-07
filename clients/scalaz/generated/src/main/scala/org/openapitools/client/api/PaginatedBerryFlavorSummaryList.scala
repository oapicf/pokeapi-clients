package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedBerryFlavorSummaryList._

case class PaginatedBerryFlavorSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[BerryFlavorSummary]])

object PaginatedBerryFlavorSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedBerryFlavorSummaryListCodecJson: CodecJson[PaginatedBerryFlavorSummaryList] = CodecJson.derive[PaginatedBerryFlavorSummaryList]
  implicit val PaginatedBerryFlavorSummaryListDecoder: EntityDecoder[PaginatedBerryFlavorSummaryList] = jsonOf[PaginatedBerryFlavorSummaryList]
  implicit val PaginatedBerryFlavorSummaryListEncoder: EntityEncoder[PaginatedBerryFlavorSummaryList] = jsonEncoderOf[PaginatedBerryFlavorSummaryList]
}
