package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedVersionGroupSummaryList._

case class PaginatedVersionGroupSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[VersionGroupSummary]])

object PaginatedVersionGroupSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedVersionGroupSummaryListCodecJson: CodecJson[PaginatedVersionGroupSummaryList] = CodecJson.derive[PaginatedVersionGroupSummaryList]
  implicit val PaginatedVersionGroupSummaryListDecoder: EntityDecoder[PaginatedVersionGroupSummaryList] = jsonOf[PaginatedVersionGroupSummaryList]
  implicit val PaginatedVersionGroupSummaryListEncoder: EntityEncoder[PaginatedVersionGroupSummaryList] = jsonEncoderOf[PaginatedVersionGroupSummaryList]
}
