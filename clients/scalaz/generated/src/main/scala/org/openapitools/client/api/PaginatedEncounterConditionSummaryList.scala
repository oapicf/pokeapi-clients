package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedEncounterConditionSummaryList._

case class PaginatedEncounterConditionSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[EncounterConditionSummary]])

object PaginatedEncounterConditionSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedEncounterConditionSummaryListCodecJson: CodecJson[PaginatedEncounterConditionSummaryList] = CodecJson.derive[PaginatedEncounterConditionSummaryList]
  implicit val PaginatedEncounterConditionSummaryListDecoder: EntityDecoder[PaginatedEncounterConditionSummaryList] = jsonOf[PaginatedEncounterConditionSummaryList]
  implicit val PaginatedEncounterConditionSummaryListEncoder: EntityEncoder[PaginatedEncounterConditionSummaryList] = jsonEncoderOf[PaginatedEncounterConditionSummaryList]
}
