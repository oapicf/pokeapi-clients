package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedMoveLearnMethodSummaryList._

case class PaginatedMoveLearnMethodSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[MoveLearnMethodSummary]])

object PaginatedMoveLearnMethodSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedMoveLearnMethodSummaryListCodecJson: CodecJson[PaginatedMoveLearnMethodSummaryList] = CodecJson.derive[PaginatedMoveLearnMethodSummaryList]
  implicit val PaginatedMoveLearnMethodSummaryListDecoder: EntityDecoder[PaginatedMoveLearnMethodSummaryList] = jsonOf[PaginatedMoveLearnMethodSummaryList]
  implicit val PaginatedMoveLearnMethodSummaryListEncoder: EntityEncoder[PaginatedMoveLearnMethodSummaryList] = jsonEncoderOf[PaginatedMoveLearnMethodSummaryList]
}
