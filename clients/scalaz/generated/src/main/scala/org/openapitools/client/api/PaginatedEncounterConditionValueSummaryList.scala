package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedEncounterConditionValueSummaryList._

case class PaginatedEncounterConditionValueSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[EncounterConditionValueSummary]])

object PaginatedEncounterConditionValueSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedEncounterConditionValueSummaryListCodecJson: CodecJson[PaginatedEncounterConditionValueSummaryList] = CodecJson.derive[PaginatedEncounterConditionValueSummaryList]
  implicit val PaginatedEncounterConditionValueSummaryListDecoder: EntityDecoder[PaginatedEncounterConditionValueSummaryList] = jsonOf[PaginatedEncounterConditionValueSummaryList]
  implicit val PaginatedEncounterConditionValueSummaryListEncoder: EntityEncoder[PaginatedEncounterConditionValueSummaryList] = jsonEncoderOf[PaginatedEncounterConditionValueSummaryList]
}
