package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedMoveMetaAilmentSummaryList._

case class PaginatedMoveMetaAilmentSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[MoveMetaAilmentSummary]])

object PaginatedMoveMetaAilmentSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedMoveMetaAilmentSummaryListCodecJson: CodecJson[PaginatedMoveMetaAilmentSummaryList] = CodecJson.derive[PaginatedMoveMetaAilmentSummaryList]
  implicit val PaginatedMoveMetaAilmentSummaryListDecoder: EntityDecoder[PaginatedMoveMetaAilmentSummaryList] = jsonOf[PaginatedMoveMetaAilmentSummaryList]
  implicit val PaginatedMoveMetaAilmentSummaryListEncoder: EntityEncoder[PaginatedMoveMetaAilmentSummaryList] = jsonEncoderOf[PaginatedMoveMetaAilmentSummaryList]
}
