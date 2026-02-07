package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedEvolutionTriggerSummaryList._

case class PaginatedEvolutionTriggerSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[EvolutionTriggerSummary]])

object PaginatedEvolutionTriggerSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedEvolutionTriggerSummaryListCodecJson: CodecJson[PaginatedEvolutionTriggerSummaryList] = CodecJson.derive[PaginatedEvolutionTriggerSummaryList]
  implicit val PaginatedEvolutionTriggerSummaryListDecoder: EntityDecoder[PaginatedEvolutionTriggerSummaryList] = jsonOf[PaginatedEvolutionTriggerSummaryList]
  implicit val PaginatedEvolutionTriggerSummaryListEncoder: EntityEncoder[PaginatedEvolutionTriggerSummaryList] = jsonEncoderOf[PaginatedEvolutionTriggerSummaryList]
}
