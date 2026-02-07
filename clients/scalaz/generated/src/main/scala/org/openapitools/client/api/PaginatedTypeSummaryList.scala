package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedTypeSummaryList._

case class PaginatedTypeSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[TypeSummary]])

object PaginatedTypeSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedTypeSummaryListCodecJson: CodecJson[PaginatedTypeSummaryList] = CodecJson.derive[PaginatedTypeSummaryList]
  implicit val PaginatedTypeSummaryListDecoder: EntityDecoder[PaginatedTypeSummaryList] = jsonOf[PaginatedTypeSummaryList]
  implicit val PaginatedTypeSummaryListEncoder: EntityEncoder[PaginatedTypeSummaryList] = jsonEncoderOf[PaginatedTypeSummaryList]
}
