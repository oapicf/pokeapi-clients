package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedVersionSummaryList._

case class PaginatedVersionSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[VersionSummary]])

object PaginatedVersionSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedVersionSummaryListCodecJson: CodecJson[PaginatedVersionSummaryList] = CodecJson.derive[PaginatedVersionSummaryList]
  implicit val PaginatedVersionSummaryListDecoder: EntityDecoder[PaginatedVersionSummaryList] = jsonOf[PaginatedVersionSummaryList]
  implicit val PaginatedVersionSummaryListEncoder: EntityEncoder[PaginatedVersionSummaryList] = jsonEncoderOf[PaginatedVersionSummaryList]
}
