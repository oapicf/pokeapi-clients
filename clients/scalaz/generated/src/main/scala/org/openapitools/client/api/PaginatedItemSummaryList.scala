package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedItemSummaryList._

case class PaginatedItemSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[ItemSummary]])

object PaginatedItemSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedItemSummaryListCodecJson: CodecJson[PaginatedItemSummaryList] = CodecJson.derive[PaginatedItemSummaryList]
  implicit val PaginatedItemSummaryListDecoder: EntityDecoder[PaginatedItemSummaryList] = jsonOf[PaginatedItemSummaryList]
  implicit val PaginatedItemSummaryListEncoder: EntityEncoder[PaginatedItemSummaryList] = jsonEncoderOf[PaginatedItemSummaryList]
}
