package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedMoveMetaCategorySummaryList._

case class PaginatedMoveMetaCategorySummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[MoveMetaCategorySummary]])

object PaginatedMoveMetaCategorySummaryList {
  import DateTimeCodecs._

  implicit val PaginatedMoveMetaCategorySummaryListCodecJson: CodecJson[PaginatedMoveMetaCategorySummaryList] = CodecJson.derive[PaginatedMoveMetaCategorySummaryList]
  implicit val PaginatedMoveMetaCategorySummaryListDecoder: EntityDecoder[PaginatedMoveMetaCategorySummaryList] = jsonOf[PaginatedMoveMetaCategorySummaryList]
  implicit val PaginatedMoveMetaCategorySummaryListEncoder: EntityEncoder[PaginatedMoveMetaCategorySummaryList] = jsonEncoderOf[PaginatedMoveMetaCategorySummaryList]
}
