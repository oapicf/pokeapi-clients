package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedContestTypeSummaryList._

case class PaginatedContestTypeSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[ContestTypeSummary]])

object PaginatedContestTypeSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedContestTypeSummaryListCodecJson: CodecJson[PaginatedContestTypeSummaryList] = CodecJson.derive[PaginatedContestTypeSummaryList]
  implicit val PaginatedContestTypeSummaryListDecoder: EntityDecoder[PaginatedContestTypeSummaryList] = jsonOf[PaginatedContestTypeSummaryList]
  implicit val PaginatedContestTypeSummaryListEncoder: EntityEncoder[PaginatedContestTypeSummaryList] = jsonEncoderOf[PaginatedContestTypeSummaryList]
}
