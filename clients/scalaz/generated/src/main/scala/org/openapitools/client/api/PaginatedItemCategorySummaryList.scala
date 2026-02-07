package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedItemCategorySummaryList._

case class PaginatedItemCategorySummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[ItemCategorySummary]])

object PaginatedItemCategorySummaryList {
  import DateTimeCodecs._

  implicit val PaginatedItemCategorySummaryListCodecJson: CodecJson[PaginatedItemCategorySummaryList] = CodecJson.derive[PaginatedItemCategorySummaryList]
  implicit val PaginatedItemCategorySummaryListDecoder: EntityDecoder[PaginatedItemCategorySummaryList] = jsonOf[PaginatedItemCategorySummaryList]
  implicit val PaginatedItemCategorySummaryListEncoder: EntityEncoder[PaginatedItemCategorySummaryList] = jsonEncoderOf[PaginatedItemCategorySummaryList]
}
