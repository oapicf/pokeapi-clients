package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedEncounterMethodSummaryList._

case class PaginatedEncounterMethodSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[EncounterMethodSummary]])

object PaginatedEncounterMethodSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedEncounterMethodSummaryListCodecJson: CodecJson[PaginatedEncounterMethodSummaryList] = CodecJson.derive[PaginatedEncounterMethodSummaryList]
  implicit val PaginatedEncounterMethodSummaryListDecoder: EntityDecoder[PaginatedEncounterMethodSummaryList] = jsonOf[PaginatedEncounterMethodSummaryList]
  implicit val PaginatedEncounterMethodSummaryListEncoder: EntityEncoder[PaginatedEncounterMethodSummaryList] = jsonEncoderOf[PaginatedEncounterMethodSummaryList]
}
