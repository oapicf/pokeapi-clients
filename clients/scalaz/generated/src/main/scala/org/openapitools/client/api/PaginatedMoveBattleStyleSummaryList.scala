package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedMoveBattleStyleSummaryList._

case class PaginatedMoveBattleStyleSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[MoveBattleStyleSummary]])

object PaginatedMoveBattleStyleSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedMoveBattleStyleSummaryListCodecJson: CodecJson[PaginatedMoveBattleStyleSummaryList] = CodecJson.derive[PaginatedMoveBattleStyleSummaryList]
  implicit val PaginatedMoveBattleStyleSummaryListDecoder: EntityDecoder[PaginatedMoveBattleStyleSummaryList] = jsonOf[PaginatedMoveBattleStyleSummaryList]
  implicit val PaginatedMoveBattleStyleSummaryListEncoder: EntityEncoder[PaginatedMoveBattleStyleSummaryList] = jsonEncoderOf[PaginatedMoveBattleStyleSummaryList]
}
