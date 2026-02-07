package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedAbilitySummaryList._

case class PaginatedAbilitySummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[AbilitySummary]])

object PaginatedAbilitySummaryList {
  import DateTimeCodecs._

  implicit val PaginatedAbilitySummaryListCodecJson: CodecJson[PaginatedAbilitySummaryList] = CodecJson.derive[PaginatedAbilitySummaryList]
  implicit val PaginatedAbilitySummaryListDecoder: EntityDecoder[PaginatedAbilitySummaryList] = jsonOf[PaginatedAbilitySummaryList]
  implicit val PaginatedAbilitySummaryListEncoder: EntityEncoder[PaginatedAbilitySummaryList] = jsonEncoderOf[PaginatedAbilitySummaryList]
}
