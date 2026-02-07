package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedEggGroupSummaryList._

case class PaginatedEggGroupSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[EggGroupSummary]])

object PaginatedEggGroupSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedEggGroupSummaryListCodecJson: CodecJson[PaginatedEggGroupSummaryList] = CodecJson.derive[PaginatedEggGroupSummaryList]
  implicit val PaginatedEggGroupSummaryListDecoder: EntityDecoder[PaginatedEggGroupSummaryList] = jsonOf[PaginatedEggGroupSummaryList]
  implicit val PaginatedEggGroupSummaryListEncoder: EntityEncoder[PaginatedEggGroupSummaryList] = jsonEncoderOf[PaginatedEggGroupSummaryList]
}
