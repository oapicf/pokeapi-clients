package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedPokedexSummaryList._

case class PaginatedPokedexSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[PokedexSummary]])

object PaginatedPokedexSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedPokedexSummaryListCodecJson: CodecJson[PaginatedPokedexSummaryList] = CodecJson.derive[PaginatedPokedexSummaryList]
  implicit val PaginatedPokedexSummaryListDecoder: EntityDecoder[PaginatedPokedexSummaryList] = jsonOf[PaginatedPokedexSummaryList]
  implicit val PaginatedPokedexSummaryListEncoder: EntityEncoder[PaginatedPokedexSummaryList] = jsonEncoderOf[PaginatedPokedexSummaryList]
}
