package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedContestEffectSummaryList._

case class PaginatedContestEffectSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[ContestEffectSummary]])

object PaginatedContestEffectSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedContestEffectSummaryListCodecJson: CodecJson[PaginatedContestEffectSummaryList] = CodecJson.derive[PaginatedContestEffectSummaryList]
  implicit val PaginatedContestEffectSummaryListDecoder: EntityDecoder[PaginatedContestEffectSummaryList] = jsonOf[PaginatedContestEffectSummaryList]
  implicit val PaginatedContestEffectSummaryListEncoder: EntityEncoder[PaginatedContestEffectSummaryList] = jsonEncoderOf[PaginatedContestEffectSummaryList]
}
