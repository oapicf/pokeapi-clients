package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedItemPocketSummaryList._

case class PaginatedItemPocketSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[ItemPocketSummary]])

object PaginatedItemPocketSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedItemPocketSummaryListCodecJson: CodecJson[PaginatedItemPocketSummaryList] = CodecJson.derive[PaginatedItemPocketSummaryList]
  implicit val PaginatedItemPocketSummaryListDecoder: EntityDecoder[PaginatedItemPocketSummaryList] = jsonOf[PaginatedItemPocketSummaryList]
  implicit val PaginatedItemPocketSummaryListEncoder: EntityEncoder[PaginatedItemPocketSummaryList] = jsonEncoderOf[PaginatedItemPocketSummaryList]
}
