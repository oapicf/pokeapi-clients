package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedMoveTargetSummaryList._

case class PaginatedMoveTargetSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[MoveTargetSummary]])

object PaginatedMoveTargetSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedMoveTargetSummaryListCodecJson: CodecJson[PaginatedMoveTargetSummaryList] = CodecJson.derive[PaginatedMoveTargetSummaryList]
  implicit val PaginatedMoveTargetSummaryListDecoder: EntityDecoder[PaginatedMoveTargetSummaryList] = jsonOf[PaginatedMoveTargetSummaryList]
  implicit val PaginatedMoveTargetSummaryListEncoder: EntityEncoder[PaginatedMoveTargetSummaryList] = jsonEncoderOf[PaginatedMoveTargetSummaryList]
}
