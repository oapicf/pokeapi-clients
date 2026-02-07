package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedSuperContestEffectSummaryList._

case class PaginatedSuperContestEffectSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[SuperContestEffectSummary]])

object PaginatedSuperContestEffectSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedSuperContestEffectSummaryListCodecJson: CodecJson[PaginatedSuperContestEffectSummaryList] = CodecJson.derive[PaginatedSuperContestEffectSummaryList]
  implicit val PaginatedSuperContestEffectSummaryListDecoder: EntityDecoder[PaginatedSuperContestEffectSummaryList] = jsonOf[PaginatedSuperContestEffectSummaryList]
  implicit val PaginatedSuperContestEffectSummaryListEncoder: EntityEncoder[PaginatedSuperContestEffectSummaryList] = jsonEncoderOf[PaginatedSuperContestEffectSummaryList]
}
