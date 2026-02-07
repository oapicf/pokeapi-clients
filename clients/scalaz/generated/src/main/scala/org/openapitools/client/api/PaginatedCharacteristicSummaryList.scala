package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedCharacteristicSummaryList._

case class PaginatedCharacteristicSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[CharacteristicSummary]])

object PaginatedCharacteristicSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedCharacteristicSummaryListCodecJson: CodecJson[PaginatedCharacteristicSummaryList] = CodecJson.derive[PaginatedCharacteristicSummaryList]
  implicit val PaginatedCharacteristicSummaryListDecoder: EntityDecoder[PaginatedCharacteristicSummaryList] = jsonOf[PaginatedCharacteristicSummaryList]
  implicit val PaginatedCharacteristicSummaryListEncoder: EntityEncoder[PaginatedCharacteristicSummaryList] = jsonEncoderOf[PaginatedCharacteristicSummaryList]
}
