package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import PaginatedPokemonColorSummaryList._

case class PaginatedPokemonColorSummaryList (
  count: Option[Integer],
next: Option[URI],
previous: Option[URI],
results: Option[List[PokemonColorSummary]])

object PaginatedPokemonColorSummaryList {
  import DateTimeCodecs._

  implicit val PaginatedPokemonColorSummaryListCodecJson: CodecJson[PaginatedPokemonColorSummaryList] = CodecJson.derive[PaginatedPokemonColorSummaryList]
  implicit val PaginatedPokemonColorSummaryListDecoder: EntityDecoder[PaginatedPokemonColorSummaryList] = jsonOf[PaginatedPokemonColorSummaryList]
  implicit val PaginatedPokemonColorSummaryListEncoder: EntityEncoder[PaginatedPokemonColorSummaryList] = jsonEncoderOf[PaginatedPokemonColorSummaryList]
}
