package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedItemFlingEffectSummaryList._

case class PaginatedItemFlingEffectSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[ItemFlingEffectSummary]])

object PaginatedItemFlingEffectSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedItemFlingEffectSummaryListCodecJson: CodecJson[PaginatedItemFlingEffectSummaryList] = CodecJson.derive[PaginatedItemFlingEffectSummaryList]
  implicit val PaginatedItemFlingEffectSummaryListDecoder: EntityDecoder[PaginatedItemFlingEffectSummaryList] = jsonOf[PaginatedItemFlingEffectSummaryList]
  implicit val PaginatedItemFlingEffectSummaryListEncoder: EntityEncoder[PaginatedItemFlingEffectSummaryList] = jsonEncoderOf[PaginatedItemFlingEffectSummaryList]
}
