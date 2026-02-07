package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedItemAttributeSummaryList._

case class PaginatedItemAttributeSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[ItemAttributeSummary]])

object PaginatedItemAttributeSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedItemAttributeSummaryListCodecJson: CodecJson[PaginatedItemAttributeSummaryList] = CodecJson.derive[PaginatedItemAttributeSummaryList]
  implicit val PaginatedItemAttributeSummaryListDecoder: EntityDecoder[PaginatedItemAttributeSummaryList] = jsonOf[PaginatedItemAttributeSummaryList]
  implicit val PaginatedItemAttributeSummaryListEncoder: EntityEncoder[PaginatedItemAttributeSummaryList] = jsonEncoderOf[PaginatedItemAttributeSummaryList]
}
